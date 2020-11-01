package es.mastermind.main;

import java.util.HashMap;
import java.util.Map;

import es.mastermind.controllers.Controller;
import es.mastermind.controllers.PlayController;
import es.mastermind.controllers.ResumeController;
import es.mastermind.controllers.StartController;
import es.mastermind.models.Session;
import es.mastermind.models.StateValue;

public class Mastermind {

    private Session session;

	private Map<StateValue, Controller> controllers;

	public Mastermind() {
        this.session = new Session();
		this.controllers = new HashMap<StateValue, Controller>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.session));
		this.controllers.put(StateValue.IN_GAME, new PlayController(this.session));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.session));
		this.controllers.put(StateValue.EXIT, null);
    }

    void play() {
		Controller controller;
		do {
			controller = this.controllers.get(this.session.getValueState());
			if (controller != null) {
				controller.control();
			}
		} while (controller != null);
	}

    public static void main(String[] args) {
		new Mastermind().play();
	}
}