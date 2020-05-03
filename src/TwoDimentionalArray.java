
public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		String x [][]= new String [2][3];
		//1st row
		x[0][0]="Hossain";
		x[0][1]="Ani";
		x[0][2]="Ara";
		
		//2nd row
		x[1][0]="Jhon";
		x[1][1]="Araf";
		x[1][2]="Kaka";
		
		
		for(int row=0; row<x.length; row++) {			
			for(int col=0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}

	}

}
