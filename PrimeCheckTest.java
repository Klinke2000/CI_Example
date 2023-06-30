import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 0-t", true, PrimeCheck.isPrime(7));
    assertEquals("Test 1-t", true, PrimeCheck.isPrime(19));
    assertEquals("Test 2-t", true, PrimeCheck.isPrime(967));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 0-f", false, PrimeCheck.isPrime(8));
    assertEquals("Test 1-f", false, PrimeCheck.isPrime(50));
    assertEquals("Test 2-f", false, PrimeCheck.isPrime(1000));
  }
}
