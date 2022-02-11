package PlanetaryBody;

/**
 *
 * @author JUANES
 */
public class SATURN extends PlanetarySystem {

    public SATURN() {
        this.name = "Saturno";
        this.density = 0.69f;
        this.diameter = 10872;
        this.distanceToSun = 142940;
        this.idPlanetary = 3;
        this.mass = 5688;
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
