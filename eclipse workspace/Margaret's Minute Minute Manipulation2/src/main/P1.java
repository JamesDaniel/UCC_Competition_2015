package main;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner in=null;
		try{in = new Scanner(new File("input/input"));}catch(Exception e){}

		int[] hrs10s = new int[4];
		int[] hrs1s  = new int[4];
		int[] min10s = new int[4];
		int[] min1s  = new int[4];
		int[] sec10s = new int[4];
		int[] sec1s  = new int[4];
		for (int i=0; i<4; i++)
		{
			hrs10s[i] = in.nextInt();
			hrs1s[i]  = in.nextInt();
			min10s[i] = in.nextInt();
			min1s[i]  = in.nextInt();
			sec10s[i] = in.nextInt();
			sec1s[i]  = in.nextInt();
		}
		int hrs10sint = Integer.parseInt(hrs10s[0]+""  +hrs10s[1]+""  +hrs10s[2]+""  +hrs10s[3]  +"",2);
		int hrs1sint  = Integer.parseInt(hrs1s[0] +""  +hrs1s[1] +""  +hrs1s[2] +""  +hrs1s[3]   +"",2);
		int min10sint = Integer.parseInt(min10s[0]+""  +min10s[1]+""  +min10s[2]+""  +min10s[3]  +"",2);
		int min1sint  = Integer.parseInt(min1s[0] +""  +min1s[1] +""  +min1s[2] +""  +min1s[3]   +"",2);
		int sec10sint = Integer.parseInt(sec10s[0]+""  +sec10s[1]+""  +sec10s[2]+""  +sec10s[3]  +"",2);
		int sec1sint  = Integer.parseInt(sec1s[0] +""  +sec1s[1] +""  +sec1s[2] +""  +sec1s[3]   +"",2);
		
		int[] addedhrs10s = new int[4];
		int[] addedhrs1s  = new int[4];
		int[] addedmin10s = new int[4];
		int[] addedmin1s  = new int[4];
		int[] addedsec10s = new int[4];
		int[] addedsec1s  = new int[4];
		for (int i=0; i<4; i++)
		{
			addedhrs10s[i] = in.nextInt();
			addedhrs1s[i]  = in.nextInt();
			addedmin10s[i] = in.nextInt();
			addedmin1s[i]  = in.nextInt();
			addedsec10s[i] = in.nextInt();
			addedsec1s[i]  = in.nextInt();
		}
		int addedhrs10sint = Integer.parseInt(addedhrs10s[0]  +""+addedhrs10s[1]+""  +addedhrs10s[2]+""    +addedhrs10s[3]  +"",2);
		int addedhrs1sint  = Integer.parseInt(addedhrs1s[0]   +""+addedhrs1s[1] +""   +addedhrs1s[2]+""    +addedhrs1s[3]   +"",2);
		int addedmin10sint = Integer.parseInt(addedmin10s[0]  +""+addedmin10s[1]+""  +addedmin10s[2]+""    +addedmin10s[3]  +"",2);
		int addedmin1sint  = Integer.parseInt(addedmin1s[0]   +""+addedmin1s[1] +""  +addedmin1s[2] +""    +addedmin1s[3]   +"",2);
		int addedsec10sint = Integer.parseInt(addedsec10s[0]  +""+addedsec10s[1]+""  +addedsec10s[2]+""    +addedsec10s[3]  +"",2);
		int addedsec1sint  = Integer.parseInt(addedsec1s[0]   +""+addedsec1s[1] +""  +addedsec1s[2] +""    +addedsec1s[3]   +"",2);
		
	}

}
