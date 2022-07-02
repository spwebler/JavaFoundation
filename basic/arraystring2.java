package basic;
import java.util.*;
public class arraystring2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		String arr[]=new String[size];
		int total=0;
		for(int i=0;i<size;i++)
		{
			
			arr[i]=sc.next();
			total=total+arr[i].length();
			
			
			
		}
		System.out.println(total);
		// TODO Auto-generated method stub

	}

}
