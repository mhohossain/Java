package OopConceptPart1;

public class EceptionTryCatch {

	public static void main(String[] args) {
		
		System.out.println("Execution is Strated");
		try {
			int i = 10/0;
			System.out.println("Divie value is "+i);
		} catch(ArithmeticException e) {
			System.out.println("Something went worng please check the exception "+e.getMessage());
			System.out.println("Seems you have entred Zero please provided value>0");
		}
		finally
		{
			System.out.println("finally block");
			System.out.println("End");
		}
		
	   }
		   
}
	
		



