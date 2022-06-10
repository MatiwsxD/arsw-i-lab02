package edu.escuelaing.arsw.app;

import java.io.FileNotFoundException;

public class App {
    /**
     *
     * @param args
     * @throws FileNotFoundException
     *
     * Esta clase recibe la ruta del archivo y calcula la desviacion estandar
     */
    public static void main( String[] args ) throws FileNotFoundException {
        String file = args[0];
        LinkedList list;
        Calculator calculator = new Calculator();
        list = calculator.createList(file);
        float average = calculator.average(list);
        System.out.println("Average: " +average);
        float standardDev = calculator.standardDeviation(list);
        System.out.println("Standard deviation: " +standardDev);
    }
}
