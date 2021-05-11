package gamestoredemo.concretes;

import gamestoredemo.abstracts.GamerCheckService;
import gamestoredemo.abstracts.GamerService;
import gamestoredemo.entities.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {

		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli yeni oyuncu eklendi.");
		} else {
			System.out.println("Lütfen bilgilerinizi doğru giriniz.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu güncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli oyuncu silindi.");
	}

}
