package rocks.zipcode;

import org.junit.Assert;

import java.util.PriorityQueue;

public class PriorityQueueTest {


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void PriorityQueueInitTest() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        Assert.assertEquals(true, pQueue.isEmpty());
    }

    @org.junit.Test
    public void PriorityQueueSizeTest() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(1);
        Assert.assertEquals(1, pQueue.size());
    }

    @org.junit.Test
    public void PriorityQueueClearAndElementTest() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(1);
        pQueue.add(10);
        pQueue.add(100);
        pQueue.add(1000);
        pQueue.add(10000);
        pQueue.element();
        pQueue.add(100000);
        pQueue.add(1000000);
        pQueue.add(10000000);
        pQueue.add(100000000);
        pQueue.clear();
        Assert.assertEquals(true, pQueue.isEmpty());
    }

    @org.junit.Test
    public void PriorityQueueAddAndOfferTest() {
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
        pQueue.offer(1000000000);
        Assert.assertEquals(10, pQueue.size());
    }



    @org.junit.Test
    public void PriorityQueueRemoveTest() {
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
        pQueue.remove(1);
        pQueue.poll();
        Assert.assertEquals(7, pQueue.size());

    }


}
