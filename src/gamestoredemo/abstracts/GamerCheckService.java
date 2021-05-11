package gamestoredemo.abstracts;

import gamestoredemo.entities.Gamer;

public interface GamerCheckService {
	
	boolean checkIfRealPerson(Gamer gamer);
	
}
