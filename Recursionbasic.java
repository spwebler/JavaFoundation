
public class Recursionbasic {
	
	public static void printNumb(int n)
	{
		//base scenario
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printNumb(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int n=5;
    printNumb(n);
    
	}

}
//descrease and print 5 to 1
//write base class