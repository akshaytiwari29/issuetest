

import static org.junit.Assert.*;

import org.junit.Test;

import abc.CreatingAccount;

public class LoginApplicationTests {

	@Test
    public void testLoginPage() {
        beginAt("login.jsp"); 
        assertTitleEquals("Login");
        assertLinkPresent("Succes");
        clickLink("Succes");
        assertTitleEquals("Succes");
    }
    
    @Test
    public void testIndexPage() {
        beginAt("login.jsp"); 
        assertTitleEquals("Login");
        assertLinkPresent("Error");
        clickLink("Error");
        assertTitleEquals("Error");
    }
    
   
    @Test
      public  void testInsertAccount()
      {
      CreatingAccount ca = new CreatingAccount();
      ca.createAccount("TestclassAcc1");
      
      }
   
    private void clickLink(String string) {
                    // TODO Auto-generated method stub
                    
    }
    private void assertTitleEquals(String string) {
                    // TODO Auto-generated method stub
                    
    }
    private void beginAt(String string) {
                    // TODO Auto-generated method stub
                    
    }
    private void assertLinkPresent(String string) {
                    // TODO Auto-generated method stub
                    
    }


}
