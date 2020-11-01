package es.mastermind.controllers;

import es.mastermind.models.Session;
import es.mastermind.utils.Console;

public abstract class InGameController extends Controller {

	Console console;

	InGameController(Console console, Session session) {
		super(session);
		this.console = console;	
	}
	
	@Override
	public void control() {
		this.inGameControl();
		if (this.session.isBoardComplete() || this.session.isWinner()) {
			this.session.next();
		}
	}

	protected abstract void inGameControl();

}