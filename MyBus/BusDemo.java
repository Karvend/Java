package MyBus;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BusDemo {

	public static void main(String[] args) throws NoSuchElementException{
		
	Scanner scanner = new Scanner(System.in);
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,3));
		buses.add(new Bus(3,true,4));
		
	
		boolean temp=true;
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(temp) {
			System.out.println("Enter 1 to Book and 2 to exit");
			int userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
            else if(userOpt == 2)
            {
                System.out.println("Thanks for booking.");
				temp=false;
            }
		}
        scanner.close();
	}

}