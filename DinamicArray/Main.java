package DinamicArray;

import java.util.Vector;
import java.util.Scanner;

/**
 * [la clase Main es la clase Principal donde se ejecuta el programa]
 *
 * @version [1.0.000 2022-02-14]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-14]
 *
 */
public class Main {

    public static void main(String[] args) {
        
        /**
         * Variables para guardar los numeros digitados
         */
        
        int option;
        int optionCompare;
        
        /**
         * Se inicializa el metodo scanner
         */
        
        Scanner scanner = new Scanner(System.in);
        
        /**
         * Se crea con vector el arrayList dinamico
         */
        
        Vector<Integer> vectorList = new Vector<Integer>();
        
        System.out.println("Recuerda no ingresar numeros repetidos seguidos");
        try {
            do {
                System.out.println("Ingresa un numero cualquiera");
                option = scanner.nextInt();
                System.out.println("Ingresa un otro numero cualquiera");
                optionCompare = scanner.nextInt();
                vectorList.addElement(option);
                if (option != optionCompare) {
                    vectorList.addElement(optionCompare);
                } else {
                    System.out.println("Esta es la lista de numeros que has ingresado: " + vectorList);
                }
            } while (option != optionCompare);

        } catch (Exception exc) {
            System.out.println("Ingresa numeros por favor. no letras");
        }

    }

}
