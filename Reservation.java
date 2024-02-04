import java.util.Scanner;
import java.util.InputMismatchException;

class Reservation{
	public static void main(String[] args) {
		System.out.println("\t\t\t\tWelcome to Varshith Online Reservation System\n\n\t\t\tDear Customers don't worry about your Information\n\t\t\tIt is fully Secured with our Program");
		Scanner SC = new Scanner(System.in); // Scanner

		
		// =======================================================================================================================================================================//


		Person p1 = new Person(); // Instance created for Person class

		// Getting User Name
		System.out.println("Enter your Name:");
		String userName =SC.nextLine();

		try{
			p1.setuserName(userName);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			return; // Exit the program if userName is not metioned
		}


		// Getting Mobile Number
		System.out.println("Enter Your Mobile NUmber:");
		long mobileNumber = SC.nextLong();

		try{
			p1.setmobileNumber(mobileNumber);
		}catch(InputMismatchException | IllegalArgumentException e ){
			System.out.println("You have Entered Wrong Value");
			SC.nextLine();
			return;
		}
		
		// Getting No of Persons
		System.out.println("Enter No.of persons arriving");
		int noOfPersons = SC.nextInt();

		// Consume the newline character
		SC.nextLine();

		try {
		   p1.setnoOfPersons(noOfPersons);
		} catch (InputMismatchException | IllegalArgumentException e) {
			 System.out.println("You have entered the wrong value");
			 SC.nextLine();
			 return;
		}

		// Getting Date and Time
		System.out.println("Enter date and Time:");
		System.out.println("Ex: 24/04/2004 3:00PM ");
		String dateAndTime = SC.nextLine();

		try {
		    p1.setdateAndTime(dateAndTime);
		} catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
			SC.nextLine();
			return;
		}



		// =======================================================================================================================================================================//



		// Choosing dining Type

		System.out.println("Dear "+ p1.getuserName() +" Please choose the dining area from the given");

		Dining dine = new Dining();
		dine.select();

		System.out.println("Please Enter the selection");

		String Selection = SC.nextLine();
		try{
			dine.setSelection(Selection);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			SC.nextLine();
			return;
		}


		//========================================================================================================================================================================//

		System.out.println("Dear "+p1.getuserName()+" we had a Limieted Items on our menu/n/t/t But we can ensure you, those will be Extrodinary ");
		
		Food hungry = new Food();
		hungry.Availability();
		System.out.println("Please choose items according to Example\nchiXXX, MutXXX");

		String foodSelect = SC.nextLine();
		try{
			hungry.setfoodSelection(foodSelect);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			SC.nextLine();
			return;
		}


		//========================================================================================================================================================================//
		
		System.out.println();
		System.out.println();
		System.out.println("Hey "+p1.getuserName()+" Please review the data");
		System.out.println();
		System.out.println("User Name\t\t: "+p1.getuserName());
		System.out.println("Mobile Number\t\t: "+p1.getmobileNumber());
		System.out.println("No Of persons\t\t: "+p1.getnoOfPersons());
		System.out.println("Date & Time\t\t: "+p1.getDateAndTime());

		System.out.println();

		System.out.println("Dining Area\t\t: "+dine.getSelection());
		System.out.println();

		System.out.println("Selected Food Items:\n"+hungry.getfoodSelection());







		

	}
}
