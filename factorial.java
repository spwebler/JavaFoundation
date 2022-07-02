
public class factorial {
 public static int fact(int n)
 {
	 if(n==1 || n==0)
	 {
		 return 1;
	 }
	int fact1= fact(n-1);
	int facto=n*fact1;
return facto;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int ans=fact(n);
System.out.println(ans);
	}

}
