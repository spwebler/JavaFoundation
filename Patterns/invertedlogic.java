package pattern1.java;

public class invertedtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=5;i>=1;i--)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
	}

}
/*
considerin case of normal triangle now here we want first row 5 stars and since second for loop 
decides column till i it hosuld have 5 as start to print so same logic reveres


***** 
**** 
*** 
** 
* 


*/
