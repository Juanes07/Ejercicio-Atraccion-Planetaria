package Ferry;

import Ferry.Vehicle;
import java.util.ArrayList;
import java.util.Scanner;
import Ferry.Car;

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
        Car car;
        Truck truck;

        ArrayList<Vehicle> ferry;
        /**
         * Variables de entorno para ingresar por teclado los datos requeridos
         */
        int passenger;
        int wheels;
        int yearDate;
        int seats;
        int opcion;
        boolean oil;
        float height;

        ferry = new ArrayList();

        System.out.println("1).Deseas crear una lista de vehiculos." + "\n" + "2)Diseñar propiedades de un camion"
                + "\n" + "3)Diseñar propiedades de un carro");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1: 
                try {
                    
                        
                for (int i = 0; i <= 1; i++) {
                    System.out.println("A continuacion. Ingrese los datos pedidos de los vehiculos");
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
                System.out.println(ferry);
            } catch (Exception exc) {
                System.out.println("Ingresa  numeros, no letras por favor");
            }
            break;
            case 2:
                try {
                System.out.println("Altura del camion");
                height = scanner.nextFloat();
                System.out.println("ingrese año de matricula");
                yearDate = scanner.nextInt();
                System.out.println("ingrese numero de pasajeros actual");
                passenger = scanner.nextInt();
                System.out.println("ingrese numero de llantas");
                wheels = scanner.nextInt();
                System.out.println("ingrese numero de asientos Totales");
                seats = scanner.nextInt();
                truck = new Truck(yearDate, passenger, wheels, seats, height);
                truck.setRegistration(yearDate);
                truck.setNumberOfPassengers(passenger);
                truck.setNumberSeats(seats);
                truck.setNumberWheels(wheels);
                truck.setHeight(height);
                System.out.println(truck);
            } catch (Exception exc) {
                System.out.println("Ingresa  numeros, no letras por favor");
            }
            break;
            case 3:
                try {
                System.out.println("ingrese año de matricula");
                yearDate = scanner.nextInt();
                System.out.println("ingrese numero de pasajeros actual");
                passenger = scanner.nextInt();
                System.out.println("ingrese numero de llantas");
                wheels = scanner.nextInt();
                System.out.println("ingrese numero de asientos Totales");
                seats = scanner.nextInt();
                System.out.println("Si tu auto utiliza electricidad como combustible: Escibe TRUE"
                        + "\n" + "sino es el caso, escribe FALSE");
                oil = scanner.nextBoolean();
                car = new Car(yearDate, passenger, wheels, seats, oil);
                car.setRegistration(yearDate);
                car.setNumberOfPassengers(passenger);
                car.setNumberWheels(wheels);
                car.setNumberSeats(seats);
                car.setElectric(oil);
                if (oil = true) {
                    System.out.println(car + " utiliza electricidad,ayudas al ambiente");

                } else {
                    System.out.println(car + " utiliza gasolina, la cual contamina con CO2");
                }

            } catch (Exception exc) {
                System.out.println("Ingresa los datos pedidos. Intentalo de nuevo");
            }
            break;
            default:
                System.out.println("Ingresa los datos pedidos. Intentalo de nuevo");

        }

    }
}
