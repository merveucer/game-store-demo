package gamestoredemo.concretes;

import gamestoredemo.abstracts.SaleService;
import gamestoredemo.entities.Campaign;
import gamestoredemo.entities.Game;
import gamestoredemo.entities.Gamer;
import gamestoredemo.entities.Order;

public class SaleManager implements SaleService {

	@Override
	public void sale(Order order, Game game, Gamer gamer) {
		System.out.println("Toplam tutarı " + order.getTotalAmount() + "₺ olan satış başarıyla gerçekleştirildi.");
	}

	@Override
	public void sale(Order order, Game game, Gamer gamer, Campaign campaign) {
		sale(order, game, gamer);
	}

}
