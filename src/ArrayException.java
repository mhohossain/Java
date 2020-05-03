
public class ArrayException {

	public static void main(String[] args) {
		
		try {
		int a []=new int [2];
		a[0]=1;
		a[1]=2;
		a[2]=3;//Array is not allowed
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Eception is handled");
			
		}
		
		
		

	}

}
