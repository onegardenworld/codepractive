package newProject;

import java.util.Scanner;

public class peach {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int[] peach = new int[total];
		int[] price = new int[3]; //price 0 -> a, 1 -> b, 2 -> c
		int aGrade = 0;
		int bGrade = 0;
		int cGrade = 0;
		for(int i =0; i < 3; i++)
		{
			 price[i]= sc.nextInt();
		}
		
		for(int i = 0; i < total; i++)
		{
			peach[i] = sc.nextInt() ;
			if(peach[i] >= 800)
			{
				aGrade = aGrade + price[0];
			}
			
			else if(peach[i] >= 700)
			{
				bGrade = bGrade + price[1];			
			}

			else if(peach[i] >= 600)
			{
				cGrade = cGrade + price[2];
			}			
		}
		System.out.println(aGrade);
		System.out.println(bGrade);
		System.out.println(cGrade);
		
	}

}


/*&



10 600 500 400
850
700
650
350
900
599
900
720
660
750


*/
