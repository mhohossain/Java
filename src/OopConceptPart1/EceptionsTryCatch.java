package OopConceptPart1;

import java.util.InputMismatchException;

public class EceptionsTryCatch {

	public static void main(String[] args) {
		
		System.out.println("Exception is Strated");
		try {
			int a = 10/0;
			System.out.println("Dive Value is "+a);
					
        }catch(ArithmeticException e) {
        	System.out.println("Something went worng please checked the Exception "+e.getMessage());
       	    System.out.println("Seems like you have entered Zero value >0");
        }
		catch(InputMismatchException e) {
		System.out.println("Hey please enter only Integer values");
		{
			
		}
		}catch(Exception e) {
			System.out.println("Oops something went worng");
		}
							
		finally
		{
		System.out.println("finally block");
		System.out.println("Exception is Ended");
		}

}
}
	
