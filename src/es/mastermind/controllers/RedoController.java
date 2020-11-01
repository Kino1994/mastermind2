package es.mastermind.controllers;

import es.mastermind.models.Session;
import es.mastermind.utils.Console;

public class RedoController extends InGameController {

	RedoController(Session session) {
		super(new Console(),session);
	}

	boolean redoable() {
		return this.session.redoable();
	}

	@Override
	public void inGameControl() {
		this.session.redo();
	}

}