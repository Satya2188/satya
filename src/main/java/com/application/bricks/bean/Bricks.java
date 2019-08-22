package com.application.bricks.bean;

public class Bricks {

	private String orderId;
	private String companyName;
	private String ownerName;
	private int bricksCount;
	private int price;
	private String updateOrder;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBricksCount() {
		return bricksCount;
	}
	public void setBricksCount(int bricksCount) {
		this.bricksCount = bricksCount;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getUpdateOrder() {
		return updateOrder;
	}
	public void setUpdateOrder(String updateOrder) {
		this.updateOrder = updateOrder;
	}
	@Override
	public String toString() {
		return "Bricks [orderId=" + orderId + ", companyName=" + companyName + ", ownerName=" + ownerName
				+ ", bricksCount=" + bricksCount + ", price=" + price + ", updateOrder=" + updateOrder + "]";
	}
	
	
	
}
