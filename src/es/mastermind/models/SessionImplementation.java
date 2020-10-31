package es.mastermind.models;

import java.util.List;

import es.mastermind.types.Color;

public class SessionImplementation implements Session {

private State state;
	
	private Game game;
	
	private Registry registry;
	
	public SessionImplementation() {
		this.state = new State();
		this.game = new Game();
		this.registry = new Registry(this.game);
	}
	
	public void newGame() {
		this.game.clear();
		this.state.reset();	
		this.registry.reset();
	}

	public void next() {
		this.state.next();		
    }
    
    public boolean undoable() {
		return this.registry.undoable();
	}

	public boolean redoable() {
		return this.registry.redoable();
	}

	public void undo() {
		this.registry.undo(this.game);
	}

	public void redo() {
		this.registry.redo(this.game);
    }

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public ProposedCombination getProposedCombination() {
		return this.game.getProposedCombination();
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

	public List<Color> getColors() {
		return this.game.getColors();
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
	
}