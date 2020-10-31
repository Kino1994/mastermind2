package es.mastermind.distributed;

import es.mastermind.controllers.implementation.LogicImplementation;
import es.mastermind.distributed.dispatchers.BoardCompleteDispatcher;
import es.mastermind.distributed.dispatchers.DispatcherPrototype;
import es.mastermind.distributed.dispatchers.FrameType;
import es.mastermind.distributed.dispatchers.ResumeDispatcher;
import es.mastermind.distributed.dispatchers.StartDispatcher;
import es.mastermind.distributed.dispatchers.StateDispatcher;
import es.mastermind.distributed.dispatchers.undoredo.RedoDispatcher;
import es.mastermind.distributed.dispatchers.undoredo.RedoableDispatcher;
import es.mastermind.distributed.dispatchers.undoredo.UndoDispatcher;
import es.mastermind.distributed.dispatchers.undoredo.UndoableDispatcher;

public class LogicImplementationServer extends LogicImplementation {

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.BOARD_COMPLETE, new BoardCompleteDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
	}

}
