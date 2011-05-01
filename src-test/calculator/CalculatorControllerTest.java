package calculator;
import calculator.CalculatorController;
import calculator.CalculatorModel;
import junit.framework.TestCase;

public class CalculatorControllerTest extends TestCase {  
	public void testItShouldInitializeToZero() throws Exception {
		CalculatorModel model = new CalculatorModel();
		CalculatorController controller = new CalculatorController(model);
		controller.push('C');
		assertEquals("0.", model.getDisplay());
	}
}
