package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
	public static final SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private int roomNumber;
	private Date checkin;
	private Date checkout;
	
	
	public Reservation () {
		
	}


	public Reservation(int roomNumber, Date checkin, Date checkout) {
		super();
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckin() {
		return checkin;
	}


	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}


	public Date getCheckout() {
		return checkout;
	}


	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}


	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	
	
}
