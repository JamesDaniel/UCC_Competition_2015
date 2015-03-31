package main;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
		final static int ROWS = 4;
		final static int COLS = 6;
	public static void main(String[] args) {
		
		Scanner in=null;
		try{in = new Scanner(new File("input/input"));}catch(Exception e){}
		//Scanner in = new Scanner(System.in);
		
		
		int[][] time      = new int[ROWS][COLS];
		int[][] addedTime = new int[ROWS][COLS];
		
		for (int i=0; i<ROWS; i++)
		{
			for (int j=0; j<COLS; j++)
			{
				time[i][j] = in.nextInt();
			}
		}
		for (int i=0; i<ROWS; i++)
		{
			for (int j=0; j<COLS; j++)
			{
				addedTime[i][j] = in.nextInt();
			}
		}
		
		int[] timeIn3      = toDigitalTime(time);
		System.out.println(Arrays.toString(timeIn3));
		int[] addedTimeIn3 = toDigitalTime(time);
		int[] newTime      = new int[3];
		
		for (int i=0; i<newTime.length; i++)
		{
			newTime[i] = timeIn3[i] + addedTimeIn3[i];   // newTime may have mins || secs above 59 and hrs above 24
		}
		format(newTime);  // format newTime will correct mins && secs && hrs
		
		int[][] formattedNewTime = new int[ROWS][COLS];
		int hrs10s = (newTime[0] > 9)  ? (newTime[0] / 10) : 0;
		int hrs1s  = (newTime[0] % 10);
		int min10s = (newTime[1] > 9)  ? (newTime[0] / 10) : 0;
		int min1s  = (newTime[1] % 10);
		int sec10s = (newTime[2] > 9)  ? (newTime[0] / 10) : 0;
		int sec1s  = (newTime[2] % 10);
		
		String hrs10sBinary = Integer.toBinaryString(hrs10s); // binary for the first hrs digit
		String hrs1sBinary  = Integer.toBinaryString(hrs1s);
		String min10sBinary = Integer.toBinaryString(min10s);
		String min1sBinary  = Integer.toBinaryString(min1s);
		String sec10sBinary = Integer.toBinaryString(sec10s);
		String sec1sBinary  = Integer.toBinaryString(sec1s);  // binary for the second sec digit
		
		/*
		System.out.println(Arrays.toString(newTime));
		System.out.println(hrs10sBinary);
		System.out.println(hrs1sBinary);
		System.out.println(min10sBinary);
		System.out.println(min1sBinary);
		System.out.println(sec10sBinary);
		System.out.println(sec1sBinary);*/
		
		
		
		int[] tempArray1 = new int[4];
		int[] tempArray2 = new int[4];
		
		//String hrs10 = Integer.parseInt(hrsStr) > 9 ? (Integer.toBinaryString(Integer.))
		/*
		for (int cols=0; cols<COLS; cols++)
		{
			if (hrsStr.length() == 2)
			{
				
				for (int rows=ROWS; rows>0; rows--)
				{
					//hrsStr
					//while ((Integer.toBinaryString(Integer.parseInt(hrsStr.substring(0,2)))+"".length()) <= rows)
					//{
					//##############################################STOPPED HERE	
					//}
				}
			}
		}*/
		
		System.out.println("finished execution");
		System.exit(0);
		
	}
	public static void print2DArray(int[][] array){
		String output = "";
		for (int rows=0; rows<ROWS; rows++)
		{
			for (int cols=0; cols<COLS; cols++)
			{
				output += array[rows][cols] + " ";
			}
			output += "\n";
		}
		System.out.println(output);
	}
	public static int[] toDigitalTime(int[][] array){
		String binaryString="";
		int[] digitalTime6 = new int[6];
		int[] digitalTime3 = new int[3];
		
		for (int cols=0;cols<COLS;cols++)
		{
			for (int rows=0; rows<ROWS;rows++)
			{
				binaryString += array[rows][cols];
			}
			digitalTime6[cols] = Integer.parseInt(binaryString,2);
			binaryString = "";
		}
		digitalTime3[0] = (digitalTime6[0] * 10) + digitalTime6[1];
		digitalTime3[1] = (digitalTime6[2] * 10) + digitalTime6[3];
		digitalTime3[2] = (digitalTime6[4] * 10) + digitalTime6[5];
		
		return digitalTime3;
	}
	public static void format(int[] time)
	{
		if (time[2] > 59)
		{
			time[2] = time[2] - 60;
			time[1]++;
		}
		if (time[1] > 59)
		{
			time[1] = time[1]- 60;
			time[0]++;
		}
		if (time[0] > 23)
		{
			time[0] = time[0] % 24;
		}
	}

}
