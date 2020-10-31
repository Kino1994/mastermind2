package es.mastermind.distributed.dispatchers;

public enum FrameType { 
	START,
	STATE,
	UNDO, 
	REDO, 
	UNDOABLE, 
	REDOABLE,
	CLOSE,
	BOARD_COMPLETE,
	ATEMPTS,
	LOOSER,
	WINNER,
	WHITES,
	BLACKS,	
	PUT_COMBINATION,
	GET_COMBINATION,
	NEW_GAME;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
