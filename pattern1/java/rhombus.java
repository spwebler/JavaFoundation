package pattern1.java;

public class rhombus {

	
	public static void main(String[] args)
	{
	int n=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
