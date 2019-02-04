package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.Queue;
import edu.isu.cs.cs3308.structures.Stack;
import edu.isu.cs.cs3308.structures.impl.LinkedQueue;

/**
 *
 * @author Isaac Griffith
 * @author
 */
public class StackScan {

    /**
     * Tests whether the given stack contains the provided element.
     * Implementation should use a queue to scan the stack and reconstruct it
     * when done.
     *
     * @param <E> Type of elements stored in the stack
     * @param stack Stack to be scanned.
     * @param element Element to search the stack for.
     * @return True if the given stack is not null and contains the given
     * element. Returns false if both the stack and element are not null and the
     * stack does not contain the element, if either the stack or element is
     * null, or if the stack is emtpy.
     */
    public static <E> boolean scanStack(final Stack<E> stack, E element) {


        if(stack == null || element == null || stack.size() < 0)
        {
            return false;
        }
        else
        {
            //Set to false initially and will change to true if found later.
            boolean returnStatement = false;

            //Create new que to temp scan.
            LinkedQueue<E> tempQueue= new LinkedQueue<>();


            int listSize = stack.size();

            int listSizeTemp = listSize;

            E tempElement;

            while(listSizeTemp > 0)
            {
                tempElement = stack.pop();

                if(tempElement == element)
                {
                    returnStatement = true;
                }

                tempQueue.offer(tempElement);

                listSizeTemp--;
            }

            tempQueue.reverse();

            listSizeTemp = listSize;

            while(listSize > 0)
            {
                stack.push(tempQueue.poll());

                listSize--;
            }

            return returnStatement;

        }
    }
}
