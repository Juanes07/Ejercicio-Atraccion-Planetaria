package Ferry;

import java.util.Date;
import java.util.Calendar;

/**
 * [la clase Vehicle es la clase base de la cual heredamos las siguientes
 * clases]
 *
 * @version [1.0.000 2022-02-12]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-12]
 *
 */
public class Vehicle {

    int numberOfPassengers;
    int numberWheels;
    int registration;
    int numberSeats;

    /**
     * Constructor de la clase Vehicle
     *
     * @param numberOfPassengers valor int. numero de los pasajeros totales
     * @param numberWheels valor int. numero de llantas del vehiculo
     * @param registration valor int. a;o de matriculacion del vehiculo
     * @param numberSeats valor int. numero de asientos totales del vehiculo
     */
    public Vehicle(int numberOfPassengers, int numberWheels, int registration, int numberSeats) {
        this.numberOfPassengers = numberOfPassengers;
        this.numberWheels = numberWheels;
        this.registration = registration;
        this.numberSeats = numberSeats;
    }

    /**
     * Numero de pasajeros asignado en cada clase
     *
     * @return numberOfPassengers valor int
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Numero de pasajeros asignado por usuario(en caso de ser solicitado)
     *
     * @param numberOfPassengers valor int
     */
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * Numero de llantas asignado en cada clase
     *
     * @return getNumberWheels valor int
     */
    public int getNumberWheels() {
        return numberWheels;
    }

    /**
     * Numero de llantas asignadas por usuario(en caso de ser solicitado)
     *
     * @param numberWheels valor int
     */
    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    /**
     * Año de matriculacion del vehiculo
     *
     * @return registration valor int
     */
    public int getRegistration() {
        return registration;
    }

    /**
     * Año de matriculacion del vehiculo asignada por usuario (en caso de ser
     * solicitado)
     *
     * @param numberOfPassengers valor int
     */
    public void setRegistration(int registration) {
        this.registration = registration;
    }

    /**
     * Numero de asientos totales
     *
     * @return numberSeats valor int
     */
    public int getNumberSeats() {
        return numberSeats;
    }

    /**
     * Numero de pasajeros totales asignado por usuario (en caso de ser
     * solicitado)
     *
     * @param numberOfPassengers valor int
     */
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public void setVehicle(int numberOfPassengers, int numberWheels, int registration, int numberSeats) {
        this.numberOfPassengers = numberOfPassengers;
        this.numberWheels = numberWheels;
        this.registration = registration;
        this.numberSeats = numberSeats;
    }

    /**
     * [Detalle Sera el metodo para ingresar el arreglo a organizar ]
     *
     *
     * @param numberOfPassengers Numero de pasajeros totales
     * @param numberWheels Numero de llantas del vehiculo
     * @param registration Año de matriculacion del vehiculo
     * @param numberSeats Numero de asientos totales del vehiculo
     * @return Una estructura de arreglo para mostrar los datos de los vehiculos
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-12]
     */
    @Override
    public String toString() {
        return "Listado de vehiculos dentro del ferry:" + "\n" + "numero de pasajeros= " 
                + numberOfPassengers + ", numero de llantas= " + numberWheels
                + ", año de matricula= " + registration + ", numero de asientos= " + numberSeats;
    }

}
