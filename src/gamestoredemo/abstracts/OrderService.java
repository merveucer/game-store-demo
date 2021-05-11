package gamestoredemo.abstracts;

import gamestoredemo.entities.Order;

public interface OrderService {
	
	void add(Order order);
	void update(Order order);
	void delete(Order order);
	
}
