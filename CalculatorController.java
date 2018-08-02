
/**
 * 
 * Controller
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController
{
    // instance variables - replace the example below with your own
    private CalculatorView theView;
    private CalculatorModel theModel;

    /**
     * Constructor for the Controller
     */
    public CalculatorController(CalculatorView theView, CalculatorModel theModel)
    {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
    }

    /**
     * Inner Class
     */
    class CalculateListener implements ActionListener
    {

        public void actionPerformed(ActionEvent arg0)
        {
            int firstNumber, secondNumber = 0;
            
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setSolution(theModel.getSum());
                
            }
            catch(NumberFormatException ex)
            {
                theView.displayErrorMessage("You need to ints");
            }
            
            
        }

    }
}
