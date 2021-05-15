package application;

import java.util.Date;
import EnumEntities.OrderStatus;
import entities.EnumOrder;

public class EnumProgram {

	public static void main(String[] args) {
		
		EnumOrder order = new EnumOrder(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
