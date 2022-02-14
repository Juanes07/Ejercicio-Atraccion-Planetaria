package Ferry;

import Ferry.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [la clase Main es la clase Principal donde se ejecuta el programa]
 *
 * @version [1.0.000 2022-02-12]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-12]
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehi;
        ArrayList<Vehicle> ferry;

        int passenger;
        int wheels;
        int yearDate;
        int seats;
        int opcion;

        ferry = new ArrayList();
        /**
         *
         */
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("ingrese año de matricula");
                yearDate = scanner.nextInt();
                System.out.println("ingrese numero de pasajeros actual");
                passenger = scanner.nextInt();
                System.out.println("ingrese numero de llantas");
                wheels = scanner.nextInt();
                System.out.println("ingrese numero de asientos Totales");
                seats = scanner.nextInt();
                vehi = new Vehicle(passenger, wheels, yearDate, seats);
                System.out.println("Su vehiculo ha sido añadido al ferry.");
                ferry.add(vehi);
                i++;
            }

        } catch (Exception exc) {
            System.out.println("Ingresa  numeros, no letras por favor");
        };
    }
}


