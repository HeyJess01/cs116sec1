package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnsortedDataApp {
	public static void main(String[] args) throws FileNotFoundException {
	
		String fileName;
		final int SIZE=100;	
		Scanner userIn = new Scanner(System.in);
		System.out.print("What is the name of the input file? ");
		fileName = userIn.next();
		
		File inputFile = new File( fileName );
		Scanner scan = new Scanner( inputFile );
		int count=0;
		double [] data = new double[SIZE];
		
		while (count < SIZE)
		{
			data[count] = scan.nextDouble();
			count++;
		}
		
		System.out.println("Total Out of Position BEFORE Bubble = " + UnsortedData.countOutOfPosition(data));
		
		UnsortedData.bubble(data);

		System.out.println("Total Out of Position AFTER Bubble = " + UnsortedData.countOutOfPosition(data));
	}
	
}
