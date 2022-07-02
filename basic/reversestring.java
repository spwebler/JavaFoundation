package basic;

public class reversestring {
	public static void main(String[] args) 
{
		
		
	String s="Hellow";
	System.out.println(s.length());
	String b="";
	//for(int i=0;i<s.length();i++)
	for(int i=s.length()-1;i>=0;i--)
	{
		b+=s.charAt(i);
		
	}
		System.out.println(b);
		
		
		
		
		
		
		
}
}

