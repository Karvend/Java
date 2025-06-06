
import java.util.Scanner; //nested package/ hierarchical package


public class BusDemo {

	public static void main(String[] args)  {
		
		BusDAO busdao = new BusDAO();
		Scanner scanner = new Scanner(System.in);
		try {
			busdao.displayBusInfo();
			
			int userOpt = 1;

					
			while(userOpt==1) {
				System.out.println("Enter 1 to Book and 2 to exit");
				userOpt = scanner.nextInt();
				scanner.nextLine(); 
				if(userOpt == 1) {
					Booking booking = new Booking();
					if(booking.isAvailable()) {
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("Your booking is confirmed");
					}
					else
						System.out.println("Sorry. Bus is full. Try another bus or date.");
				}
			}
			scanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
