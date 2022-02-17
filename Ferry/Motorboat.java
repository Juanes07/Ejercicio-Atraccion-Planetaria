package Ferry;

/**
 * [la clase Motorboat es hereda de clase vehicle]
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
     * Constructor de la clase Motorboat
     *
     * @param length valor float. largo de la lancha
     ** @param numberOfPassengers valor int. numero de los pasajeros totales
     * @param numberWheels valor int. numero de llantas de la lancha
     * @param registration valor int. a;o de matriculacion de la lancha
     * @param numberSeats valor int. numero de asientos totales de la lancha
     */
    public Motorboat(float length, int numberOfPassengers, int numberWheels, int registration, int numberSeats) {
        super(numberOfPassengers, numberWheels, registration, numberSeats);
        this.length = length;
    }
    
     /**
     * largo de la lancha asignado en  clase Motorboat
     *
     * @return length valor float
     */
    public float getLength() {
        return length;
    }
    /**
     * largo de la lancha asignado por usuario(en caso de sersolicitado);
     * @param length valor float
     */
    public void setLength(float length) {
        this.length = length;
    }

     /**
     * Numero de pasajeros asignado en  clase Motorboat
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
     * Numero de llantas asignado clase Motorboat
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
     * Año de matriculacion de clase Motorboat
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
     * @param registration valor int
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
     * Numero de asientos totales asignado por usuario (en caso de ser
     * solicitado)
     *
     * @param numberSeats valor int
     */
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
    
    
    /**
     * [Detalle Sera el metodo para ingresar el arreglo a organizar ]
     *
     *
     * @param numberOfPassengers numero de pasajeros actuales
     * @param registration Año de matriculacion del vehiculo
     * @param numberSeats numero de asientos totales
     * @param length largo de la lancha
     * @return Una estructura de arreglo para mostrar los datos de la lancha
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-15]
     */
    @Override
    public String toString() {
        return "Tu Lancha tiene:" + "\n" + "numero de pasajeros= " + numberOfPassengers
                + ", año de matricula= " + registration + ", numero de asientos= "
                + numberSeats + " ,tiene un largo de : " + length + " metros";
    }
}
