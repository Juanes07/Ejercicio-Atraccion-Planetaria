package Ferry;

/**
 * [la clase Car es hereda de clase vehicle]
 *
 * @version [1.0.000 2022-02-12]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-12]
 *
 */
public class Car extends Vehicle {

    boolean electric = true;
    /**
     * Constructor de la clase Car
     *
     * @param numberOfPassengers valor int. numero de los pasajeros totales
     * @param numberWheels valor int. numero de llantas del auto
     * @param registration valor int. a;o de matriculacion del auto
     * @param numberSeats valor int. numero de asientos totales del auto
     */
    public Car(int numberOfPassengers, int numberWheels, int registration, int numberSeats, boolean electric) {
        super(numberOfPassengers, numberWheels, registration, numberSeats);
        this.electric = electric;
    }
   

    /**
     * En caso de ser true, refleja ser un auto electrico
     *
     * @return electric valor boolean
     */
    public boolean isElectric() {
        return electric;
    }

    /**
     * Se puede modificar entre true y false, asignado por usuario
     *
     * @param electric valor boolean
     */
    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    /**
     * Numero de pasajeros asignado en clase Car
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
     * Numero de llantas asignado en clase Car
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
     * Año de matriculacion del vehiculo en clase Car
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
     * Numero de asientos totales en clase Car
     *
     * @return numberSeats valor int
     */
    public int getNumberSeats() {
        return numberSeats;
    }
    
    /**
     * [Se detalla el metodo para modificar como se presentan los datos de la clase Car]
     *
     *
     * @param numberOfPassengers Numero de pasajeros Car
     * @param numberWheels Numero de llantas del Car
     * @param registration Año de matriculacion del Car
     * @param numberSeats Numero de asientos totales del Car
     * @param electric Valor booleano. true significa que usa electricidad como combustible
     * @return Un arreglo con la informacion de la clase Car
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-12]
     */
    
    @Override
    public String toString() {
        return "Tu carro tiene:" + "\n" + "numero de pasajeros= " + numberOfPassengers +
                ", numero de llantas= " + numberWheels
                + ", año de matricula= " + registration + ", numero de asientos= "
                + numberSeats + " , es amigable con el ambiente: " + electric;
    }
}
