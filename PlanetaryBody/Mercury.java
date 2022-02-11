package PlanetaryBody;

/**
 *
 * @author JUANES
 */
public class Mercury extends PlanetarySystem {

    public Mercury() {
         this.name = "Mercury";
        this.density = 5.42f;
        this.diameter =  488;
        this.distanceToSun = 5791;
        this.idPlanetary = 1;
        this.mass = 3303;
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
