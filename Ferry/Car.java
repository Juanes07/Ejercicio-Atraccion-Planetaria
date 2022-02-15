package Ferry;

/**
 *
 * @author JUANES
 */
public class Car extends Vehicle {

    boolean electric = true;

    public Car(int numberOfPassengers, int numberWheels, int registration, int numberSeats, boolean electric) {
        super(numberOfPassengers, numberWheels, registration, numberSeats);
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
     * Numero de pasajeros totales asignado por usuario (en caso de ser
     * solicitado)
     *
     * @param numberOfPassengers valor int
     */
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    @Override
    public String toString() {
        return "Tu carro tiene:" + "\n" + "numero de pasajeros= " + numberOfPassengers +
                ", numero de llantas= " + numberWheels
                + ", año de matricula= " + registration + ", numero de asientos= "
                + numberSeats + " , es amigable con el ambiente: " + electric;
    }
}
