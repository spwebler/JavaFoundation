package basic;
import java.util.*;

public class deletearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String neww="";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='@')
	{
		
		break;
	}
	else
	{
		neww+=s.charAt(i);
	}
}
System.out.print(neww);
	}

}
