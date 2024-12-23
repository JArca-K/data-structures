package io.jarcak.ds.list;

public class SinglyLinkedList<E extends Comparable<E>> implements LinkedList<E>{

    private static class Node<E extends Comparable<E>>{

        private E data;

        private Node<E> next;

        private Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }

    private int size;

    private Node<E> head;

    private Node<E> tail;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if(isEmpty())
            return null;
        return head.data;
    }

    @Override
    public E last() {
        if(isEmpty())
            return null;
        return tail.data;
    }

    @Override
    public void addFirst(E data) {

    }

    @Override
    public void addLast(E data) {

    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }
}
