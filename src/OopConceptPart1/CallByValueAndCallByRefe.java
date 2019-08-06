package OopConceptPart1;

public class CallByValueAndCallByRefe {
	int a;
	int b;

	public static void main(String[] args) {
		CallByValueAndCallByRefe ca = new CallByValueAndCallByRefe();
		int p=10;
		int q=20;
		ca.testsum(p, p);//call by value or pass by value
		ca.testsum(10, 20);
		ca.a=50;
		ca.b=60;
		ca.swop(ca);
		//after swop		
		System.out.println(ca.a);
		System.out.println(ca.b);

	}
	public int testsum(int x,int y) {
		int z =x+y;
		return z;
		
	}
	public void swop(CallByValueAndCallByRefe t) {
		int team;
		team=t.a;//team a=50
		t.a=t.b;//team a =60
		t.b=team;//team b=50
		
		
	}

}
