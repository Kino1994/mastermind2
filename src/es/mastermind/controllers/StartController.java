package es.mastermind.controllers;

import es.mastermind.models.Session;

public class StartController extends Controller {

	public StartController(Session session) {
		super(session);
	}
	
	public void start() {
		this.session.next();
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}