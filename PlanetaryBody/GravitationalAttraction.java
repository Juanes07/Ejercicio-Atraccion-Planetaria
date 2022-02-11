package PlanetaryBody;

/**
 * [la clase GravitationalAttraction se encarga de los metodos para realizar los
 * calculos necesarios]
 *
 * @version [1.0.000 2022-02-11]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-11]
 *
 */
public class GravitationalAttraction {

    /**
     * Variables
     */
    double massPlanet1;
    double massPlanet2;
    double distancePlanetToSun1;
    double distancePlanetToSun2;

    double distancePlanetToPlanet;
    
    /**
     * esta variable Gconstant hace referencia a la constante universal de
     * atraccion la cual es 6.67x10 elevado a -11
     */
    
    double Gconstant = 6.67 * (Math.pow(10, -11));

    /**
     * [Con este metodo, se calcula la fuerza de atraccion gravitacional]
     *
     *
     * @return Fg valor double
     *
     * @param massPlanet1 masa del planeta 1
     * @param massPlanet2 masa del planeta 2
     * @param distancePlanetToPlanet distancia entre los 2 planetas
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-11]
     *
     */
    
    public double isGravitationalAttraction(double massPlanet1, double massPlanet2, double distancePlanetToPlanet) {
        double Fg = (Gconstant * massPlanet1 * massPlanet2) / Math.pow(distancePlanetToPlanet, 2);
        return Fg;

    }

    /**
     * [Con este metodo, se calcula la distancia entre los planetas]
     *
     *
     * @return distancePlanetToPlanet valor double
     *
     * @param distancePlanetToSun1 distancia del planeta 1 con respecto al
     * centro del sistema planetario
     * @param distancePlanetToSun2 distancia del planeta 2 con respecto al
     * centro del sistema planetario
     *
     * @author [Juan Esteban, Velasquez Posada ]
     *
     * @since [1.0.000 2022-02-11]
     *
     */
    
    public double isDistancePlanetToPlanet(double distancePlanetToSun1, double distancePlanetToSun2) {
        double distancePlanetToPlanet = distancePlanetToSun2 - distancePlanetToSun1;
        return distancePlanetToPlanet;
    }

}
