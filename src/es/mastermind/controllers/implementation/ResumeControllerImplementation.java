package es.mastermind.controllers.implementation;

import es.mastermind.controllers.ResumeController;
import es.mastermind.models.Session;
import es.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

	private SessionImplementation sessionImplementation;

	public ResumeControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public void resume(boolean newGame) {
		if (newGame) {
			this.sessionImplementation.newGame();
		} else {
			this.sessionImplementation.next();
		}
	}

}
