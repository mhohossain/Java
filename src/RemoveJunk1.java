
public class RemoveJunk1 {

	public static void main(String[] args) {
		
		String s ="@@@@@%%%%&&&^^**Selenium****(())++++##@@$$Java";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
