package OopsConceptQuestion;

public class MissingNumber {

	public static void main(String[] args) {
		//int a[]={1,2,4,5};
		//add 1+2+4+5=12
		//add missing num too 1+2+3+4+5=15
		//15-12=3
		int a[]= {1,2,4,5};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];//12						
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for (int j=1; j<=5; j++) {
			sum1 = sum1 + j;//15						
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
	  }
	   

	}


