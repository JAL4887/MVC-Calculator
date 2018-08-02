
/**
 * 
 * Controller
 *
 */
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

        this.theView.addCalculateListener(new CalculateListener());
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
                fristNumber = theView.getFirstNumber;
                secondNumber = theView.getSecondNumber;
                
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.sum());
                
            }
            catch(NmberFormatException ex)
            {
                theView.distplayErrorMessage("You need to ints");
            }
            
            
        }

    }
}
