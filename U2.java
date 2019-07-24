import java.util.*;
import java.lang.*;
import java.io.*;

public class U2 extends Rocket {

    int cost;
    int weight;
    int maxCargo;
    int currentWeight = weight;
    double launchExplosion = 0.0;
    double landingCrash = 0.0;
    public static int rocketCountU2= 0;

    

    public U2(){
        super(18000,120,29000);
        System.out.println("NEW ROCKET");
        rocketCountU2++;
        System.out.println("no of U2 Rockets " +  rocketCountU2);
        System.out.println("Cost = "+ super.getCost());
        System.out.println("Max weight = "+ super.getMaxCargo());
        System.out.println("weight "+ super.getWeight());

    }

	

@Override
    public boolean launch() {
        double chance = 0.004*((double)super.getWeight()/super.getMaxCargo());
        double rand = Math.random()*.01;
        System.out.println("launchExplosion : " + chance);
        System.out.println("Rocket weight : " +  super.getWeight()); 
        return chance<=rand;
    }

    //Overridden the land function of rocket class include the probability of failure
    @Override
    public boolean land() {
        double chance = 0.008*((double)super.getWeight()/super.getMaxCargo());
        double rand = Math.random()*.01;
        System.out.println("landing crash : " + chance);
        System.out.println("Rocket weight : " +  super.getWeight());
        return chance<=rand;
    }

    public int getTotalCost() {return (cost*rocketCountU2);}
}