package basic;

public class Stringbuilder {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
  StringBuilder sb=new StringBuilder("Shraddha Prabhu");
  System.out.println(sb.charAt(0));
  
  //set char
  sb.setCharAt(0,'P');
  System.out.println(sb);
  
  //insert
  sb.insert(0, 'S');
  System.out.println(sb);
  
  //delete
  
  sb.delete(1, 3);
  System.out.println(sb);
  
  sb.insert(1,'h');
  System.out.println(sb);
  
  
  //append
  sb.append("d");
  System.out.println(sb);
	}

}

/*Strings are imuutable howver in stringbuilder we can store the string in one place fast efficient
we can insert delete in SB

--in delete ending index is non inclusive

--append in case of append in same SB everythin gets added however in case of string new string gets generated every-time and it takes memory
*/