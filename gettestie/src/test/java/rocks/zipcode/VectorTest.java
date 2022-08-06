package rocks.zipcode;

import java.util.ArrayList;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class VectorTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestVectorAdd() {
        Vector<String> vec = new Vector<>();
        Person person = new Person("Chris", 1979);
        vec.add(person.getName());
        assertEquals(true, vec.contains(person.getName()));
    }

    @org.junit.Test
    public void TestVectorRemove() {
        Vector<String> vec = new Vector<>();
        Person person2 = new Person("Zoe", 1978);
        vec.add(person2.getName());
        vec.remove(person2.getName());
        assertEquals(true, vec.isEmpty());
    }

    @org.junit.Test
    public void TestVectorSize() {
        Vector<String> vec = new Vector<>();
        Person person = new Person("Chris", 1979);
        vec.add(person.getName());
        assertEquals(1, vec.size());
    }

    @org.junit.Test
    public void TestVectorClear() {
        Vector<String> vec = new Vector<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        Person person3 = new Person("Vin", 1967);
        Person person4 = new Person("Bradley", 1975);
        vec.add(person.getName());
        vec.add(person2.getName());
        vec.add(person3.getName());
        vec.add(person4.getName());
        vec.clear();
        assertEquals(0, vec.size());
    }

    @org.junit.Test
    public void TestVectorIndexOf() {
        Vector<String> vec = new Vector<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        Person person3 = new Person("Vin", 1967);
        Person person4 = new Person("Bradley", 1975);
        vec.add(person.getName());
        vec.add(person2.getName());
        vec.add(person3.getName());
        vec.add(person4.getName());
        assertEquals(2, vec.indexOf("Vin"));
    }

    @org.junit.Test
    public void TestVectorSet() {
        Vector<String> vec = new Vector<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        Person person3 = new Person("Vin", 1967);
        Person person4 = new Person("Bradley", 1975);
        vec.add(person.getName());
        vec.add(person2.getName());
        vec.add(person3.getName());
        vec.add(person4.getName());
        vec.set(0, "NotChris");
        assertEquals("NotChris", vec.get(0));
    }

    @org.junit.Test
    public void TestVectorListSublist() {
        Vector<String> vec = new Vector<>();
        Person person = new Person("Chris", 1979);
        Person person2 = new Person("Zoe", 1978);
        Person person3 = new Person("Vin", 1967);
        Person person4 = new Person("Bradley", 1975);
        vec.add(person.getName());
        vec.add(person2.getName());
        vec.add(person3.getName());
        vec.add(person4.getName());
        Vector<String> vecSub = new Vector<>();
        vecSub.addAll(vec.subList(2,3));
        assertEquals("Vin", vecSub.get(0));
    }
}
