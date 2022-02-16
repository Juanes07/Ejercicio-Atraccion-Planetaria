package Ferry;

/**
 * [la clase Vehicle es la clase base de la cual heredamos las siguientes
 * clases]
 *
 * @version [1.0.000 2022-02-12]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-15]
 *
 */
public class Motorboat extends Vehicle {

    float length;

    /**
     *
     *
     * @param length
     * @param numberOfPassengers
     * @param numberWheels
     * @param registration
     * @param numberSeats
     */
    public Motorboat(float length, int numberOfPassengers, int numberWheels, int registration, int numberSeats) {
        super(numberOfPassengers, numberWheels, registration, numberSeats);
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    @Override
    public String toString() {
        return "Tu Lancha tiene:" + "\n" + "numero de pasajeros= " + numberOfPassengers
                + ", año de matricula= " + registration + ", numero de asientos= "
                + numberSeats + " ,tiene un largo de : " + length + " metros";
    }
}
