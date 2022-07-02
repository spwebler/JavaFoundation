
public class fibonacci {

	
	public static void printfib(int a,int b,int n)
	{
		if(n==0)
		{
			return;
		}
		int c=a+b;
		System.out.println(c);
		printfib(b,c,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		int n=7;
		printfib(a,b,n-2);
//n-1 determines how many pending numbers to be printed
	}

}
