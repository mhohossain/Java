package OopsConceptQuestion;

public class MissingNumber1 {

	public static void main(String[] args) {
		//int a []= {1,2,4,5};
		//add this number 1+2+4+5=12
		//add the missing number 1+2+3+4+5=15
		//15-12=3
		
		int a[]= {1,2,4,5};
		int sum=0;
		for (int i=0; i<a.length; i++) {
			sum=sum+a[i];					
		}
		int sum1=0;
		for (int i=1; i <=5; i++) {
			sum1=sum1+i;						
		}
		System.out.println(sum1-sum);		
		
	}

}
