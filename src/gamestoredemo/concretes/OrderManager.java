package gamestoredemo.concretes;

import gamestoredemo.abstracts.OrderService;
import gamestoredemo.entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println("Yeni sipariş eklendi.");
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipariş güncellendi.");
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipariş silindi.");
	}

}
