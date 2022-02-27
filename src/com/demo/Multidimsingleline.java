package com.demo;

public class Multidimsingleline {
	//program using multimdimensional array in single line
	public static void main(String[] args)
	{
		int matrix[][] = {{1,2}, {3, 4}};

		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}

	}

}
