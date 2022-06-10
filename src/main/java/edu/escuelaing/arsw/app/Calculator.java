package edu.escuelaing.arsw.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
    /**
     *
     * @param file
     * @return
     * @throws FileNotFoundException
     *
     * Este metodo esta encargado de crear la linkedlist
     */
    public LinkedList createList(String file) throws FileNotFoundException {

        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextFloat()) {
            list.setValueInPosition(list, scanner.nextFloat());
        }

        return list;
    }

    /**
     *
     * @param list
     * @return
     * Esta clase esta encargada de encontrar el promedio de los elementos de la linkedlist
     */

    public float average(LinkedList list) {

        float suma = list.summatory(list);
        int tamano = list.sizeLinked(list);

        float result = (suma/tamano);

        return result;
    }

    /**
     *
     * @param list
     * @return
     * Esta clase esta encargada de calcular la deviacion estandar de una LinkedList
     */
    public float standardDeviation(LinkedList list) {

        float average = average(list);
        float desvPartial = 0;
        for(int i=0; i<list.sizeLinked(list); i++){
            desvPartial += Math.pow(list.getValueInPosition(list,i) - average, 2);
        }

        float result = (float) Math.sqrt(desvPartial/(list.sizeLinked(list)-1));

        return result;
    }
}
