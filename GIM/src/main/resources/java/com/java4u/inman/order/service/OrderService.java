/**
 * 
 */
package com.java4u.inman.order.service;

import java.util.Date;
import java.util.List;

import com.java4u.inman.order.bean.Order;

/**
 * @author Bharath
 *
 */
public interface OrderService {

	public List<Order> getOrdersByCustomer(Long customerId);
	public Order getOrderById(long orderId);
	public Order getOrderByName(String orderName);
	public List<Order> getOrderByDate(Date fromDate , Date toDate);
	public Order saveOrder(Order order);
	public Order updateOrder(Order order);
	public void deleteOrder(long orderId);
	
}
