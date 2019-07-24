import java.util.*;
import java.lang.*;
import java.io.*;

public class Rocket implements SpaceShip
{
	int weight; //weight of item
	int cost;
	int maxCargo;
	int currentWeight; // current weight in the rocket
	double totalWeight;

	public Rocket(int weight, int cost, int maxCargo)
	{
		this.weight = weight;
		this.cost = cost;
		this.maxCargo = maxCargo;
		this.currentWeight = weight;
	}

	public int getWeight(){
        return weight;
    }
    /*
    public int getCurrentWeight(){
        return currentWeight;
    }
    public int setCurrentWeight(int weight1){
        return this.currentWeight+weight1;
    }
    */

    public int getMaxCargo(){
        return maxCargo;
    }
    public int getCost(){
        return cost;
    }

	@Override
	public boolean launch()
	{
		return true;
	}

	@Override
	public boolean land()
	{
		return true;
	}

	@Override
    public boolean canCarry(Item thing) {
        if(thing.getWeight() + currentWeight > maxCargo)
        {
        	System.out.println("weight " + thing.getWeight() + " current Weight " + currentWeight + " Max weight " + maxCargo);
        	System.out.println("Can not carry this item : "+ thing.getName() + "having weight : "+ thing.getWeight());
            return false;
        }
        else
            return true;
    }

    @Override
	public void carry(Item item)
	{
		System.out.println("weight " + item.getWeight() + " current Weight " + currentWeight + " Max weight " + maxCargo);
		System.out.println("Carrying item : "+ item.getName()+ "having weight : "+ item.getWeight());
		//item.setCurrentWeight(item.getWeight());
		this.currentWeight += item.getWeight();
		System.out.println("currentWeight : "+ currentWeight);
	}
}