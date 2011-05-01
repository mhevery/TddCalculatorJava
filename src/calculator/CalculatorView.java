package calculator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class is responsible for instantiating the model and the controller
 * and it is also responsible for delegating the events to the controller 
 * and the model. Because this class is also responsible for rendering,
 * it is essentially not unit-testable, but it is OK, because there is no 
 * application logic here, only wiring logic.
 */
public class CalculatorView {

  private static final String[] BUTTON_LABELS = { 
    "7", "8", "9", "+", 
    "4", "5", "6", "-", 
    "1", "2", "3", "*", 
    "0", ".", "=", "\u00F7", 
    "C", "\u00B1", "\u221A", "^" };

  private final JLabel displayLabel = new JLabel("", JLabel.RIGHT);

  private final CalculatorModel model;

  private final CalculatorController controller;

  public CalculatorView(CalculatorModel model, CalculatorController controller) {
    this.model = model;
    this.controller = controller;
  }

  public void materializeView(Container container) {
    container.setLayout(new BorderLayout());
    container.add(displayLabel, BorderLayout.NORTH);
    JPanel buttons = new JPanel();
    buttons.setLayout(new GridLayout(5, 4));
    container.add(buttons, BorderLayout.CENTER);
    for (int i = 0; i < BUTTON_LABELS.length; i++) {
      String label = BUTTON_LABELS[i];
      JButton button = new JButton(label);
      buttons.add(button);
      button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String key = e.getActionCommand();
          controller.push(key.charAt(0));
          updateView();
        }
      });
    }
  }

  public void updateView() {
    displayLabel.setText(model.getDisplay());
  }

}
