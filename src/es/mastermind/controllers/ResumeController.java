package es.mastermind.controllers;

import es.mastermind.models.Session;

public class ResumeController extends Controller {

	public ResumeController(Session session) {
		super(session);
	}

	public void resume(boolean newGame) {
		if (newGame) {
			this.session.reset();
		} else {
			this.session.next();
		}
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}