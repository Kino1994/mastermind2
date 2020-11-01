package es.mastermind.controllers;

import es.mastermind.models.Session;

public abstract class Controller {
    
	protected Session session;

	Controller(Session session) {
		this.session = session;
	}

	public abstract void control();
}