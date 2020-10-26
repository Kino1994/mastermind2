package es.mastermind.controllers;

import es.mastermind.models.ProposedCombination;
import es.mastermind.models.Session;

public abstract class UseCaseController {

	protected Session session;

	UseCaseController(Session session) {
		this.session = session;
	}

	public ProposedCombination getProposedCombination() {
		return this.session.getProposedCombination();
	}

}