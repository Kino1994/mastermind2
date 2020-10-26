package es.mastermind.views.console;

import es.mastermind.types.Color;
import es.mastermind.utils.Console;

class ColorView extends es.mastermind.views.ColorView {

	ColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}