package PlanetaryBody;

/**
 * [la clase PlanetarySystem es la clase base para asignar los demas planetas]
 *
 * @version [1.0.000 2022-02-11]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-11]
 *
 */
public abstract class PlanetarySystem {

    String name;
    int idPlanetary;
    double mass;
    double diameter;
    double distanceToSun;
    float density;

    /**
     * Constructor de la clase PlanetarySystem
     */
    public PlanetarySystem() {
        this.name = name;
        this.idPlanetary = idPlanetary;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.density = density;
    }

    /**
     * Refleja nombre asignado en cada planeta
     *
     * @return name valor String
     */
    public String getName() {
        return name;
    }

    /**
     * Refleja nombre asignado por usuario (de ser solicitado) en cada planeta
     *
     * @param name valor String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Refleja el identificador asignado en cada planeta
     *
     * @return idPlanetary valor int
     */
    public int getIdPlanetary() {
        return idPlanetary;
    }

    /**
     * Refleja el identificador asignado por usuario (de ser solicitado) en cada
     * planeta
     *
     * @param idPlanetary valor int
     */
    public void setIdPlanetary(int idPlanetary) {
        this.idPlanetary = idPlanetary;
    }

    /**
     * Refleja la masa del planeta asignado en cada planeta
     *
     * @return mass valor double
     */
    public double getMass() {
        return mass;
    }

    /**
     * Refleja masa asignada por usuario (de ser solicitado) en cada planeta
     *
     * @param mass valor double
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Refleja el diametro del planeta asignado en cada planeta
     *
     * @return diameter valor double
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Refleja diametero del planeta asignado por usuario (de ser solicitado) en
     * cada planeta
     *
     * @param diameter valor double
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Refleja la distancia del planeta asignado en cada planeta
     *
     * @return distanceToSun valor double
     */
    public double getDistanceToSun() {
        return distanceToSun;
    }

    /**
     * Refleja la distancia del planeta al sol asignado por usuario (de ser
     * solicitado) en cada planeta
     *
     * @param distanceToSun valor double
     */
    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    /**
     * Refleja la densidad del planeta asignada en cada planeta
     *
     * @return density valor float
     */
    public float getDensity() {
        return density;
    }

    /**
     * Refleja la densidad asignada por usuario (de ser solicitado) en cada
     * planeta
     *
     * @param density valor float
     */
    public void setDensity(float density) {
        this.density = density;
    }
}
