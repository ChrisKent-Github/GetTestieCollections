package rocks.zipcode;

import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TreeSetTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeSetAdd() {
        TreeSet set = new TreeSet<>();
        Person person = new Person("Chris", 1979);
        set.add(person.getName());
        assertEquals(true, set.contains("Chris")); // true
    }

    @org.junit.Test
    public void TestTreeSetRemove() {
        TreeSet set = new TreeSet<>();
        Person person = new Person("Chris", 1979);
        set.add(person.getName());
        set.remove(person.getName());
        assertEquals(false, set.contains("Chris")); // true
    }

    @org.junit.Test
    public void TestTreeSetSize() {
        TreeSet set = new TreeSet<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        Person person3 = new Person("Vin", 1967);
        Person person4 = new Person("Bradley", 1975);
        set.add(person.getName());
        set.add(person2.getName());
        set.add(person3.getName());
        set.add(person4.getName());
        set.remove(person.getName());
        assertEquals(3, set.size());
    }

    @org.junit.Test
    public void TestHashSetClear() {
        TreeSet set = new TreeSet<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        Person person3 = new Person("Vin", 1967);
        Person person4 = new Person("Bradlet", 1975);
        set.add(person.getName());
        set.add(person2.getName());
        set.add(person3.getName());
        set.add(person4.getName());
        set.clear();
        assertEquals(true, set.isEmpty());
    }
}
