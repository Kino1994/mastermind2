package es.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import es.mastermind.models.Session;
import es.mastermind.models.StateValue;

public class Logic {

	protected Session session;
	
	protected Map<StateValue, AcceptorController> acceptorControllers;

	protected Logic() {
		this.acceptorControllers = new HashMap<StateValue, AcceptorController>();
	}
	
	public AcceptorController getController() {
		return this.acceptorControllers.get(this.session.getValueState());
	}
    
}