package es.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import es.mastermind.types.Color;

public class Game {

	private static final int MAX_LONG = 10;

	private SecretCombination secretCombination;

	private List<ProposedCombination> proposedCombinations;

	private List<Result> results;

	private int attempts;

	public Game() {
		this.clear();
	}

	public void clear() {
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
		this.attempts = 0;
	}

	public void put(List<Color> colors) {
		ProposedCombination proposedCombination = new ProposedCombination(colors);
		this.proposedCombinations.add(proposedCombination);
		this.results.add(this.secretCombination.getResult(proposedCombination));
		this.attempts++;
	}

	public boolean isLooser() {
		return this.attempts == Game.MAX_LONG;
	}

	public boolean isWinner() {
		return this.results.get(this.attempts - 1).isWinner();
	}
	
	public boolean isBoardComplete() {
		return this.attempts == MAX_LONG;
	}

	public int getAttempts() {
		return this.attempts;
	}
	
	public ProposedCombination getProposedCombination() {
		return this.getCombination(proposedCombinations.size() - 1);
	}
	
	public ProposedCombination getCombination(int position) {
		return this.proposedCombinations.get(position);
	}

	public List<Color> getColors() {
		return this.proposedCombinations.get(proposedCombinations.size()-1).colors;
	}

	public int getBlacks(int position) {
		return this.results.get(position).getBlacks();
	}

	public int getWhites(int position) {
		return this.results.get(position).getWhites();
	}

	public int getWidth() {
		return Combination.getWidth();
	}
	
	public Memento createMemento() {
        return new Memento(this.secretCombination, this.proposedCombinations, this.results, this.attempts);
	}

	public void set(Memento memento) {
		this.secretCombination = memento.getSecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
		this.attempts = memento.getAttempts();
		
        for(ProposedCombination proposedCombination : memento.getProposedCombinations()){
        	this.proposedCombinations.add(proposedCombination);
        }
        
        for(Result result : memento.getResults()){
        	this.results.add(result);
        }        
    }
	
}