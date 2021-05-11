package gamestoredemo.abstracts;

import gamestoredemo.entities.Order;
import gamestoredemo.entities.Game;
import gamestoredemo.entities.Gamer;
import gamestoredemo.entities.Campaign;

public interface SaleService {
	
	void sale(Order order, Game game, Gamer gamer);
	void sale(Order order, Game game, Gamer gamer, Campaign campaign);

}
