package es.mastermind.main;

import es.mastermind.views.View;
import es.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

	protected View createView() {
		return new ConsoleView();
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}
