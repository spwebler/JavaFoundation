package basic;
import java.util.Scanner;
public class array2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] marks=new int[row][col];
		for (int i=0;i<row;i++){
			for(int j=0;j<col;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		// TODO Auto-generated method stub

		
		for (int i=0;i<row;i++){
			for(int j=0;j<col;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		int serach=sc.nextInt();
		
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(marks[i][j]==serach)
				{
					System.out.println("Number got"+i+j);
				}
				
				
			}
		}
			}
		
	}


