package es.mastermind.views;

public class PlayCommand extends Command {

	public PlayCommand() {
		super(MessageView.PROPOSED_COMBINATION.getMessage());
	}

	@Override
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}