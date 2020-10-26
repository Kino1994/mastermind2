package es.mastermind.views.console;

import es.mastermind.controllers.PlayController;
import es.mastermind.views.Message;

public class RedoCommand extends Command {

	RedoCommand(PlayController playController) {
		super(Message.REDO_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		this.playController.redo();
	}

	@Override
	protected boolean isActive() {
		return this.playController.redoable();
	}

}