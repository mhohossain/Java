package OopConceptPart2;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class TestCar{
	
	
	public static void main(String[] args) {
//static polymorphism---compile-time polymorphism
		Bmw bm = new Bmw();
		bm.start();
		bm.stop();
		bm.refuel();
		bm.theftSafety();
		bm.engine();
		bm.model();
	
		System.out.println("--------------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("-----------------");
		//top casting
		Car c1 = new Bmw();	//child class object can be referred by parent class referrence variable -dinamic polymorism run time polymorism	
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		System.out.println("..............");
		
		//down casting
		 Bmw b = (Bmw)new Car();//ClassCastException: 		 
		 b.start();
		 
	}
	
}
