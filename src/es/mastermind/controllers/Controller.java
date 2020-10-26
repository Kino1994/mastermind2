package es.mastermind.controllers;

import es.mastermind.models.Game;
import es.mastermind.models.State;

public abstract class Controller {

	protected Game game;
	
	protected State state;

	Controller(Game game, State state) {
		this.game = game;
		this.state = state;
	}
	
	public int getWidth() {
		return this.game.getWidth();
	}

	public abstract void accept(ControllersVisitor controllersVisitor);

}
