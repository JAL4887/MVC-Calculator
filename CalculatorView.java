
/**
 * 
 * View
 *
 */
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame
{
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionlabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculate = new JButton("Sum");
    private JTextField solution = new JTextField(10);

    /**
     * What is going to be displayed on the screen
     */
    public CalculatorView()
    {
        JPanel calculatorPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calculatorPanel.add(firstNumber);
        calculatorPanel.add(additionlabel);
        calculatorPanel.add(secondNumber);
        calculatorPanel.add(calculate);
        calculatorPanel.add(solution);

        this.add(calculatorPanel);
    }

    /**
     * gets first number for the view
     */
    public int getFirstNumber()
    {
        return Integer.parseInt(firstNumber.getText());
    }

    /**
     * gets second number for the view
     */
    public int getSecondNumber()
    {
        return Integer.parseInt(secondNumber.getText());
    }

    /**
     * gets sum for the view
     */
    public int getSolution()
    {
        return Integer.parseInt(solution.getText());
    }

    /**
     * sets value of solution
     */
    public void setSolution(int calcSolution)
    {
        solution.setText(Integer.toString(calcSolution));

    }

    /**
     * listens for the calcuate action
     */
    void addCalcuationListener(ActionListener listenForCalcButton)
    {
        calculate.addActionListener(listenerForCalcButton);

    }

    /**
     * displays error for non numerical characters
     */
    void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage); 
    }
    
}
