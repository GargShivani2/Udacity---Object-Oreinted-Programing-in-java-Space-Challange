import java.util.*;
import java.lang.*;
import java.io.*;

public class Item
{
	int weight;
	String name;

	public Item(int weight, String name)
	{
		this.weight = weight;
		this.name = name;
	}
	

	public String getName()
	{
		return name;
	}

	public int getWeight()
	{
		return weight;
	}
}