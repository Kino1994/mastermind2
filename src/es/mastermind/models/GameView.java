package es.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import es.mastermind.types.Color;
import es.mastermind.utils.Console;
import es.mastermind.views.ColorView;
import es.mastermind.views.MessageView;

public class GameView {
	
	private Console console;
	private Session session;	
	
	public GameView(Console console, Session session) {
		super();
		this.console = console;
		this.session = session;
	}

	public void writeSecrerCombination() {
		for (int i = 0; i < this.session.getWidth(); i++) {
			console.write(MessageView.SECRET.getMessage());
		}
		console.writeln();
	}	
	
	public void writeBlackAndWhites(int i) {
		this.console.writeln(MessageView.RESULT.getMessage()
			.replaceFirst("#blacks", "" + this.session.getBlacks(i))
			.replaceFirst("#whites", "" + this.session.getWhites(i)));
	}
	
	public void writeColor(int position) {
		for (Color color : this.session.getColors(position)) {
			console.write(ColorView.INITIALS[color.ordinal()]);
		}
	}

	public List<Color> readpProposedCOmbination() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}
	
	public void writeAttempts() {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + this.session.getAttempts()));
	}


}
