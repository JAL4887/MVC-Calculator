
/**
 * 
 * Model
 *
 */
public class CalculatorModel
{
    private int sum;
    
    /**
     * method adds two numbers together
     */
    public void addTwoNumbers(int firstNumber, int secondNumber)
    {
        sum = firstNumber + secondNumber; 
    }

    /**
     * provides access to the sum
     */
    public int getSum()
    {
        return sum;
    }
}
