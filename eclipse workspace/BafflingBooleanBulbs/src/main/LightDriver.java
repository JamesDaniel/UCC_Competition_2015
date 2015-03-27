package main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class LightDriver
{
	public List<SwitchOrGate> switchesAndGates = new ArrayList<>();
	public List<Bulb> bulbs = new ArrayList<>();
	public int numOfGates;
	//public List
	
	public LightDriver(){

		/*
		Scanner in = null;
		try{
		in = new Scanner(new File("file/ya.txt"));
		}
		catch (Exception ex)
		{
			
		}*/
		Scanner in = new Scanner(System.in);
		int numOfLightSwitches = in.nextInt();
		int numOfBulbs = in.nextInt();
		numOfGates = in.nextInt();
		
		//   
		
		for (int i=0; i<numOfLightSwitches; i++)  // populate the switches
		{
			int identifier = in.nextInt();
			int state = in.nextInt();
			
			switchesAndGates.add(new SwitchOrGate(identifier,
					                                  state,
					                                  -1,-1,-1));
		}
		for (int i=0; i<numOfBulbs; i++)    // populate the bulbs
		{
			int identifier = in.nextInt();
			int sourceOne = in.nextInt();
			
			bulbs.add(new Bulb(identifier,
					           sourceOne));
		}
		for (int i=0;i<numOfGates;i++)      // populate the gates
		{
			int identifier = in.nextInt();
			int sourceOne = in.nextInt();
			int sourceTwo = in.nextInt();
			int gateType = in.nextInt();
			
			switchesAndGates.add(new SwitchOrGate(identifier,
					                                  -1,          // initial state
					                                  sourceOne,
					                                  sourceTwo,
					                                  gateType));
		}
		
	}
	
	
	public static void main(String args[])
	{
		LightDriver app = new LightDriver();
	}
	private class Bulb
	{
		public int identifier;
		public int source;
		public int state;
		
		public Bulb(int identifier, int source)
		{
			this.identifier = identifier;
			this.source = source;
			this.state = -1;
		}
	}
	private class SwitchOrGate{
		public int identifier;
		public int state;
		public int sourceOne;
		public int sourceTwo;
		public int gateType;
		public SwitchOrGate(){
			this.identifier = -1;
			this.state = -1;
			this.sourceOne = -1;
			this.sourceTwo = -1;
			this.gateType = -1;
		}
		public SwitchOrGate(int a,int b,int c,int d,int e){
			this.identifier = a;
			this.state = b;
			this.sourceOne = c;
			this.sourceTwo = d;
			this.gateType = e;
		}
	}
	
	public void setGateStates(){
		int changedStateCount=0;
		while (changedStateCount != numOfGates)    // the state of all gates need to be set
		{
			int sourceToUse1 = -1;
			int sourceToUse2 = -1;
			int numOfValidSources = 0;
			for (SwitchOrGate sog : switchesAndGates)
			{
				if (sog.state == -1)
				{
					for (SwitchOrGate sog2: switchesAndGates)
					{
						if (sog.sourceOne == sog2.identifier &&
							sog2.state != -1)
						{
							sourceToUse1 = sog2.state;
							numOfValidSources++;
						}
						if (sog.sourceTwo == sog2.identifier &&
							sog2.state != -1)
						{
							sourceToUse2 = sog2.state;
							numOfValidSources++;
						}
					}
				}
			}
		}
		/*
		Iterator<Gate> it = gates.iterator();
		while (it.hasNext())
		{
			int count=0;
			Gate g1 = it.next();
			int sourceSwitch;
			int state1;
			int state2;
			for (LightSwitch l : switches)
			{
				if (g1.sourceOne == l.identifier)
				{
					count++;
					state1 = l.state;
				}
				if (g1.sourceTwo == l.identifier)
				{
					count++;
					state2 = l.state;
				}
			}
			if (count == 2)
				
			//if (g1.sourceOne== )
		
		}
	 */
	}

}