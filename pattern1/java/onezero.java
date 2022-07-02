package pattern1.java;

public class onezero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int sum=i+j;
				if(sum%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}

}
//assume elements in matrix format I+j whereveer even priting 1 else 0