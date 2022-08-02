package rocks.zipcode;

import java.util.PriorityQueue;

public class PriorityQueueTest {

}
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void PriorityQueueTest() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(1);
        pQueue.add(10);
        pQueue.add(100);
        pQueue.add(1000);
        pQueue.add(10000);
        pQueue.add(100000);
        pQueue.add(1000000);
        pQueue.add(10000000);
        pQueue.add(100000000);

    }
}
