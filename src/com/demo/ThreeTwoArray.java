package com.demo;

public class ThreeTwoArray {
	// java program multidimensional array in multiple lines
	public static void main(String[] args) {
		int multidim[][]=new int[3][2];
		multidim[0][0]=1;
		multidim[0][1]=2;

		multidim[1][0]=4;
		multidim[1][1]=5;

		multidim[2][0]=7;
		multidim[2][1]=8;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(multidim[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
	}
}
