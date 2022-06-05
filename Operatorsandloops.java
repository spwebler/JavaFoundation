import java.util.*;
public class day4 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=0;i<=num;i++)
	{int b=0;
		if(i%2==0)
		{
			b=i;
			System.out.println(b);
			
		}
		
	}
  ******************************************************************************************************************************************
//above for priting even numbers	
	/*for(; ;) {
        System.out.println("infinite oriting");
    }*/
  
 ******************************************************************************************************************************************* 
  /*Q  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.*/

	System.out.println("Eneter either 1 or 2:");
	int k=sc.nextInt();
do
{
	int mark=sc.nextInt();
	if(mark>=90 && mark<=100)
	{
		System.out.println("very good");
	}
	else if(mark<=90 && mark>=80)
	{
		System.out.println("good");
	}
	else
	{
		System.out.println("fine");
	}
}
while(k==1);

	
	

}
}
