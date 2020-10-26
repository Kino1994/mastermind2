package es.mastermind.controllers;

import java.util.List;

import es.mastermind.models.Session;
import es.mastermind.types.Color;

public class ActionController extends UseCaseController {

	public ActionController(Session session) {
		super(session);
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
	
	
}