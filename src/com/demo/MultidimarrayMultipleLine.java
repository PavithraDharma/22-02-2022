package com.demo;

public class MultidimarrayMultipleLine {
	// java program multidimensional array in multiple lines
	public static void main(String[] args) {
		int multidim[][]=new int[3][3];
		multidim[0][0]=1;
		multidim[0][1]=2;
		multidim[0][2]=3;

		multidim[1][0]=4;
		multidim[1][1]=5;
		multidim[1][2]=6;

		multidim[2][0]=7;
		multidim[2][1]=8;
		multidim[2][2]=9;

		for(int i=0;i<multidim.length;i++)
		{
			for(int j=0;j<multidim.length;j++)
			{
				System.out.print(multidim[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
	}
}


