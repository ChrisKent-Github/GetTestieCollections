package rocks.zipcode;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
        public void IteratorTest() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
        Integer i = it.next();
        if(i < 10) {
            it.remove();
        }
    }
}
}
