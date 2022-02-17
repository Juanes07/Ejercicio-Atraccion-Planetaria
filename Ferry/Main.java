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
        Bike bike;
        Motorcicle motorcicle;
        Motorboat motorboat;

        ArrayList<Vehicle> ferry;
        /**
         * Variables de entorno para ingresar por teclado los datos requeridos
         */
        int passenger;
        int wheels;
        int yearDate;
        int seats;
        int opcion;
        int typeMotor;
        String typeBike;
        boolean oil;
        float height;
        /**
         * Se crea un arrayList para guardar los datos ingresados de los vehiculos
         */
        ferry = new ArrayList();

        System.out.println("1).Deseas crear una lista de vehiculos." + "\n" + "2)Diseñar propiedades de un camion"
                + "\n" + "3)Diseñar propiedades de un carro"
                + "\n" + "4)Diseñar una bicicleta"
                + "\n" + "5)Diseñar una motocicleta"
                + "\n" + "6)Diseñar una lancha" 
                +"\n" + "Ingresa el numero de la opcion deseada");
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
                System.out.println("ingrese año de matricula de su carro");
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
            case 4:
                try {
                System.out.println("ingrese año de matricula de su bicleta");
                yearDate = scanner.nextInt();
                passenger = 1;
                wheels = 2;
                seats = 1;
                System.out.println("Escriba el tipo de bibicleta que desea: " + "\n"
                        + "Ruta, montañ o BMX. " + " Puedes escribir la respuesta");
                typeBike = scanner.next();
                bike = new Bike(passenger, wheels, yearDate, seats, typeBike);
                bike.setRegistration(yearDate);
                bike.setTypeBike(typeBike);
                System.out.println(bike);

            } catch (Exception exc) {
                System.out.println("Ingresa los datos pedidos. Intentalo de nuevo");
            }
            break;
            case 5:
                try {
                System.out.println("ingrese año de matricula de su motocicleta");
                yearDate = scanner.nextInt();
                passenger = 1;
                wheels = 2;
                seats = 2;
                System.out.println("ingrese el cilindraje de su motocicleta. los cuales pueden ser: " + "\n"
                        + "desde 0 hasta 500");
                typeMotor = scanner.nextInt();
                motorcicle = new Motorcicle(typeMotor, passenger, wheels, yearDate, seats);
                motorcicle.setNumberOfPassengers(passenger);
                motorcicle.setNumberSeats(seats);
                motorcicle.setNumberWheels(wheels);
                motorcicle.setRegistration(yearDate);
                motorcicle.setTypeMotor(typeMotor);
                if (typeMotor <= 200) {
                    System.out.println(motorcicle + " lo cual significa que tiene un motor de bajo cilindraje");
                } else if (typeMotor >= 201 || typeMotor <= 400) {
                    System.out.println(motorcicle + " lo cual significa que tiene un motor de medio cilindraje");
                } else if (typeMotor >= 401) {
                    System.out.println(motorcicle + " lo cual significa que tiene un motor de alto cilindraje");
                }
            } catch (Exception exc) {
                System.out.println("Intentalo de nuevo, pero asegurate de ingresar los datos pedidos");
            }
            break;
            case 6:
                try {
                System.out.println("ingrese año de matricula de su lancha a motor");
                yearDate = scanner.nextInt();
                System.out.println("ingrese numero de pasajeros actual");
                passenger = scanner.nextInt();
                System.out.println("ingrese numero de asientos Totales");
                seats = scanner.nextInt();
                System.out.println("ingrese la longitud de su lancha");
                height = scanner.nextFloat();
                wheels = 0;
                motorboat = new Motorboat(height,passenger,wheels,yearDate,seats);
                motorboat.setLength(height);
                motorboat.setNumberSeats(seats);
                motorboat.setNumberOfPassengers(passenger);
                motorboat.setRegistration(yearDate);
                motorboat.setNumberWheels(wheels);
                System.out.println(motorboat);      
            } catch (Exception exc) {
                System.out.println("Intentalo de nuevo, pero asegurate de ingresar los datos pedidos");
            }
            break;

            default:
                System.out.println("No elegiste ninguna opcion correspondiente");

        }

    }
}
