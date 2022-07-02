package basic;

public class stringbuilderreverse {
	public static void main(String[] args) 
{
		
		StringBuilder sb=new StringBuilder("Hello");
		//dividie by 2 and make first element as last and last as first
		
		for(int i=0;i<sb.length()/2;i++)
		{
			int front=i;
			int back=sb.length()-1-i;
			char frontChar=sb.charAt(front);
			char backchar=sb.charAt(back);
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontChar);
		}
		
		System.out.println(sb);
		
		
}
}
