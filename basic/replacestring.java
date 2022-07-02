package basic;
import java.util.*;

public class replacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String result="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e')
			{
				result+='i';
			}
			else
			{
				result+=s.charAt(i);
			}
		}
		System.out.print(result);
		

	}

}
