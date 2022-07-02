package basic;

import java.util.Scanner;

public class array {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int[] marks=new int[size];
		
			for(int i=0;i<size;i++){
				marks[i]=sc.nextInt();
			}
			//for printing
			for(int j=0;j<size;j++){
				System.out.print(marks[j]);
			}
			int number=sc.nextInt();
			for(int j=0;j<size;j++)
			{
				if(number==marks[j])
				{
				System.out.println(j);
				}
			}
			
	    }
}
