package es.mastermind.controllers;

import es.mastermind.models.Session;
import es.mastermind.views.StartView;

public class StartController extends Controller {
    
    public StartController(Session session) {
		super(session);
	}

	@Override
	public void control() {
		this.session.next();
		new StartView().write();
	}
	
}