package pattern1.java;

public class inverted180 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=4;
		for(int i=1;i<=n;i++)
		{
			
			//inner for loop for spaces since sumation of spaces and star equals n no of rows
			
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//for star
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			//for row print
			System.out.println("  ");
		}
		
		
		
		
		
		
		
		
	}
	
	
}
