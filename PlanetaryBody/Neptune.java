package PlanetaryBody;

/**
 *
 * @author JUANES
 */
public class Neptune extends PlanetarySystem {

    public Neptune() {
        this.name = "Neptune";
        this.density = 10.65f;
        this.diameter = 4953;
        this.distanceToSun = 45043;
        this.idPlanetary = 2;
        this.mass = 11024;
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
