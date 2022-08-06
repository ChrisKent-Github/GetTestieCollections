package rocks.zipcode;

import org.junit.Assert;

import java.util.PriorityQueue;

public class ComparableTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void ComparableGreaterIntTest() {
        Integer one = 1;
        Integer two = 2;
        Integer zero = 0;

        Integer expected = 1;
        Integer actual = two.compareTo(one);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableLessIntTest() {
        Integer one = 1;
        Integer two = 2;
        Integer zero = 0;

        Integer expected = -1;
        Integer actual = zero.compareTo(one);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableEqualIntTest() {
        Integer one = 1;
        Integer two = 2;
        Integer zero = 0;

        Integer expected = 0;
        Integer actual = one.compareTo(one);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableGreaterStringTest() {
        String one = "one";
        String two = "two";
        String zero = "zero";
        String only = "only";
        String twin = "twin";
        String zebra = "zebra";

        Integer expected = 5;
        Integer actual = two.compareTo(one);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableLessStringTest() {
        String one = "one";
        String two = "two";
        String zero = "zero";
        String only = "only";
        String twin = "twin";
        String zebra = "zebra";

        Integer expected = -11;
        Integer actual = one.compareTo(zero);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableEqualStringTest() {
        String one = "one";
        String two = "two";
        String zero = "zero";
        String only = "only";
        String twin = "twin";
        String zebra = "zebra";

        Integer expected = 0;
        Integer actual = one.compareTo(one);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableGreaterSecondCharTest() {
        String one = "one";
        String two = "two";
        String zero = "zero";
        String only = "only";
        String twin = "twin";
        String zebra = "zebra";

        Integer expected = 16;
        Integer actual = zero.compareTo(zebra);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableGreaterSecondCharTest2() {
        String one = "one";
        String two = "two";
        String zero = "zero";
        String only = "only";
        String twin = "twin";
        String zebra = "zebra";

        Integer expected = 7;
        Integer actual = only.compareTo(one);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void ComparableGreaterSecondCharTest3() {
        String one = "one";
        String two = "two";
        String zero = "zero";
        String only = "only";
        String twin = "twin";
        String zebra = "zebra";

        Integer expected = 6;
        Integer actual = two.compareTo(twin);
        Assert.assertEquals(expected, actual);
    }
}
