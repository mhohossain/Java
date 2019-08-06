package OopConceptPart1;

public class TwoDensArray {

	public static void main(String[] args) {
		
		String x [][] = new String[2][3];//two row and 3 coloum
		System.out.println(x.length);
		System.out.println(x[0].length);
		//Ist row
		x[0][0]="Tom";
		x[0][1]="hello";
		x[0][2]="Tester";
	//	2nd row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		
	System.out.println(x[0][2]);
	System.out.println(x[1][1]);
	for (int row = 0; row < x.length; row++) {
		for (int col = 0; col < x[0].length; col++) {
			System.out.println(x[row][col]);
			
		}
		
	}
		}
		
	}
		
	
	
	
		
	
		
	
		
		
		

	


