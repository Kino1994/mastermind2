package es.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import es.mastermind.models.Session;
import es.mastermind.utils.Console;
import es.mastermind.views.Command;
import es.mastermind.views.Menu;
import es.mastermind.views.PlayCommand;
import es.mastermind.views.RedoCommand;
import es.mastermind.views.UndoCommand;

public class PlayController extends Controller {

	private Map<Command, Controller> controllers;

	private PlayCommand playCommand;

	private ActionController actionController;

	private UndoCommand undoCommand;

	private UndoController undoController;

	private RedoCommand redoCommand;

	private RedoController redoController;

	private Menu menu;
    
    public PlayController(Session session) {
		super(session);
		this.controllers = new HashMap<Command, Controller>();
		this.actionController = new ActionController(new Console(),this.session);
		this.playCommand = new PlayCommand();
		this.controllers.put(this.playCommand, this.actionController);
		this.undoCommand = new UndoCommand();
		this.undoController = new UndoController(this.session);
		this.controllers.put(this.undoCommand, this.undoController);
		this.redoCommand = new RedoCommand();
		this.redoController = new RedoController(this.session);
		this.controllers.put(this.redoCommand, this.redoController);
		this.menu = new Menu(this.controllers.keySet());
	}

	@Override
	public void control() {
		this.playCommand.setActive(true);
		this.undoCommand.setActive(this.undoController.undoable());
		this.redoCommand.setActive(this.redoController.redoable());
		this.controllers.get(this.menu.execute()).control();
	}
	
}