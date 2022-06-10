package edu.escuelaing.arsw.app;

public class Node {
        float value;
        Node next;

        // Constructor
        public Node(float d) {
            value = d;
            next = null;
        }

    /**
     *
     * @param next
     * Este metodo se encarga de asigar el valor siguiente a un valor de la linkedlist
     */
    public void next(Node next){
            this.next = next;
        }

}
