package calculator;

/**
 * This class represents the behavioral logic of the calculator. Its only
 * dependency is the display model. 
 * 
 * Important thing to notice is that this class has no dependencies
 * on the rendering code.
 */
public class CalculatorController {

  private final CalculatorModel model;

  public CalculatorController(CalculatorModel model) {
    this.model = model;
  }

  public void push(char charAt) {
    model.setDisplay("0.");
  }

}
