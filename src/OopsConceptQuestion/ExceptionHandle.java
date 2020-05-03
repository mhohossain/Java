package OopsConceptQuestion;

public class ExceptionHandle {

	public static void main(String[] args) {
		System.out.println("Exception is Started");
		try {
		int x=10/0;
		System.out.println("Divide value is: "+x);

	}catch(ArithmeticException e) {
		System.out.println("Something went worng please check the exception is: "+e.getMessage());
				
	}finally {
		System.out.println("Finally block");
		System.out.println("Exception is Ended");
	}

  }
 }