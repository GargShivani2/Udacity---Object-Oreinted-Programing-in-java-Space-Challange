import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Simulation simulation = new Simulation();

		ArrayList<Item> item1 = simulation.loadItem("phase-1.txt");
		ArrayList<Item> item2 = simulation.loadItem("phase-2.txt");

		System.out.println("RUNNING SIMULATION FOR U1 ROCKET");
		int costU1 = simulation.runSimulation(simulation.loadU1(item1));
		System.out.println("Total cost for U1 : "+ costU1 );

		System.out.println("RUNNING SIMULATION FOR U2 ROCKET");
		int costU2 = simulation.runSimulation(simulation.loadU2(item2));
		System.out.println("Total cost for U2 : "+ costU2 );
	}
}