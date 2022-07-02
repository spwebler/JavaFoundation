package basic;
import java.util.*;
public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println(s.length());
		System.out.println("Entered your Name:"+ s);
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		String name="shraddha";
		String name2="shraddha2";
		//s1>s2 +ve
		//s1=s2 0
		//s1<s2 -ve
		
		if(name.compareTo(name2)==0)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("not same");
		}
        //substring
		String fullstring="My name is";
		String sub=fullstring.substring(0,5);
		System.out.println(sub);
		//strings are immutable
		
		}

}
