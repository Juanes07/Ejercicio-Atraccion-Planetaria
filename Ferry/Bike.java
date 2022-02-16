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
public class Bike extends Vehicle {

    String typeBike;
   /**
     * Constructor de la clase Bike
     *
     * @param numberOfPassengers valor int. numero de los pasajeros totales
     * @param numberWheels valor int. numero de llantas del vehiculo
     * @param registration valor int. a;o de matriculacion del vehiculo
     * @param numberSeats valor int. numero de asientos totales del vehiculo
     */
    public Bike( int numberOfPassengers, int numberWheels, int registration, int numberSeats, String typeBike) {
        super(numberOfPassengers, numberWheels, registration, numberSeats);
    }

  
    
    /**
     * El tipo de bibicleta
     *
     * @return typeBike valor String
     */
    
    public String getTypeBike() {
        return typeBike;
    }
    
    /**
     * El tipo de bibicleta segun el usuario
     *
     * @param typeBike valor String
     */
    
    public void setTypeBike(String typeBike) {
        this.typeBike = typeBike;
    }

    /**
     * Numero de pasajeros asignado en  clase bike
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
     * Numero de llantas asignado clase bike
     *
     * @return numberWheels valor int
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
     * Año de matriculacion de la bicicleta
     *
     * @return registration valor int
     */
    public int getRegistration() {
        return registration;
    }

    /**
     * Año de matriculacion de la bicicleta asignada por usuario (en caso de ser
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
     * @param registration Año de matriculacion de la bicleta
     * @param typeBike tipo de bicicleta seteado por usuario
     * @return Una estructura de arreglo para mostrar los datos de la bicicleta
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-15]
     */
    @Override
    public String toString() {
        return "La bicicleta que creaste tiene: " + "\n" + " año de matricula= "
                + registration + " Y es de tipo: " + typeBike;
    }
}
