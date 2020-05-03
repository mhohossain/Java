
public class ArrayEx {

	public static void main(String[] args) {
		
		try {
		int i []=new int [2];
	    i[0]=10;
	    i[1]=20;
	    i[2]=30;//should not allowed
	    
	   }catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Exception is Handle");
		   
	   }

}
}