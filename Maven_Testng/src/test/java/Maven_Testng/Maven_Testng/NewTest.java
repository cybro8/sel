package Maven_Testng.Maven_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
//Maven_Testng.Maven_Testng.NewTest
public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is my test area");
  }
  @Test
  public void g() {
	  System.out.println("this is my test area");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my test area 2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is my postconditions area");
  }

}
