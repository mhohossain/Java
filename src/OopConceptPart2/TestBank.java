package OopConceptPart2;

public class TestBank {

	public static void main(String[] args) {
//if a class is implementing,is mendotory to define/override all the methods of interface		
		HSBCBank hb = new HSBCBank();
		System.out.println(USBank.min_bal);
		System.out.println(IndiaBank.month);
		System.out.println(BangladeshBank.name);
		hb.credit();
		hb.debit();
		hb.transmoney();
		hb.edicationloan();
		hb.carloan();
		hb.mutulFund();
		hb.mutulFunds();
		hb.personalloan();
		hb.withdrow();
		hb.deposit();
		
		System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<<");
//dynamic polymorphism
//child class object can be reffered by parent interface reference variable
		USBank ub = new HSBCBank();
		ub.credit();
		ub.debit();
		ub.transmoney();
	System.out.println("******************");
		IndiaBank ib = new HSBCBank();
		ib.deposit();
		ib.withdrow();
	System.out.println("************");
	
	    BangladeshBank bd = new HSBCBank();
	    bd.mutulFunds();
	    bd.personalloan();
	
		
			
		}
		

	}


