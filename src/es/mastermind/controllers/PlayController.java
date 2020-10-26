package es.mastermind.controllers;

import java.util.List;

import es.mastermind.models.ProposedCombination;
import es.mastermind.models.Session;
import es.mastermind.types.Color;

public class PlayController extends Controller  {

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;

	public PlayController(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}

	public boolean isBoardComplete() {
		return this.actionController.isBoardComplete();
	}

	public boolean isWinner() {
		return this.actionController.isWinner();
	}

	public ProposedCombination getProposedCombination() {
		return this.actionController.getProposedCombination();
	}

	public void put(List<Color> colors) {
		this.actionController.put(colors);
	}
	
	public List<Color> getColors(int position) {
		return this.actionController.getColors(position);
	}
	
	public int getAttempts() {
		return this.actionController.getAttempts();
	}

	public int getWidth() {
		return this.actionController.getWidth();
	}
	
	public int getBlacks(int position) {
		return this.actionController.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.actionController.getWhites(position);
	}
	
	public boolean isLooser() {
		return this.actionController.isLooser();
	}
	
	public void undo() {
		this.undoController.undo();
	}

	public boolean undoable() {
		return this.undoController.undoable();
	}

	public void redo() {
		this.redoController.redo();
	}

	public boolean redoable() {
		return this.redoController.redoable();
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);		
	}
}