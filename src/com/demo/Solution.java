//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
package com.demo;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(N+ " x " +i+ " = " +(N*i));
		}
		scan.close();
	}
}

