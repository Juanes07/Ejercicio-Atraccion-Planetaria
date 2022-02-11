package PlanetaryBody;

import PlanetaryBody.Mercury;
import PlanetaryBody.Neptune;
import PlanetaryBody.Saturn;
import PlanetaryBody.PlanetarySystem;

/**
 * [la clase Main es la clase Principal donde se ejecuta el programa]
 *
 * @version [1.0.000 2022-02-11]
 *
 * @author [Juan Esteban, Velasquez Posada ]
 *
 * @since [1.0.000 2022-02-11]
 *
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Variables para guardar los datos calculados
         */
        double getdistancePlanettoPlanet;
        double forceOfAttraction;
        /**
         * Clases instanciadas
         */
        GravitationalAttraction gravitationalAttraction;

        gravitationalAttraction = new GravitationalAttraction();

        Mercury mercury;

        mercury = new Mercury();

        Neptune neptune;

        neptune = new Neptune();
        
        Saturn saturn;
        
        saturn = new Saturn();
        
        /**
         * Se hacen los calculos para conseguir la atraccion gravitacional 
         * de cualesquier planeta.
         * solo se debe cambiar los metodos get por los de cada 
         * planeta correspiendtes
         */

        getdistancePlanettoPlanet = 
                gravitationalAttraction.isDistancePlanetToPlanet
        (neptune.getDistanceToSun(), mercury.getDistanceToSun());
        forceOfAttraction = 
                gravitationalAttraction.isGravitationalAttraction
        (neptune.getMass(), mercury.getMass(), getdistancePlanettoPlanet);
        
        /**
         * se Imprime en consola el resultado obtenido
         */
        System.out.println(" la atraccion gravitatoria entre el planeta: "
                + "" + mercury.getName() + " y el planeta: " + neptune.getName()
                + ". es: " + forceOfAttraction + " Newtons");
        
        getdistancePlanettoPlanet = 
                gravitationalAttraction.isDistancePlanetToPlanet
        (saturn.getDistanceToSun(), mercury.getDistanceToSun());
        forceOfAttraction =
                gravitationalAttraction.isGravitationalAttraction
        (saturn.getMass(), mercury.getMass(), getdistancePlanettoPlanet);
        
        System.out.println(" la atraccion gravitatoria entre el planeta: "
                + "" + saturn.getName() + " y el planeta: " + mercury.getName()
                + ". es: " + forceOfAttraction + " Newtons");

    }

}
