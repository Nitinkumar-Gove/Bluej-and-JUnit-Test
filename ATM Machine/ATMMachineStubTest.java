

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ATMMachineStubTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ATMMachineStubTest
{
    private ATMMachineStub aTMMachi1;

    /**
     * Default constructor for test class ATMMachineStubTest
     */
    public ATMMachineStubTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        aTMMachi1 = new ATMMachineStub();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testHasMoney()
    {
        assertEquals(false, aTMMachi1.hasMoney());
    }

    @Test
    public void testSwipe()
    {
        assertEquals(0, aTMMachi1.swipe(0));
    }

    @Test
    public void testGetATMBalance()
    {
        assertEquals(0, aTMMachi1.getATMBalance());
    }
}



