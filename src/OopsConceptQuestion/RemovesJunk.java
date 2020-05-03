package OopsConceptQuestion;

public class RemovesJunk {

	public static void main(String[] args) {
		
	//how do removes the Junk
	//to use or handle by Regular Expression ("[^a-zA-Z0-9]", "");
	String s = "@@##?? Hossain ***** Java $$$$ Selenium";
	s=s.replaceAll("[^a-zA-Z0-9]", "");
				
	String s1 = "%%%$$$@@@***((())) Selenium";
	s1=s1.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s1);
	System.out.println(s);
				
	String s2= "!!!!@@@Araf************Hossain**%";
	s2=s2.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s2);
				
	String s3="@@@hossain@@@";
	s3=s3.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s3);

	}

}
