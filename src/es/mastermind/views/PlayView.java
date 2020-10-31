package es.mastermind.views;

import es.mastermind.controllers.PlayController;

class PlayView {

    void interact(PlayController playController) {
		new PlayMenu(playController).execute();	
	}
}