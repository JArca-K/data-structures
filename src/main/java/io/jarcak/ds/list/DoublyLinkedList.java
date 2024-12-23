package io.jarcak.ds.list;

public class DoublyLinkedList<E extends Comparable<E>> implements LinkedList<E> {

    private static class Node<E extends Comparable<E>> {

        private E data;

        private Node<E> next;

        private Node<E> previous;

        private Node(E data, Node<E> next, Node<E> previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
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
        if (isEmpty())
            return null;
        return head.data;
    }

    @Override
    public E last() {
        if (isEmpty())
            return null;
        return tail.data;
    }

    @Override
    public void addFirst(E data) {
        Node<E> node = new Node(data, head, null);

        if (isEmpty()) {
            tail = node;
        } else {
            head.previous = node;
        }
        head = node;
        size++;
    }

    @Override
    public void addLast(E data) {
        Node<E> node = new Node(data, null, tail);

        if (isEmpty()) {
            head = node;
        } else {
            node.previous = tail;
        }
        tail = node;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;

        E data = head.data;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        size--;
        return data;
    }

    @Override
    public E removeLast() {
        if (isEmpty())
            return null;

        E data = tail.data;

        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        size--;
        return data;
    }
}
