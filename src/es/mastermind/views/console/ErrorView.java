package es.mastermind.views.console;

import es.mastermind.types.Error;
import es.mastermind.utils.Console;

class ErrorView extends es.mastermind.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	

}
