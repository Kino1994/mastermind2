package es.mastermind.models;

import java.util.List;

public class Memento {

	private SecretCombination secretCombination;

	private List<ProposedCombination> proposedCombinations;

	private List<Result> results;

	private int attempts;

	Memento(SecretCombination secretCombination, List<ProposedCombination> proposedCombinations,
			List<Result> results, int attempts) {
		this.secretCombination = secretCombination;
		this.proposedCombinations = proposedCombinations;
		this.results = results;
		this.attempts = attempts;
	}

	SecretCombination getSecretCombination() {
		return secretCombination;
	}

	List<ProposedCombination> getProposedCombinations() {
		return proposedCombinations;
	}

	List<Result> getResults() {
		return results;
	}

	int getAttempts() {
		return attempts;
	}

}