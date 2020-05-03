package ArrayListDemo;

public class LargestValue {

	public static void main(String[] args) {
		int array []= {28, 12, 19, 30, 25};
		int val=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>val) {
				val=array[i];
			}
		} 
		    System.out.println("Largest value is "+val);
	}

}
