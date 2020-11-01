package es.mastermind.controllers;

import java.util.List;

import es.mastermind.models.GameView;
import es.mastermind.models.ProposedCombination;
import es.mastermind.models.Session;
import es.mastermind.types.Color;
import es.mastermind.utils.Console;

public class ActionController extends InGameController {
	
	private GameView gameView;

	public ActionController(Console console, Session session) {
		super(console,session);
		this.gameView = new GameView(console, session);
	}

	public boolean isBoardComplete() {
		return this.session.isBoardComplete();
	}
	
	public boolean isWinner() {
		return this.session.isWinner();
	}
	
	public void put(List<Color> colors) {
		this.session.put(colors);
	}
	
	public ProposedCombination getProposedCombination() {
		return this.session.getProposedCombination();
	}
	
	public List<Color> getColors(int position) {
		return this.session.getColors(position);
	}
	
	public int getAttempts() {
		return this.session.getAttempts();
	}
	
	public int getWidth() {
		return this.session.getWidth();
	}
	
	public int getBlacks(int position) {
		return this.session.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.session.getWhites(position);
	}
	
	public boolean isLooser() {
		return this.session.isLooser();
	}
	
	@Override
	public void control() {
		int i = 0;
		while (!this.isBoardComplete() || !isWinner()) {
			gameView.readpProposedCOmbination();
			gameView.writeBlackAndWhites(i);
			i++;
		}
	}

	@Override
	protected void inGameControl() {
		
	}

	
}