package za.ac.cput.chapter2;

import org.junit.*;

/**
 * Created by student on 2015/02/11.
 */
public class smallappTest {

    runApps myApps = new runApps();

    //execute before class
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("In before class");
    }

    @Test
    public void findfloat()
    {
        //given
        float num = 1000;
        Assert.assertTrue(myApps.floatNum() == num);

    }

    @Test
    public void findInteger()
    {
        int number = 10;
        Assert.assertTrue(myApps.integerNum() == number);
        System.out.println("Integer 10 found");
    }

    @Test
    public void ObjectEquality()
    {
        Assert.assertEquals(myApps.integerNum(),10);
        System.out.print("Values are equal");
    }

    @Test
    public void testIdentity()
    {
        Assert.assertNotSame(myApps.integerNum(),12);
        System.out.print("Values are NOT equal");
    }

    @Test
    public void testTrue()
    {
        Assert.assertTrue(myApps.trueReturn());
        System.out.print("Value is true");
    }

    @Test
    public void testFalse()
    {
        Assert.assertFalse(myApps.falseReturn());
        System.out.print("Value is false");
    }

    @Test
    public void testNull()
    {
        Assert.assertNull(myApps.returnNull());
        System.out.print("Value is null");
    }

    @Test
    public void testNotNull()
    {
        Assert.assertNotNull(myApps.returnNotNull());
        System.out.print("Value is not null");
    }

    @Test(timeout=1000)
    public void timeTest() {
        double answer = myApps.integerNum();
        Assert.assertTrue(myApps.integerNum() == answer);

    }

    @Test
    public void arrTest() {
        int [] ex = {4,90,2,5,67};
        Assert.assertArrayEquals(myApps.values(),ex);

    }


    @Ignore
    public void ignoreMethod()
    {
        Assert.assertTrue("Condition is false", myApps.falseReturn());
    }







}
