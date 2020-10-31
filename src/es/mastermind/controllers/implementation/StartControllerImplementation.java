package es.mastermind.controllers.implementation;

import es.mastermind.controllers.StartController;
import es.mastermind.models.Session;
import es.mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

	SessionImplementation sessionImplementation;

	public StartControllerImplementation(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	@Override
	public void start() {
		this.sessionImplementation.next();		
	}

}