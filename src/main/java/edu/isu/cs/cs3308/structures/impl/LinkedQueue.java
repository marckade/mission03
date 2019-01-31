package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Queue;

import edu.isu.cs.cs3308.structures.Node;

public class LinkedQueue<E> implements Queue {


    private DoublyLinkedList<E> linkedQueue= new DoublyLinkedList<>();


    /**
     * @return The number of elements in the queue
     */
    @Override
    public int size() {

        return linkedQueue.size();
    }

    /**
     * @return tests whether the queue is empty.
     */
    @Override
    public boolean isEmpty() {

        return linkedQueue.isEmpty();
    }

    /**
     * Inserts an element at the end of the queue.
     *
     * @param element Element to be inserted.
     */
    @Override
    public void offer(Object element) {

    }

    /**
     * @return The value first element of the queue (with out removing it), or
     * null if empty.
     */
    @Override
    public Object peek() {
        return null;
    }

    /**
     * @return The value of the first element of the queue (and removes it), or
     * null if empty.
     */
    @Override
    public Object poll() {
        return null;
    }

    /**
     * Prints the contents of the queue starting at top, one item per line. Note
     * this method should not empty the contents of the queue.
     */
    @Override
    public void printQueue() {

    }

    /**
     * Tranfers the contents of this queue into the provided queue. The contents
     * of this queue are to found in reverse order at the top of the provided
     * queue. This queue should be empty once the transfer is completed. Note
     * that if the provided queue is null, nothing is to happen.
     *
     * @param into The new queue onto which the reversed order of contents from
     * this queue are to be transferred to the top of, unless the provided queue
     * is null.
     */
    @Override
    public void transfer(Queue into) {

    }

    /**
     * Reverses the contents of this queue.
     */
    @Override
    public void reverse() {

    }

    /**
     * Merges the contents of the provided queue onto the bottom of this queue.
     * The order of both queues must be preserved in the order of this queue
     * after the method call. Furthermore, the provided queue must still contain
     * its original contents in their original order after the method is
     * complete. If the provided queue is null, no changes should occur.
     *
     * @param from Queue whose contents are to be merged onto the bottom of
     * this queue.
     */
    @Override
    public void merge(Queue from) {

    }
}
