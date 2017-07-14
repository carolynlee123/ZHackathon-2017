package model;

import java.util.Date;
import java.util.List;

public class GroupOrder {
	
	private String id;
	private String adminId;
	private String payerId;
	private double subtotal;
	private double total;
	private List<Order> orders;
	private Date createdTimestamp;
	private Date closedTimestamp;
	
	public String getAdminId() {
		return adminId;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public String getPayerId() {
		return payerId;
	}
	
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
	public double getSubtotal() {
		return subtotal;
	}
	
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	
	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	
	public Date getClosedTimestamp() {
		return closedTimestamp;
	}
	
	public void setClosedTimestamp(Date closedTimestamp) {
		this.closedTimestamp = closedTimestamp;
	}

}
