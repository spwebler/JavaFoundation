package basic;

public class tip {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println("TIP");
			}
			else if(i%5==0)
			{
				System.out.println("TOP");
			}
			
			else if(i%5==0 && i%3==0)
			{
				System.out.println("TOP");
			}
			else
			{
				System.out.println(i);
			}
		}
		
		
	
	}

}
