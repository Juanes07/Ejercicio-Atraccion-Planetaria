/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PlanetaryBody;

/**
 *
 * @author JUANES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double getdistancePlanettoSun;
        double forceOfAttraction;
        
        GravitationalAttraction gravitationalAttraction;
        
        gravitationalAttraction = new GravitationalAttraction();
        
        Mercury mercury;
        
        mercury = new Mercury();
        
        Neptune neptune;
        
        neptune = new Neptune();
        
        
        
      getdistancePlanettoSun = gravitationalAttraction.isDistancePlanetToPlanet
        (neptune.getDistanceToSun(), mercury.getDistanceToSun());
      forceOfAttraction = gravitationalAttraction.isGravitationalAttraction(neptune.getMass(),
              mercury.getMass(), getdistancePlanettoSun);
      
      
      System.out.println(" la atraccion gravitatoria entre el planeta: "
              + "" + mercury.getName() + " y el planeta: " + neptune.getName() 
              + ". es: " + forceOfAttraction + " Newtons");
        
    }

}
