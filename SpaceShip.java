
import java.util.*;
import java.lang.*;
import java.io.*;
/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
*/

public interface SpaceShip
{
	public boolean land(); // can successfil land
	public boolean launch(); // can sucessful launch
	public boolean canCarry(Item item); // item can carried by the rocket
	public void carry(Item item);  // update current weight

}