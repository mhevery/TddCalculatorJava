package calculator;

/**
 * This class represents the state of the display/application.
 * The important things to notice is that this class is easy to 
 * instantiate since it has no dependencies.
 */
public class CalculatorModel {

  private String display;

  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }
}
