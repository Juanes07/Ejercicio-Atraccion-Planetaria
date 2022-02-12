package RandomList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import RandomList.Order;

/**
 * [la clase Main sera la clase principal para el ejercicio de ordenamiento de
 * numeros]
 *
 * @version [1.0.000 2022-02-11]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-11]
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nElementsRandom;
        int aux;
        int option;
        int optionSelection;
        Order o = new Order();

        /**
         * definimos el tamaño de los array
         */
        int myList[] = new int[10];

        int[] arr = new int[10];

        do {
            System.out.println("Que metodo deseas usar?:");
            System.out.println("1) Metodo Burbuja 2) Metodo QuickSort. 3)cualquier numero para salir "
                    + "Ingrese numero de la opcion");
            option = scanner.nextInt();
            switch (option) {
                case 1:

                    /**
                     * generamos los numeros aleatorios segun el tamaño definido
                     */
                    for (int i = 0; i < (myList.length); i++) {
                        myList[i] = (int) (Math.random() * 100);
                    }
                    /**
                     * Metodo burbuja
                     */
                    for (int i = 0; i < (myList.length - 1); i++) {
                        for (int j = 0; j < (myList.length - 1); j++) {
                            if ((myList[j]) > myList[j + 1]) {
                                aux = myList[j];
                                myList[j] = myList[j + 1];
                                myList[j + 1] = aux;
                            }
                        }
                    }
                    for (int i = 0; i < myList.length; i++) {

                        System.out.println(myList[i]);
                    }
                    break;
                case 2:

                    /**
                     * generamos los numeros aleatorios
                     */
                    for (int i = 0; i < (arr.length); i++) {
                        arr[i] = (int) (Math.random() * 100);
                    }

                    /**
                     * Metodo QuickSort
                     */
                    o.ordenarQuickSort(arr);
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                    }
                    break;
                default:
                    System.out.println("no era la opcion correcta");
            }
        } while (option <= 2);
        System.out.println("nos vemos");
    }
}
