package es.mastermind.views;

import es.mastermind.controllers.PlayController;
import es.mastermind.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	void interact(PlayController playController) {
		 new PlayMenu(playController).execute();
	}

}