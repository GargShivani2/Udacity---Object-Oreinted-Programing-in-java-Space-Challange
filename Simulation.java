import java.util.*;
import java.lang.*;
import java.io.*;

public class Simulation
{
	public Simulation(){

	}
	public ArrayList<Item>  loadItem (String fileName) throws FileNotFoundException
	{
		File file = new File(fileName);
		Scanner scan =  new Scanner(file);
		ArrayList<Item> items = new ArrayList<>();

		while(scan.hasNextLine())
		{
			String line = scan.nextLine();
			String[] lineParts = line.split("=");
			items.add(new Item(lineParts[0] , Integer.valueOf(lineParts[1])));
		}
		return items;
	}

	public ArrayList<Rocket> loadU1 (ArrayList<Item> itemList)
	{
		ArrayList<Rocket> rocketU1 = new ArrayList<>();
		
		int i = 0;
        while(i<itemList.size()){
            Rocket u1 = new U1();
            while(i<itemList.size() && u1.canCarry(itemList.get(i))){
                u1.carry(itemList.get(i));
                i++;
            }
            rocketU1.add(u1);
        }
		return rocketU1;
	}

	public ArrayList<Rocket> loadU2 (ArrayList<Item> itemList)
	{
		ArrayList<Rocket> rocketU2 = new ArrayList<>();

		int i = 0;
        while(i<itemList.size()){
            Rocket u2 = new U2();
            while(i<itemList.size() && u2.canCarry(itemList.get(i))){
                u2.carry(itemList.get(i));
                i++;
            }
			rocketU2.add(u2);
		}
		return rocketU2;
	}

	public int runSimulation(ArrayList<Rocket> rocketList)
	{
		int totalBudget =0;
		int fails =0;

		for(Rocket r : rocketList)
		{
			totalBudget += r.cost;
			System.out.println("now launch and land will acessed" + " # cost : " + r.cost);
			if(!r.launch() || !r.land())
			{
				System.out.println("Rocket Failed");
				totalBudget += r.cost;
				fails++;
			}
		}
		System.out.println("No of Fails : " + fails);
		return totalBudget;
	}
}