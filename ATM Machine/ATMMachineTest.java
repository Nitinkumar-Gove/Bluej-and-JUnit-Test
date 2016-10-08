

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ATMMachineTest.
 *
 * @author  Nitinkumar Gove
 * @version 1.0
 */
public class ATMMachineTest
{
    private ATMMachine aTMMachi1;    

    /**
     * Default constructor for test class ATMMachineTest
     */
    public ATMMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        aTMMachi1 = new ATMMachine(500);
    }

    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testHasMoney()
    {
        assertEquals(true, aTMMachi1.hasMoney());
    }

    @Test
    public void testSwipe()
    {
        assertEquals(200, aTMMachi1.swipe(200));
    }

    @Test
    public void testSwipeNegative()
    {
        assertEquals(0, aTMMachi1.swipe(1500));
    }
    
    @Test
    public void testZeroSwipe()
    {
        assertEquals(0,aTMMachi1.swipe(0));
    }
}



