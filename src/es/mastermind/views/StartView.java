package es.mastermind.views;

import es.mastermind.utils.WithConsoleView;

public class StartView extends WithConsoleView {

    public void write() {
		this.console.writeln(MessageView.TITLE.getMessage());
	}
}