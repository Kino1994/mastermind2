package es.mastermind.controllers;

import es.mastermind.models.Session;
import es.mastermind.views.ResumeView;

public class ResumeController extends Controller {

	public ResumeController(Session session) {
		super(session);
	}

	@Override
	public void control() {
		if (session.isBoardComplete()) {
			if(new ResumeView().read()) {
				this.session.reset();
			}
			else {
				this.session.next();
			}
		}
	}

}