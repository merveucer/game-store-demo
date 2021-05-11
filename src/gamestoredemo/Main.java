package gamestoredemo;

import java.time.LocalDate;

import gamestoredemo.adapters.MernisServiceAdapter;
import gamestoredemo.concretes.CampaignManager;
import gamestoredemo.concretes.GameManager;
import gamestoredemo.concretes.GamerCheckManager;
import gamestoredemo.concretes.GamerManager;
import gamestoredemo.concretes.OrderManager;
import gamestoredemo.concretes.SaleManager;
import gamestoredemo.entities.Campaign;
import gamestoredemo.entities.Game;
import gamestoredemo.entities.Gamer;
import gamestoredemo.entities.Order;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game
				(1, "Oyun 1", 350);
		Gamer gamer = new Gamer
				(1, "merveucer08@gmail.com", "12345", "Merve", "Üçer", LocalDate.of(1900, 1, 1), "11111111111");
		Campaign campaign = new Campaign
				(1, "Bahar", 20);
		Order order = new Order
				(1, game.getId(), gamer.getId(), game.getPrice(), LocalDate.now());
		Order orderWithCampaign = new Order
				(1, game.getId(), gamer.getId(), game.getPrice() - (game.getPrice() * campaign.getPercentageOfDiscount() / 100), LocalDate.now());
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		GamerManager gamerManager1 = new GamerManager(new GamerCheckManager()); // Testing
		gamerManager1.add(gamer);
		GamerManager gamerManager2 = new GamerManager(new MernisServiceAdapter()); // Real Checking
		gamerManager2.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		OrderManager orderManager = new OrderManager();
		orderManager.add(order);
		orderManager.add(orderWithCampaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(order, game, gamer);
		saleManager.sale(orderWithCampaign, game, gamer, campaign);
	}

}
