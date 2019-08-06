package OopConceptPart1;

public class LocalVsGlobleVeriable1 {
	String s="Ara";//Globel Veriable is a class veriable
	int age = 9;
	
	public static void main(String[] args) {
		
		LocalVsGlobleVeriable1 lv = new LocalVsGlobleVeriable1();
		System.out.println(lv.s);
		System.out.println(lv.age);
	    lv.test();
	    int i=10;
		System.out.println(i);
		
	}
	public void test() {
		System.out.println("This is my local veriable");
	}

}
