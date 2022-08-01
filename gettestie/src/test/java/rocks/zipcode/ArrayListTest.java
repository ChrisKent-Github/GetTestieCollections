package rocks.zipcode;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayListAdd() {
        ArrayList<String> list = new ArrayList<>();
        Person person = new Person("Samuel", 1948);
        list.add(person.getName());
        assertEquals(true, list.contains(person.getName()));
    }

    @org.junit.Test
    public void TestArrayListRemove() {
        ArrayList<String> list = new ArrayList<>();
        Person person = new Person("Samuel", 1948);
        list.add(person.getName());
        list.remove(person.getName());
        assertEquals(true, list.isEmpty());
    }

    @org.junit.Test
    public void TestArraySize() {
        ArrayList<String> list = new ArrayList<>();
        Person person = new Person("Samuel", 1948);
        list.add(person.getName());
        assertEquals(1, list.size());
    }

    @org.junit.Test
    public void TestArrayListClear() {
        ArrayList<String> list = new ArrayList<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        Person person3 = new Person("Clark", 1962);
        Person person4 = new Person("Jude", 1972);
        list.add(person.getName());
        list.add(person2.getName());
        list.add(person3.getName());
        list.add(person4.getName());
        list.clear();
        assertEquals(0, list.size());
    }

    @org.junit.Test
    public void TestArrayListIndexOf() {
        ArrayList<String> list = new ArrayList<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        Person person3 = new Person("Clark", 1962);
        Person person4 = new Person("Jude", 1972);
        list.add(person.getName());
        list.add(person2.getName());
        list.add(person3.getName());
        list.add(person4.getName());
        assertEquals(2, list.indexOf("Clark"));
    }

    @org.junit.Test
    public void TestArrayListSet() {
        ArrayList<String> list = new ArrayList<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        Person person3 = new Person("Clark", 1962);
        Person person4 = new Person("Jude", 1972);
        list.add(person.getName());
        list.add(person2.getName());
        list.add(person3.getName());
        list.add(person4.getName());
        list.set(0, "NotSamuel");
        assertEquals("NotSamuel", list.get(0));
    }

    @org.junit.Test
    public void TestArrayListSublist() {
        ArrayList<String> list = new ArrayList<>();
        Person person = new Person("Samuel", 1948);
        Person person2 = new Person("Brie", 1989);
        Person person3 = new Person("Clark", 1962);
        Person person4 = new Person("Jude", 1972);
        list.add(person.getName());
        list.add(person2.getName());
        list.add(person3.getName());
        list.add(person4.getName());
        ArrayList newList = new ArrayList<>();
        newList.addAll(list.subList(2,3));
        assertEquals("Clark", newList.get(0));
    }
}
