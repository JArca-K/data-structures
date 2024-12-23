package io.jarcak.ds.list;

public class SinglyLinkedList<E extends Comparable<E>> implements LinkedList<E> {

    private static class Node<E extends Comparable<E>> {

        private final E data;

        private Node<E> next;

        private Node(E data, Node<E> next) {
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
        Node<E> node = new Node<>(data, head);
        if (isEmpty()) {
            tail = node;
        }
        head = node;
        size++;
    }

    @Override
    public void addLast(E data) {
        Node<E> node = new Node<>(data, null);
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;

        E data = head.data;
        head = head.next;

        if (size == 1) {
            tail = null;
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
            Node<E> node = head;
            while (node.next.next != null) {
                node = node.next;
            }

            node.next = null;
            tail = node;
        }
        size--;
        return data;
    }
}
