package io.jarcak.ds.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @Test
    public void GivenSinglyLinkedList_TestAllScenarios(){

        linkedList = new SinglyLinkedList<>();
        testLinkedList(linkedList);

    }

    private void testLinkedList(LinkedList<Integer> linkedList){

        Assertions.assertEquals(0, linkedList.size());
        Assertions.assertTrue(linkedList.isEmpty());
        Assertions.assertNull(linkedList.first());
        Assertions.assertNull(linkedList.last());
        Assertions.assertNull(linkedList.removeFirst());
        Assertions.assertNull(linkedList.removeLast());

        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

        Assertions.assertFalse(linkedList.isEmpty());
        Assertions.assertEquals(4, linkedList.size());
        Assertions.assertEquals(1, linkedList.first());
        Assertions.assertEquals(4, linkedList.last());

        Assertions.assertEquals(1, linkedList.removeFirst());
        Assertions.assertEquals(4, linkedList.removeLast());
        Assertions.assertEquals(2, linkedList.size());
        Assertions.assertEquals(2, linkedList.first());
        Assertions.assertEquals(3, linkedList.last());

        Assertions.assertEquals(2, linkedList.removeFirst());
        Assertions.assertEquals(3, linkedList.removeLast());

        Assertions.assertEquals(0, linkedList.size());
        Assertions.assertTrue(linkedList.isEmpty());
        Assertions.assertNull(linkedList.first());
        Assertions.assertNull(linkedList.last());
        Assertions.assertNull(linkedList.removeFirst());
        Assertions.assertNull(linkedList.removeLast());

        linkedList.addFirst(1);
        Assertions.assertEquals(1, linkedList.removeFirst());
    }
}
