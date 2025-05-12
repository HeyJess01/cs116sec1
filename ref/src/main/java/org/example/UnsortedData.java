package org.example;

public class UnsortedData {
	public static int countOutOfPosition(double[] d)
	{
		int total=0;
		for (int i=0;i<d.length-1;i++ )
		{
			int j=i+1, countBad=0;
			while (j < d.length)
			{
				if (d[j]<d[i])
					countBad++;
				j++;
			}
			total=total+countBad;
		}
		return total;
	}
	
	public static void bubble(double[] d)
	{
		double temp;
		for (int i=0;i<d.length-1;i++ )
			if (d[i]>d[i+1])
			{
				temp=d[i+1];
				d[i+1]=d[i];
				d[i]=temp;
			}
	}
}
