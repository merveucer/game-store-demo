package gamestoredemo.abstracts;

import gamestoredemo.entities.Game;

public interface GameService {
	
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	
}
