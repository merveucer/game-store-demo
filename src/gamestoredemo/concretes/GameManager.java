package gamestoredemo.concretes;

import gamestoredemo.abstracts.GameService;
import gamestoredemo.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli yeni oyun eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " isimli oyun güncellendi.");		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " isimli oyun silindi.");
	}

}
