
public class ConditionalSwitchStatement {

	public static void main(String[] args) {
		
		String cityname="New York";
		
		switch(cityname) {
		
		case "Philadelphia":
			System.out.println("City of Philadelphia");
			break;
			
		case "New York":
			System.out.println("City of New York");
			break;
			
		case "Boston":
			System.out.println("City of Boston");
			break;
			
		default:
			System.out.println("City of Unknown");
		}
		
	}

}
