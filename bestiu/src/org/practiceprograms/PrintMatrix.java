package org.practiceprograms;

public class PrintMatrix {

	public static void main(String[] args) {
		      
		        int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        System.out.println("The elements of the 3x3 matrix are:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
	}

