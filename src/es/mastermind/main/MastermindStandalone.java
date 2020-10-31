package es.mastermind.main;

import es.mastermind.controllers.Logic;
import es.mastermind.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind {

    @Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}
	
	public static void main(String[] args) {
		new MastermindStandalone().play();
	}
    
}
