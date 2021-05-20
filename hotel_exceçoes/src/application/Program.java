package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check in date: ");
		Date checkInDate = sdf.parse(sc.next());
		System.out.print("Check out date:  ");
		Date checkOutDate = sdf.parse(sc.next());
		
		Reservation reservation = new Reservation (roomNumber, checkInDate, checkOutDate);
		
		System.out.println();
		System.out.println("Room number: " + reservation.getRoomNumber());
		System.out.println("Check in date: " + reservation.getCheckin());
		System.out.println("Check out date: " + reservation.getCheckout());
		
	}

}
