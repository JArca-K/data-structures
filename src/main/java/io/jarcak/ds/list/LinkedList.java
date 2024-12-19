package io.jarcak.ds.list;

import java.io.Serializable;

public interface LinkedList<E> extends Serializable {

    int size();

    boolean isEmpty();

    E first();

    E last();

    void addFirst(E data);

    void addLast(E data);

    E removeFirst();

    E removeLast();
}
