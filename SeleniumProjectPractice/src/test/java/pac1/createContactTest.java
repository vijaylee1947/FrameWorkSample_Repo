package pac1;

import org.testng.annotations.Test;

public class createContactTest {
	
	@Test
	public void createcontactTest() {
		
		String Url=System.getProperty("url");
		String Browser=System.getProperty("browser");
		String Username=System.getProperty("username");
		String Password=System.getProperty("password");
		
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
		System.out.println("execute createcontactTest");
	}
	

	@Test
	public void modifycontactTest() {
		System.out.println("execute modifycontactTest");
	}

}
