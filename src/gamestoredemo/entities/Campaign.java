package gamestoredemo.entities;

import gamestoredemo.abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private int percentageOfDiscount;

	public Campaign() {

	}

	public Campaign(int id, String name, int percentageOfDiscount) {
		this.setId(id);
		this.setName(name);
		this.setPercentageOfDiscount(percentageOfDiscount);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentageOfDiscount() {
		return percentageOfDiscount;
	}

	public void setPercentageOfDiscount(int percentageOfDiscount) {
		this.percentageOfDiscount = percentageOfDiscount;
	}
	
}
