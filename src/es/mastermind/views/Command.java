package es.mastermind.views;

import es.mastermind.controllers.PlayController;

public abstract class Command extends es.mastermind.utils.Command {

	protected PlayController playController;

	protected Command(String title, PlayController playController) {
		super(title);
		this.playController = playController;
	}

}