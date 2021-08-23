package com.training.array;
import java.util.Iterator;
import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks[][] = new int[3][2];
		System.out.println("populating");
		for(int i=0; i<marks.length; i++) {
			for(int j=0; j<2; j++) {
				marks[i][j]= sc.nextInt();
			}
			
		}
		sc.close();
		System.out.println("Iterating");
		for(int i = 0; i < marks.length; i++) {
			for(int j=0; j < 2; j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("using for each");
		for(int row[]: marks) {
			for(int val:row) {
				System.out.print(val+"\t");
			}
			System.out.println();
		}
	}

}
