package es.mastermind.views.console;

import java.util.ArrayList;
import java.util.List;

import es.mastermind.controllers.PlayController;
import es.mastermind.types.Color;
import es.mastermind.utils.WithConsoleView;
import es.mastermind.views.MessageView;

class ProposedCombinationView extends WithConsoleView {
	
	private PlayController playController;
	
	ProposedCombinationView(PlayController playController) {
		this.playController = playController;
	}
	
	void write(int position) {
		for (Color color : this.playController.getColors(position)) {
			new ColorView(color).write();
		}
	}

	List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}
	
}