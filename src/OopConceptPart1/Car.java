package OopConceptPart1;

public class Car {
	int mod;
	int wheel;

	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2019;
		a.wheel=4;
		
		b.mod=2018;
		b.wheel=4;
		
		c.mod=2017;
		c.wheel=4;
		System.out.println("Before assigning the references");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println("After shifing the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		
			
		}
		
	}


