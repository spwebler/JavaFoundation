
public class calpower {

	
		// TODO Auto-generated method stub
		public static int calcpower(int x,int n)
		{
		if(n==0)//base cond 1
		{
			return 1;
		}
		
		if(x==0)//base cond 2
		{
			return 0;
		}
		
		int xpow=calcpower(x,n-1);
	//kaam
		int xpown=x*xpow;
		return xpown;
		
		
		}
		
		
		public static void main(String[] args) {
			int x=2,n=5;
			int ans=calcpower(x,n);
			System.out.println(ans);

	}

}
