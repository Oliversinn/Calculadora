/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Iterator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Revilo
 */
public class CircularListTest {
    
    public CircularListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addFirst method, of class CircularList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        CircularList instance = new CircularList();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class CircularList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        CircularList instance = new CircularList();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class CircularList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class CircularList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        CircularList instance = new CircularList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class CircularList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        CircularList instance = new CircularList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class CircularList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class CircularList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class CircularList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CircularList.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object value = null;
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.remove(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CircularList.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object value = null;
        CircularList instance = new CircularList();
        instance.add(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CircularList.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class CircularList.
     */
    @Test
    public void testGet_0args() {
        System.out.println("get");
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class CircularList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object value = null;
        CircularList instance = new CircularList();
        int expResult = 0;
        int result = instance.indexOf(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class CircularList.
     */
    @Test
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object value = null;
        CircularList instance = new CircularList();
        int expResult = 0;
        int result = instance.lastIndexOf(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class CircularList.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int i = 0;
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class CircularList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int i = 0;
        Object o = null;
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.set(i, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CircularList.
     */
    @Test
    public void testAdd_int_GenericType() {
        System.out.println("add");
        int i = 0;
        Object o = null;
        CircularList instance = new CircularList();
        instance.add(i, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CircularList.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int i = 0;
        CircularList instance = new CircularList();
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class CircularList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        CircularList instance = new CircularList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
