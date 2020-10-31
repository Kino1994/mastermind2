package es.mastermind.controllers;

import es.mastermind.models.Session;
import es.mastermind.models.SessionImplementation;
import es.mastermind.models.StateValue;

public abstract class Controller {
    
	protected Session session;

	Controller(Session session) {
		this.session = session;
	}
	
	public StateValue getValueState() {
		return this.session.getValueState();
	}
	
	public int getWidth() {
		SessionImplementation sessionImplementation = (SessionImplementation) session;
		return sessionImplementation.getWidth();
	}
}