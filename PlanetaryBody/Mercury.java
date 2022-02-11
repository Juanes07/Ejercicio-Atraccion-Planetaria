package PlanetaryBody;

/**
 *
 * @author JUANES
 */
public class Mercury extends PlanetarySystem {

    public Mercury() {
        this.name = "Mercury";
        this.density = 5.42f;
        this.diameter = 488;
        this.distanceToSun = 5791;
        this.idPlanetary = 1;
        this.mass = 3303;
    }

    /**
     * Refleja nombre asignado en el constructor
     *
     * @return name valor String
     */
    public String getName() {
        return name;
    }

    /**
     * Refleja nombre asignado por usuario (de ser solicitado) en el planeta
     *
     * @param name valor String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Refleja el identificador en el constructor
     *
     * @return idPlanetary valor int
     */
    public int getIdPlanetary() {
        return idPlanetary;
    }

    /**
     * Refleja el identificador asignado por usuario (de ser solicitado) 
     * en el planeta
     *
     * @param idPlanetary valor int
     */
    public void setIdPlanetary(int idPlanetary) {
        this.idPlanetary = idPlanetary;
    }

    /**
     * Refleja la masa del planeta en el constructor
     *
     * @return mass valor double
     */
    public double getMass() {
        return mass;
    }

    /**
     * Refleja masa asignada por usuario (de ser solicitado) en el planeta
     *
     * @param mass valor double
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Refleja el diametro del planeta en el constructor
     *
     * @return diameter valor double
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Refleja diametero del planeta asignado por usuario (de ser solicitado) en
     * en el planeta
     *
     * @param diameter valor double
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Refleja la distancia del planeta en el constructor
     *
     * @return distanceToSun valor double
     */
    public double getDistanceToSun() {
        return distanceToSun;
    }

    /**
     * Refleja la distancia del planeta al sol asignado por usuario (de ser
     * solicitado) en el planeta
     *
     * @param distanceToSun valor double
     */
    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    /**
     * Refleja la densidad del planeta en el constructor
     *
     * @return density valor float
     */
    public float getDensity() {
        return density;
    }

    /**
     * Refleja la densidad asignada por usuario (de ser solicitado) en el
     * planeta
     *
     * @param density valor float
     */
    public void setDensity(float density) {
        this.density = density;
    }

}
