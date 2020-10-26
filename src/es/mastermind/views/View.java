package es.mastermind.views;

import es.mastermind.controllers.Controller;
import es.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {
	
	public void interact(Controller controller) {
		controller.accept(this);
	}

}
