package OopConceptPart1;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Execution is Strated");
		try {
		
		int i = 10/0;
		System.out.println("Divide value is "+i);
		
		}catch (ArithmeticException e){
			System.out.println("Something went wrong please cheek the "+e.getMessage());
			
      }
		finally {
			System.out.println("Ended Execution");
		}
					
 }
}