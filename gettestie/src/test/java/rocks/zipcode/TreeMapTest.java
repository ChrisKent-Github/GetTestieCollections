package rocks.zipcode;

import java.util.HashMap;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TreeMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeMapPut() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        tree.put(person.getName(), person.getYearOfBirth());
        assertEquals(true, tree.containsKey(person.getName())); // true
        assertEquals(true, tree.containsValue(person.getYearOfBirth())); // true
    }

    @org.junit.Test
    public void TestTreeMapPutOverwrite() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Chris", 1983);
        tree.put(person.getName(), person.getYearOfBirth());
        tree.put(person2.getName(), person2.getYearOfBirth());
        assertEquals(Integer.valueOf(1983), tree.get("Chris"));
        assertEquals(1, tree.size());
    }

    @org.junit.Test
    public void TestTreeMapSize() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        tree.put(person.getName(), person.getYearOfBirth());
        tree.put(person2.getName(), person2.getYearOfBirth());
        assertEquals(2, tree.size());
    }

    @org.junit.Test
    public void TestTreeMapClear() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        tree.put(person.getName(), person.getYearOfBirth());
        tree.put(person2.getName(), person2.getYearOfBirth());
        tree.clear();
        assertEquals(true, tree.isEmpty()); // true
    }

    @org.junit.Test
    public void TestTreeMapRemove() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        tree.put(person.getName(), person.getYearOfBirth());
        tree.put(person2.getName(), person2.getYearOfBirth());
        tree.remove(person2.getName());
        assertEquals(1, tree.size());
    }

    @org.junit.Test
    public void TestTreeMapPutIfAbsent1() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        tree.putIfAbsent(person.getName(), person.getYearOfBirth());
        tree.putIfAbsent(person2.getName(), person2.getYearOfBirth());
        assertEquals(2, tree.size());
    }

    @org.junit.Test
    public void TestTreeMapPutIfAbsent2() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Chris", 1983);
        tree.putIfAbsent(person.getName(), person.getYearOfBirth());
        tree.putIfAbsent(person2.getName(), person2.getYearOfBirth());
        assertEquals(1, tree.size());
    }

    @org.junit.Test
    public void TestTreeMapReplace() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        tree.put(person.getName(), person.getYearOfBirth());
        tree.replace(person2.getName(), person2.getYearOfBirth());
        assertEquals(1, tree.size());
    }

}
