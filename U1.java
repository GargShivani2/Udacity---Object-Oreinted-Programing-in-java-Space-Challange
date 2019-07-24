import java.util.*;
import java.lang.*;
import java.io.*;

public class U1 extends Rocket
{
	int cost;
	int weight;
	int maxCargo;
	double launchExplosion = 0.0;
	double landingCrash = 0.0;
	int currentWeight = weight;
	public static int rocketCountU1 = 0;
	

	public U1(){
        super(10000,100,18000);
        System.out.println("NEW ROCKET");
        rocketCountU1++;
        System.out.println("no of U1 Rockets " +  rocketCountU1);
        System.out.println("Cost = "+ super.getCost());
        System.out.println("Max weight = "+ super.getMaxCargo());
        System.out.println("weight "+ super.getWeight());

    }
    @Override
    public boolean launch() {
        double chance = 0.005*((double)super.getWeight()/super.getMaxCargo());
        double rand = Math.random()*.01;
        System.out.println("launchExplosion : " + chance);
        System.out.println("Rocket weight : " +  super.getWeight()); 
        return chance<=rand;
    }

    //Overridden the land function of rocket class include the probability of failure
    @Override
    public boolean land() {
        double chance = 0.001*((double)super.getWeight()/super.getMaxCargo());
        double rand = Math.random()*.01;
        System.out.println("landing crash : " + chance);
        System.out.println("Rocket weight : " +  super.getWeight());
        return chance<=rand;
    }

    public int getTotalCost() {return (cost*rocketCountU1);}
	
}