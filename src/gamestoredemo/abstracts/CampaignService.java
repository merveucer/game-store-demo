package gamestoredemo.abstracts;

import gamestoredemo.entities.Campaign;

public interface CampaignService {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	
}
