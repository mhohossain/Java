
public class FindHighestNum {

	public static void main(String[] args) {
		
		int x=600;
		int y=800;
		int z=700;
						
		if((x>y) && (x>z)) {
			System.out.println("x is the greatest");
		}
		else if((y>x) && (y>z)) {
			System.out.println("y is the greatest");
		}
		
		else {
			System.out.println("z is the greatest");
		}
	}

}
