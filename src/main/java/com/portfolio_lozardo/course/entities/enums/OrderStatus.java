package com.portfolio_lozardo.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1, "Waiting Payment"),
	PAID(2, "Paid"),
	SHIPPED(3, "Shipped"),
	DELIVERED(4, "Delivered"),
	CANCELED(5, "Canceled");
	
	private Integer code;
	private String describe;
	
	private OrderStatus(Integer code, String describe) {
		this.code = code;
		this.describe = describe;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescribe() {
		return describe;
	}
	
	public static OrderStatus valueOf(Integer code) {
		 if(code==null) {
			 return null;
		 }
			 for(OrderStatus x : OrderStatus.values()) {
				 if(code.equals(x.getCode())) {
					 return x;
				 }
			 }
			 throw new IllegalArgumentException("Invalid OrderStatus code: " + code);
		 }
}
