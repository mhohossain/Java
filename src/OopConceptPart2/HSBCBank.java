package OopConceptPart2;

public class HSBCBank implements USBank,BangladeshBank,IndiaBank {//we are achieving multipule inheritence

public void credit() {
	System.out.println("hsbc....credit");
}
public void debit()	{
	System.out.println("hsbc ....debit");
}
public void transmoney() {
	System.out.println("hsbc....transmoney");

}
public void mutulFund() {
	System.out.println("hsbc .......mutulfund");
}
public void edicationloan() {
	System.out.println("hsbc.....edicationloan");
}
public void carloan() {
	System.out.println("hsbc......carloan");
}
public void mutulFunds(){
	System.out.println("hsbc.........bdmutulfund");
}
public void personalloan() {
	System.out.println("hsbc**************personalloan");
}
public void deposit() {
	System.out.println("hsbc..............deposit");
}
public void withdrow() {
	System.out.println("hsbc................withdrow");
}
}
