package es.mastermind.controllers;

import java.util.List;

import es.mastermind.models.ProposedCombination;
import es.mastermind.models.Session;
import es.mastermind.types.Color;

public abstract class PlayController extends AcceptorController  {


    public PlayController(Session session) {
		super(session);
    }
	
	public abstract void put(List<Color> colors);
	
	public abstract List<Color> getColors();
	
	public abstract ProposedCombination getProposedCombination();
		
	public abstract int getAttempts(); 	

	public abstract int getWhites(int position);
	
	public abstract int getBlacks(int position);	
	
	public abstract boolean isLooser(); 
	
	public abstract boolean isWinner();
	
	public abstract boolean isBoardComplete();	
	
	public abstract void undo(); 	

	public abstract boolean undoable(); 	

	public abstract void redo(); 	

	public abstract boolean redoable(); 	

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);		
	}
	
}