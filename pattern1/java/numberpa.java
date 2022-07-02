package pattern1.java;

public class numberpa {
	public static void main(String[] args)
	{
		
	int n=5;
		for(int i=1;i<=n;i++){
			//spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			
			//print row numbers row times
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		/*int n=5;

		       for(int i=1; i<=n; i++) {
		           //spaces
		           for(int j=1; j<=n-i; j++) {
		               System.out.print(" ");
		           }
		 
		           //numbers
		           for(int j=1; j<=i; j++) {
		               System.out.print(i+" ");
		           }
		           System.out.println();
		       }
		   */


		
		
		
		
	
}
}
