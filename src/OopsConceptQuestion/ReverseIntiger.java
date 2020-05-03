package OopsConceptQuestion;

public class ReverseIntiger {

	public static void main(String[] args) {
		
		//using algo
		int num=12345;
		int rev=0;
				
	    while(num !=0) {
		rev=rev * 10 + num % 10;
		num=num/10;
		}
		System.out.println("Reverse number is : "+rev);
		//using StringBuffer
		int num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		       
		}

	}


