package entities;

import java.util.Date;

import EnumEntities.OrderStatus;

public class EnumOrder {

	private int id;
	private Date moment;
	private OrderStatus status;
	
	public EnumOrder() {
	}

	public EnumOrder(int id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EnumOrder [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
	
	
}
