package com.model;

import java.util.List;

public class OrderCommand {
	private List<OrderItem> orderItem;
	
	public List<OrderItem> getOrderItem(){
		return orderItem;
	}
	
	public void setOrderItem(List<OrderItem> orderList) {
		this.orderItem = orderList;
	}
}
/*
주문발생 2건의 주문
1, 10, 파손주의
2, 1 , 리모컨 별도 주문

OrderCommand command = new OrderCommand();

List<OrderItem> itemlist = new ArrayList<>();
itemlist.add(new OrderItem(1,10,...)
itemlist.add(new OrderItem(2,1,...)

command.setOrderItem(itemlist);
*/