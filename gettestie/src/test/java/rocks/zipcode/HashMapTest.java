package rocks.zipcode;

import java.util.HashMap;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class HashMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMapPut() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        map.put(person.getName(), person.getYearOfBirth());
        assertEquals(true, map.containsKey(person.getName())); // true
        assertEquals(true, map.containsValue(person.getYearOfBirth())); // true
    }

    @org.junit.Test
    public void TestHashMapPutOverwrite() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Samuel", 1944);
        map.put(person.getName(), person.getYearOfBirth());
        map.put(person2.getName(), person2.getYearOfBirth());
        assertEquals(Integer.valueOf(1944), map.get("Samuel"));
        assertEquals(1, map.size());
    }

    @org.junit.Test
    public void TestHashMapSize() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        map.put(person.getName(), person.getYearOfBirth());
        map.put(person2.getName(), person2.getYearOfBirth());
        assertEquals(2, map.size());
    }

    @org.junit.Test
    public void TestHashMapClear() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        map.put(person.getName(), person.getYearOfBirth());
        map.put(person2.getName(), person2.getYearOfBirth());
        map.clear();
        assertEquals(true, map.isEmpty()); // true
    }

    @org.junit.Test
    public void TestHashMapRemove() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        map.put(person.getName(), person.getYearOfBirth());
        map.put(person2.getName(), person2.getYearOfBirth());
        map.remove(person2.getName());
        assertEquals(1, map.size());
    }

    @org.junit.Test
    public void TestHashMapPutIfAbsent1() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        map.putIfAbsent(person.getName(), person.getYearOfBirth());
        map.putIfAbsent(person2.getName(), person2.getYearOfBirth());
        assertEquals(2, map.size());
    }

    @org.junit.Test
    public void TestHashMapPutIfAbsent2() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Samuel", 1944);
        map.putIfAbsent(person.getName(), person.getYearOfBirth());
        map.putIfAbsent(person2.getName(), person2.getYearOfBirth());
        assertEquals(1, map.size());
    }

    @org.junit.Test
    public void TestHashMapReplace() {
        HashMap<String, Integer> map = new HashMap<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        map.put(person.getName(), person.getYearOfBirth());
        map.replace(person2.getName(), person2.getYearOfBirth());
        assertEquals(1, map.size());
    }




}
