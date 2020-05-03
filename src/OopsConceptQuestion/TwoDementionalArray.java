package OopsConceptQuestion;

public class TwoDementionalArray {

	public static void main(String[] args) {
		
		String x [][] = new String [2][3];
		//1st row
		x[0][0]="Tester";
		x[0][1]="Toni";
		x[0][2]="Araf";
		//2nd row
		x[1][0]="Hossain";
		x[1][1]="Ani";
		x[1][2]="Ara";
		
		for(int row=0; row < x.length; row++) {
			for(int col=0; col <x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}

	}

}
