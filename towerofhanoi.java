
public class towerofhanoi {
	
	public static void towerofhanoi(int n,String src,String helper,String dest)

	{
		//base condition only single disk
		if(n==1)
		{
			System.out.println("Transfer dist "+n+" front "+src+" to "+dest);
			return;
		}
		towerofhanoi(n-1,src,dest,helper);
		System.out.println("Transfer dist "+n+"front "+src+" to "+dest);
		towerofhanoi(n-1,helper,src,dest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=2;
towerofhanoi(n,"s","h","d");

	}

}
