package es.mastermind.controllers;

import es.mastermind.models.Session;

public class RedoController extends UseCaseController {

	RedoController(Session session) {
		super(session);
	}

	void redo() {
		this.session.redo();
	}

	boolean redoable() {
		return this.session.redoable();
	}

}