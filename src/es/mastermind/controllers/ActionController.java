package es.mastermind.controllers;

import java.util.List;

import es.mastermind.models.ProposedCombination;
import es.mastermind.models.Session;
import es.mastermind.models.SessionImplementation;
import es.mastermind.types.Color;

public class ActionController extends Controller {

	private SessionImplementation sessionImplementation;
    
    public ActionController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public boolean isBoardComplete() {
		return this.sessionImplementation.isBoardComplete();
	}
	
	public boolean isWinner() {
		return this.sessionImplementation.isWinner();
	}
	
	public void put(List<Color> colors) {
		this.sessionImplementation.put(colors);
	}
	
	public List<Color> getColors() {
		return this.sessionImplementation.getColors();
	}
	
	public int getAttempts() {
		return this.sessionImplementation.getAttempts();
	}
	
	public int getWidth() {
		return this.sessionImplementation.getWidth();
	}
	
	public int getBlacks(int position) {
		return this.sessionImplementation.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.sessionImplementation.getWhites(position);
	}
	
	public boolean isLooser() {
		return this.sessionImplementation.isLooser();
	}

	public ProposedCombination getProposedCombination() {
		return this.sessionImplementation.getProposedCombination();
	}
	
	
}