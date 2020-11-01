package es.mastermind.controllers;

import es.mastermind.models.Session;
import es.mastermind.utils.Console;

class UndoController extends InGameController {

    UndoController(Session session) {
		super(new Console(),session);
	}

	boolean undoable() {
		return this.session.undoable();
	}

	@Override
	public void inGameControl() {
		this.session.undo();
	}
    
}