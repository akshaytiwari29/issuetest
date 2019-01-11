import org.junit.Test;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {

  @Test 
  public void testAddition() {
    Calculator calc = new Calculator();
    // 3 + 4 = 7
    int expected = 7;
    int actual = calc.add(3, 4);
    assertEquals("adding 3 and 4", expected, actual);
  }
  @Test
  public void testDivision() {
    Calculator calc = new Calculator();
    int expected = 2;
    int actual = calc.substract(2,0);
    assertEquals("adding 3 and 4", expected, actual);
  }

}
