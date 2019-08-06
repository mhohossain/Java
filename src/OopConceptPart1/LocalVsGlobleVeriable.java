package OopConceptPart1;

public class LocalVsGlobleVeriable {
	//Globle variable for --class variable
     String name = "Araf";
     int age = 02;
     
  //Local var for main method    
	public static void main(String[] args) {
		int i = 10;		
		System.out.println(i);
		LocalVsGlobleVeriable lg = new LocalVsGlobleVeriable();
		System.out.println(lg.name);
		System.out.println(lg.age);
//		System.out.println(lg.sum());
		
				
	}
	//Local var for Sum method
	public void  sum() {
		int i =10;
		int m =20;
	
	}

}
