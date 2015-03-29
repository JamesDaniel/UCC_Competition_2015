package main;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
		final static int ROWS = 4;
		final static int COLS = 6;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
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
		int[] addedTimeIn3 = toDigitalTime(time);
		int[] newTime      = new int[3];
		
		for (int i=0; i<newTime.length; i++)
		{
			newTime[i] = timeIn3[i] + addedTimeIn3[i];
		}
		format(newTime);
		
		int[][] formattedNewTime = new int[ROWS][COLS];
		String hrsStr = newTime[0] + "";
		String minStr = newTime[1] + "";
		String secStr = newTime[2] + "";
		
		for (int cols=0; cols<COLS; cols++)
		{
			if (hrsStr.length() > 1)
				for (int rows=ROWS; rows>0; rows--)
				{
					//hrsStr
					//while ((Integer.toBinaryString(Integer.parseInt(hrsStr.substring(0,2)))+"".length()) <= rows)
					//{
					//##############################################STOPPED HERE	
					//}
				}
		}
		
		
		

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
