package OopConceptPart1;

public class OverLoadingMethod {

	public static void main(String[] args) {
		OverLoadingMethod om = new OverLoadingMethod();
			om.add();
			om.add(20, 30);
   }
   public void add() {
	   int a =10;
	   int b=20;
	   int c =a+b;
	   System.out.println("Total add value is "+c);
   }
   public void add(int a, int b) {
	   int c=a+b;
	   System.out.println("Total add value is "+c);
	   
   }
	}


