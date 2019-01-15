package newProject;

import java.util.Scanner;

 

public class snail {	

	

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();

		

		int[][] arr = new int[a][b];

		int count = 1;

		int i=0, j=0;

 

		

		int c = a<b ? a : b;

		

		for(int k=0; k< ((c/2)+(c%2))  ;k++)

		{

			

			i = j =k;

			

			while(j < b-1 -k && arr[i][j] ==0)

			{

				arr[i][j] = count;

				j++;

				count++;

			}

			

					

			while(i < a-1 -k && arr[i][j] ==0)

			{

				arr[i][j] = count;

				i++;

				count++;

			}

			


			while(j > 0 +k && arr[i][j] ==0)

			{

				arr[i][j] = count;

				j--;

				count++;

			}

			

			

			while(i  > 0+ k && arr[i][j] ==0)

			{

				arr[i][j] = count;

				i--;

				count++;

			}

		}

		

		if(a %2 ==1 && b%2 ==1)

		{

			arr[a/2][b/2] = count;

		}

			


		for(i =0; i < a; i ++)

		{

			for(j=0; j < b; j++)

			{

				System.out.print(" " + arr[i][j] + " ");

			}

			System.out.println();

		}

	}

}
