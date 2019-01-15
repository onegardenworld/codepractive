package newProject;

import java.util.Scanner;

public class IQ150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[][] arr = new int[count][count];
		
		for(int i=0; i < count; i++)
		{
			arr[i][0] = sc.nextInt();
		}
		
		
		for(int i =1; i < count ; i ++)
		{
			for(int j =1; j < count ; j ++)
			{
				arr[j][i] = arr[j][i-1] - arr[j-1][i-1];
			}
		}
		
		for(int i = 0; i < count; i ++)
		{
			for(int j = 0; j < count; j ++)
			{
				System.out.print(" " + arr[i][j] + " ");
				if(i == j)
					break;
			}
			System.out.println();
		}
		
	}

}

/*
 
 input

4
1
5
11
20


 */
