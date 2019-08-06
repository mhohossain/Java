package OopConceptPart2;

public class MthodOverLoading {
      
	public static void main(String[] args) {
		MthodOverLoading ml = new MthodOverLoading();
		System.out.println(ml.addnum(20, 20));
		System.out.println(ml.dividenum());
		System.out.println(ml.multinum(20, 20));
		ml.printname("Selenium", 12345);
		
		
	}
public int addnum(int val1, int val2) {
	int val3 = val1+val2;
	return val3;
		
}
public int dividenum() {
	int val1=40;
	int val2=20;
	int val3=val1/val2;
	return val3;
}
public int  multinum(int val1, int val2) {
	int val3=val1*val2;
	return val3;
			
}
public void printname(String name, int ssn) {
	System.out.println("My name is "+name+ " ssn number is "+ssn);		
}
}
