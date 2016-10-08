
/**
 * This class models the behavior of ATM Machine
 * 
 * @author - Nitinkumar Gove
 * @version - 1.0
 */
public class ATMMachine
{
    private int total_money;

    /**
     * Constructor for objects of class ATMMachine
     */
    public ATMMachine()
    {
        // initialise instance variables
        total_money = 0;
    }
    
    public ATMMachine(int money)
    {
        this.total_money = money;
    }

    // function to check if atm has money available
    public boolean hasMoney()
    {
        if(this.total_money > 0)
            return true;
        else
            return false;
    }
    
    // function to widraw money from the atm
    public int swipe(int money)
    {
        if(money < total_money)
        {    
            System.out.println("Collect Your Cash $" + money);
            return money;
        }
        else
        {
            System.out.println("Out of Cash");
            return 0;
        }
    }
    
    // function to check total money in atm
    public int getATMBalance()
    {
        return this.total_money;
    }
    
    
}
