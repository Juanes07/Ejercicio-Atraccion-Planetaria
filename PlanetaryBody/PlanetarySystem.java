package PlanetaryBody;

/**
 *
 * @author JUANES
 */
public abstract class PlanetarySystem {

    String name;
    int idPlanetary;
    double mass;
    double diameter;
    double distanceToSun;
    float density;

    public PlanetarySystem() {
        this.name = name;
        this.idPlanetary = idPlanetary;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdPlanetary() {
        return idPlanetary;
    }

    public void setIdPlanetary(int idPlanetary) {
        this.idPlanetary = idPlanetary;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }
}
