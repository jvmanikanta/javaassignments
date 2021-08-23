package com.training.array;

public class DynamiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][] = new int[3][]; 
		marks[0] = new int[3];
		marks[1] = new int[2];
		marks[2] = new int[1];
		System.out.println(marks[0][0]);
		
		marks[0][0] = 90;
		marks[0][1] = 80;
		marks[0][2] = 70;
		
		marks[1][0] = 50;
		marks[1][1] = 60;
		
		marks[2][0] = 25;
		
		for (int row[]: marks) {
			for(int val: row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		int stats[] = new int[] {10, 20, 30, 40, 50};
		for(int i: stats) {
			System.out.println(i);
		}


	}

}
