package es.mastermind.views.console;

import es.mastermind.controllers.PlayController;
import es.mastermind.utils.WithConsoleView;
import es.mastermind.views.MessageView;

public class AttemptsView extends WithConsoleView {

	private PlayController playController;

	AttemptsView(PlayController playController) {
		this.playController = playController;
	}

	void writeln() {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + this.playController.getAttempts()));
	}

}