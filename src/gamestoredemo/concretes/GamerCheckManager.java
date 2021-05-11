package gamestoredemo.concretes;

import gamestoredemo.abstracts.GamerCheckService;
import gamestoredemo.entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return false;
	}
	
}
