package es.mastermind.views;

import java.util.List;

import es.mastermind.controllers.PlayController;
import es.mastermind.types.Color;

public class PlayCommand extends Command {

	PlayCommand(PlayController playController) {
		super(Message.ACTION_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		if (!playController.isBoardComplete()) {
			this.put(playController);
		}
		if (playController.isWinner()) {
			Message.PLAYER_WIN.writeln();
		}
	}

	private void put(PlayController playController) {
		List<Color> colors = new ProposedCombinationView(playController).read();
		playController.put(colors);
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}