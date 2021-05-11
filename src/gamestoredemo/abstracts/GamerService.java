package gamestoredemo.abstracts;

import gamestoredemo.entities.Gamer;

public interface GamerService {
	
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
	
}
