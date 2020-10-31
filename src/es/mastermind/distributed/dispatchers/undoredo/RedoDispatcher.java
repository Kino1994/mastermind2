package es.mastermind.distributed.dispatchers.undoredo;

import es.mastermind.controllers.PlayController;
import es.mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

	public RedoDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		((PlayController)this.acceptorController).redo();
	}

}
