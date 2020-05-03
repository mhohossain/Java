
public class TwoDimention {

	public static void main(String[] args) {
		
		String s [][]= new String [2][3];
		
		//1st row
		s[0][0]="Selenium";
		s[0][1]="Tester";
		s[0][2]="Python";
		
		//2nd row 
		s[1][0]="Ruby";
		s[1][1]="#C";
		s[1][2]="PHP";
		
		System.out.println(s[0][1]);
		
		for(int row=0; row<s.length; row++) {
			for(int col=0; col<s[0].length; col++) {
				System.out.println(s[row][col]);
			}
			
		}

	}

}
