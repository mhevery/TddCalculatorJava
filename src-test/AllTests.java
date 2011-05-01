import calculator.CalculatorControllerTest;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AllTests {
  public static void main(String[] args) {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(HelloWorldTest.class);
    suite.addTestSuite(CalculatorControllerTest.class);
    TestRunner.run(suite);
  }
}
