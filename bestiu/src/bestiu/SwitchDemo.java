package bestiu;

public class SwitchDemo {

	public static void main(String[] args) {
String day="tuesday";
		
		switch(day)
		{
		case "monday":
		case "Monday":
		   System.out.println("Attend the meeting");
		   break;
		   
		case "tuesday":
		case "Tuesday":
		   System.out.println("Working on the Project");
		   break;
		   
		case "Wednesday":
		case "wednesday":
		   System.out.println("Submit the progress");
		   break;
		   
		case "thursday":
		case "Thursday":
		   System.out.println("Client call and Review");
		   break;
		   
		case "friday":
		case "Friday":
		   System.out.println("Wrap up the weekly tasks");
		   break;
		   
		case "saturday":
		case "Saturday":
		case "sunday":
		case "Sunday":
		   System.out.println("Enjoy the Weekend");
		   break;
		   
		default:
			System.out.println("Invalid day");
			
	}

}
