package gamestoredemo.concretes;

import gamestoredemo.abstracts.CampaignService;
import gamestoredemo.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli yeni kampanya eklendi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya silindi.");
	}

}
