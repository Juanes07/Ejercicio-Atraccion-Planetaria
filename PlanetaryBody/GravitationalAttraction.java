package PlanetaryBody;

public class GravitationalAttraction {

    double massPlanet1;
    double massPlanet2;
    double distancePlanetToSun1;
    double distancePlanetToSun2;
    
    double distancePlanetToPlanet;
    
    double Gconstant = 6.67 * (Math.pow(10, -11));

    public double isGravitationalAttraction(double massPlanet1,double massPlanet2,double distancePlanetToPlanet){
        double Fg = (Gconstant * massPlanet1 * massPlanet2)/ Math.pow(distancePlanetToPlanet, 2);
       return Fg;
        
    }
    
    
    public double isDistancePlanetToPlanet(double distancePlanetToSun1, double distancePlanetToSun2){
        double distancePlanetToPlanet = distancePlanetToSun2 - distancePlanetToSun1;
        return distancePlanetToPlanet;
    }
    
}
