package rocks.zipcode;

import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestLinkedListAddAndOffer() {
        LinkedList<String> link = new LinkedList<>();
        Person person = new Person("Paul", 1969);
        Person person2 = new Person("Evangeline", 1979);
        Person person3 = new Person("Michael", 1944);
        Person person4 = new Person("Judy", 1975);
        Person person5 = new Person("Corey", 1976);
        Person person6 = new Person("Randall", 1974);
        link.add(person.getName());
        link.addFirst(person2.getName());
        link.offerFirst(person3.getName());
        link.addLast(person4.getName());
        link.offerLast(person5.getName());
        link.offer(person6.getName());
        assertEquals("Michael", link.get(0));
        assertEquals("Evangeline", link.get(1));
        assertEquals("Paul", link.get(2));
        assertEquals("Judy", link.get(3));
        assertEquals("Corey", link.get(4));
        assertEquals("Randall", link.get(5));
    }

    @org.junit.Test
    public void TestLinkedListSize() {
        LinkedList<String> link = new LinkedList<>();
        Person person = new Person("Paul", 1969);
        Person person2 = new Person("Evangeline", 1979);
        Person person3 = new Person("Michael", 1944);
        Person person4 = new Person("Judy", 1975);
        Person person5 = new Person("Corey", 1976);
        Person person6 = new Person("Randall", 1974);
        link.add(person.getName());
        link.addFirst(person2.getName());
        link.offerFirst(person3.getName());
        link.addLast(person4.getName());
        link.offerLast(person5.getName());
        link.offer(person6.getName());
        assertEquals(6, link.size());

    }

    @org.junit.Test
    public void TestLinkedList() {
        LinkedList<String> link = new LinkedList<>();
        Person person = new Person("Paul", 1969);
        Person person2 = new Person("Evangeline", 1979);
        Person person3 = new Person("Michael", 1944);
        Person person4 = new Person("Judy", 1975);
        Person person5 = new Person("Corey", 1976);
        Person person6 = new Person("Randall", 1974);
        link.add(person.getName());
        link.addFirst(person2.getName());
        link.offerFirst(person3.getName());
        link.addLast(person4.getName());
        link.offerLast(person5.getName());
        link.offer(person6.getName());
        assertEquals("Michael", link.get(0));
        assertEquals("Evangeline", link.element());
        assertEquals("Paul", link.poll());
        assertEquals("Judy", link.get(3));
        assertEquals("Corey", link.get(4));
        assertEquals("Randall", link.get(5));
    }
}
