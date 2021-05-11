package gamestoredemo.entities;

import java.time.LocalDate;

import gamestoredemo.abstracts.Entity;

public class Order implements Entity {
	
	private int id;
	private int gameId;
	private int gamerId;
	private double totalAmount;
	private LocalDate date;
	
	public Order() {
		
	}

	public Order(int id, int gameId, int gamerId, double totalAmount, LocalDate date) {
		this.setId(id);
		this.setGameId(gameId);
		this.setGamerId(gamerId);
		this.setTotalAmount(totalAmount);
		this.setDate(date);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
