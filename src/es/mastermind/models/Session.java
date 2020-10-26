package es.mastermind.models;

import java.util.List;

import es.mastermind.types.Color;

public class Session {

	private Game game;
	private GameRegistry registry;
	private State state;

	public Session() {
		this.state = new State();
		this.game = new Game();
		this.registry = new GameRegistry(this.game);
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public ProposedCombination getProposedCombination() {
		return this.game.getProposedCombination();
	}

	public void next() {
		this.state.next();
	}

	public void reset() {
		this.game.clear();
		this.state.reset();
	}

	public boolean isBoardComplete() {
		return this.game.isBoardComplete();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}
	
	public boolean isWinner() {
		return this.game.isWinner();
	}

	public void put(List<Color> colors) {
		this.game.put(colors);
	}

	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public int getWidth() {
		return this.game.getWidth();
	}

	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.game.getWhites(position);
	}

	public void undo() {
		this.registry.undo();
	}

	public boolean undoable() {
		return this.registry.isUndoable();
	}

	public void redo() {
		this.registry.redo();
	}

	public boolean redoable() {
		return this.registry.isRedoable();
	}

}