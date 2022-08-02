package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {

    @org.junit.Test
    public void TestArrayDequeSize() {
        ArrayDeque<Integer> deck = new ArrayDeque<>();
        Person person = new Person("Paul", 1969);
        Person person2 = new Person("Evangeline", 1979);
        Person person3 = new Person("Michael", 1944);
        deck.add(person.getYearOfBirth());
        deck.add(person2.getYearOfBirth());
        deck.add(person3.getYearOfBirth());
        assertEquals(3, deck.size());
    }

    @org.junit.Test
    public void TestArrayDequeAddPushAndOffer() {
        ArrayDeque<Integer> deck = new ArrayDeque<>();
        Person person = new Person("Paul", 1969);
        Person person2 = new Person("Evangeline", 1979);
        Person person3 = new Person("Michael", 1944);
        Person person4 = new Person("Judy", 1975);
        Person person5 = new Person("Corey", 1976);
        Person person6 = new Person("Randall", 1974);
        Person person7 = new Person("Clifford", 1980);
        deck.add(person.getYearOfBirth());
        deck.push(person2.getYearOfBirth());
        deck.addFirst(person3.getYearOfBirth());
        deck.addLast(person4.getYearOfBirth());
        deck.offer(person5.getYearOfBirth());
        deck.offerFirst(person6.getYearOfBirth());
        deck.offerLast(person7.getYearOfBirth());
//        "6,3,2,1,4,5,7"
        assertEquals((Integer) 1974, deck.getFirst());
        assertEquals((Integer) 1980, deck.getLast());
        deck.removeFirst();
        deck.removeLast();
        assertEquals((Integer) 1944, deck.getFirst());
        assertEquals((Integer) 1976, deck.getLast());
        deck.removeFirst();
        deck.removeLast();
        assertEquals((Integer) 1979, deck.getFirst());
        assertEquals((Integer) 1975, deck.getLast());
        deck.removeFirst();
        deck.removeLast();
        assertEquals((Integer) 1969, deck.getFirst());
        assertEquals((Integer) 1969, deck.getLast());
    }

    @org.junit.Test
    public void TestArrayDequeRemovePopAndPoll() {
        ArrayDeque<Integer> deck = new ArrayDeque<>();
        Person person = new Person("Paul", 1969);
        Person person2 = new Person("Evangeline", 1979);
        Person person3 = new Person("Michael", 1944);
        Person person4 = new Person("Judy", 1975);
        Person person5 = new Person("Corey", 1976);
        Person person6 = new Person("Randall", 1974);
        deck.add(person.getYearOfBirth());
        deck.add(person2.getYearOfBirth());
        deck.add(person3.getYearOfBirth());
        deck.add(person4.getYearOfBirth());
        deck.remove(person3.getYearOfBirth());
        deck.removeFirst();
        deck.removeLast();
        deck.pop();
        assertEquals(true, deck.isEmpty());
    }

    @org.junit.Test
    public void TestArrayDequeElementAndPeek() {
        ArrayDeque<Integer> deck = new ArrayDeque<>();
        Person person = new Person("Paul", 1969);
        Person person2 = new Person("Evangeline", 1979);
        Person person3 = new Person("Michael", 1944);
        Person person4 = new Person("Judy", 1975);
        Person person5 = new Person("Corey", 1976);
        Person person6 = new Person("Randall", 1974);
        deck.add(person.getYearOfBirth());
        deck.add(person2.getYearOfBirth());
        deck.add(person3.getYearOfBirth());
        deck.add(person4.getYearOfBirth());
        deck.add(person5.getYearOfBirth());
        deck.add(person6.getYearOfBirth());
        deck.
        assertEquals((Integer) 1969, deck.peek());
        assertEquals((Integer)1969, deck.peekFirst());
        assertEquals((Integer)1974, deck.peekLast());
        assertEquals((Integer)1969, deck.element());
    }
}
