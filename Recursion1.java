
public class Recursion1 {
	
	public static void printsum(int i,int n,int sum)
	{
		
		if(i==n)
		{
			//last case
			sum+=i;
			System.out.println(sum);
			return;
		}
		
		sum+=i;
		
		printsum(i+1,n,sum);

		//i+1 next iterator n final va;ue ,sum to store sum
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsum(1,5,0);

	}

}
