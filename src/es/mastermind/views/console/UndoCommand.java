package es.mastermind.views.console;

import es.mastermind.controllers.PlayController;
import es.mastermind.views.Message;

public class UndoCommand extends Command {

	UndoCommand(PlayController playController) {
		super(Message.UNDO_COMMAND.getMessage(), playController);
	}

	protected void execute() {
		this.playController.undo();
	}

	protected boolean isActive() {
		return this.playController.undoable();
	}

}