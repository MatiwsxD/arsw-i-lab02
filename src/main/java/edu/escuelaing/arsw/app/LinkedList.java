package edu.escuelaing.arsw.app;

public class LinkedList {
    Node head;

    /**
     *
     * @param list
     * @param value
     * @return LinkedList
     * Esta clase se encarga de asignar un valor a la linkedlist
     */
    public LinkedList setValueInPosition(LinkedList list, float value) {

        Node newNode = new Node(value);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node tail = list.head;
            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = newNode;
        }

        return list;
    }

    /**
     *
     * @param list
     * @param position
     * @return float
     *
     * Este metodo se encarga de retornar un valor solicitado de la linkedlist
     */

    public static float getValueInPosition(LinkedList list, int position){

        Node currentNode = list.head;
        float valor = 0;

        if (position == 0 && currentNode != null) {

            valor = currentNode.value;
            return valor;
        }

        int cont = 0;
        while (currentNode != null) {

            if (cont == position) {
                valor = currentNode.value;
                break;
            } else {
                currentNode = currentNode.next;
                cont++;
            }
        }

        return valor;

    }

    /**
     *
     * @param list
     * @return int
     * Este metodo se encarga de retornar el tamaño de la linkedlist
     */
    public static int sizeLinked(LinkedList list){

        Node currentNode = list.head;

        int cont = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            cont++;
        }

        return cont;
    }

    /**
     *
     * @param list
     * @return float
     * Este metodo se encarga de retornar un valor en especifico
     */
    public static float summatory(LinkedList list){

        Node currentNode = list.head;

        float cont = 0;
        while (currentNode != null) {

            cont += currentNode.value;
            currentNode = currentNode.next;
        }

        return cont;

    }
}
