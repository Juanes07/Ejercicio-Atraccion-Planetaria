/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ferry;

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
public class Truck extends Vehicle {

    float height;

    public Truck(int numberOfPassengers, int numberWheels, int registration, int numberSeats, float height) {
        super(numberOfPassengers, numberWheels, registration, numberSeats);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Numero de pasajeros asignado en clase Truck
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
     * Numero de llantas asignado en clase Truck
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
     * Año de matriculacion del vehiculo en clase Truck
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
     * Numero de asientos totales en clase Truck
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

    /**
     * [Se detalla el metodo para modificar como se presentan los datos de la clase
     * Car]
     *
     *
     * @param numberOfPassengers Numero de pasajeros Truck
     * @param numberWheels Numero de llantas del Truck
     * @param registration Año de matriculacion del Truck
     * @param numberSeats Numero de asientos totales del Truck
     * @param height altura del Truck
     * 
     * @return Un arreglo con la informacion de la clase Car
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-12]
     */

    @Override
    public String toString() {
        return "Tu camion tiene:" + "\n" + "numero de pasajeros= " + numberOfPassengers
                + ", numero de llantas= " + numberWheels
                + ", año de matricula= " + registration + ", numero de asientos= "
                + numberSeats + " , tiene una altura de : " + height + " metros";
    }

}
