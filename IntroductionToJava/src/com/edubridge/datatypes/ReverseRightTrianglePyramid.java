package com.edubridge.datatypes;

import java.util.Scanner;

public class ReverseRightTrianglePyramid {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
		
   System.out.println("enter number of rows");
   
   int row=s.nextInt();
		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}

}
}
