package rocks.zipcode;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class HashSetTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSetAdd() {
        HashSet set = new HashSet<>();
        Person person = new Person("Samuel", 1948);
        set.add(person.getName());
        assertEquals(true, set.contains("Samuel")); // true
    }

    @org.junit.Test
    public void TestHashSetRemove() {
        HashSet set = new HashSet<>();
        Person person = new Person("Samuel", 1948);
        set.add(person.getName());
        set.remove(person.getName());
        assertEquals(false, set.contains("Samuel")); // true
    }

    @org.junit.Test
    public void TestHashSetSize() {
        HashSet set = new HashSet<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        Person person3 = new Person("Clark", 1962);
        Person person4 = new Person("Jude", 1972);
        set.add(person.getName());
        set.add(person2.getName());
        set.add(person3.getName());
        set.add(person4.getName());
        set.remove(person.getName());
        assertEquals(3, set.size());
    }

    @org.junit.Test
    public void TestHashSetClear() {
        HashSet set = new HashSet<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        Person person3 = new Person("Clark", 1962);
        Person person4 = new Person("Jude", 1972);
        set.add(person.getName());
        set.add(person2.getName());
        set.add(person3.getName());
        set.add(person4.getName());
        set.clear();
        assertEquals(true, set.isEmpty());
    }


}
