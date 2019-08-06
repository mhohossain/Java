package OopConceptPart1;

public class TwoArryDe {

	public static void main(String[] args) {
		String s[][]=new String [2][3];
		//1st row
		s[0][0]="TOM";
		s[0][1]="ARAF";
		s[0][2]="ARA";
		System.out.println(s[0][2]);
		//2nd row		
		s[1][0]="A";
		s[1][1]="b";
		s[1][2]="c";
		System.out.println(s[1][1]);
		
		System.out.println("*********************");
		
		for (int row =0;row<s.length; row++) {
			for (int col=0; col<s[0].length; col++) {			
				System.out.println(s[row][col]);
				
			}
		}		
	}
}
