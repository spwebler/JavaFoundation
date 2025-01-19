package Arrays;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
l.add(2);
l.add(2);
l.add(10);
System.out.print("List"+l);
System.out.println(" ");
l.remove(2);
for(int i=0;i<l.size();i++)
{
	System.out.println (l.get(i)+" ");
}
//sum of all elements
System.out.println(" ");
int sum=0;
for(int i=0;i<l.size();i++)
{
	sum=sum+l.get(i);
	
}
System.out.println("Sum"+sum);
//maximum value largest value
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<l.size();i++)
{
	if(l.get(i)>max)
	{
		max=l.get(i);
	}
	
}
System.out.println("max"+max);

if(l.contains(27))
{
	System.out.println("Exsist");
}
else
{
	System.out.println("Not Exsist");
	

}
for(int num:l)
{
	System.out.println(num);
}
l.set(2,99);
System.out.println(l);

System.out.println(l.indexOf(99));
Collections.sort(l);
//reverse the array
System.out.println("before "+l);
reverselist(l);


System.out.println(l);
//mixed array
ArrayList<Object> mixed=new ArrayList<>();
mixed.add(1);
mixed.add("tom");
mixed.add(2.0);
System.out.println(mixed);
reverselist(l);
//remove specfic elemnt from arraylist
ArrayList<Integer> l1=new ArrayList<>();
l1.add(1);
l1.add(2);
l1.add(2);
l1.add(5);
l1.add(2);
l1.add(9);
l1.add(2);
l1.add(99);
l1.add(10);

System.out.println("Before removing list  :  "+l1);

//count occourances of element


ArrayList<String> arr=new ArrayList<>();
arr.add("tom");
arr.add("xom");
arr.add("rom");
arr.add("lom");
arr.add("shom");
arr.add("rom");
arr.add("rom");
System.out.println("occurance "+occur(arr,"rom"));









//
for(int i=0;i<l1.size();i++)
{
	if(l1.get(i)==2)
	{
		l1.remove(i);
		i--;
	}
}
/* iterator way to remomve to fix idex shifting issue and simultanous modify**/
Iterator<Integer> iterator=l1.iterator();
while(iterator.hasNext())
{
	if(iterator.next()==99)
	{
		iterator.remove();
	}
}
System.out.println("Removed list  :  "+l1);

int maxx=Integer.MIN_VALUE;
int second=0;
for(int i=0;i<l1.size();i++)
{
	if(l1.get(i)>maxx)
	{
		maxx=l1.get(i);
	}
}
System.out.println("maxx "+maxx);
for(int i=0;i<l1.size();i++)
{
	if(l1.get(i)>second && l1.get(i)!=maxx)
	{
		second=l1.get(i);
		
	}
}
System.out.println("secondl "+second);
l.clear();


/***********************marge two arraylist********************************/

ArrayList<Integer> arr1=new ArrayList<>();
arr1.add(1);
arr1.add(3);
arr1.add(4);
arr1.add(5);
arr1.add(6);

ArrayList<Integer> arr2=new ArrayList<>();
arr2.add(2);
arr2.add(7);
arr2.add(8);

ArrayList<Integer> mergedList=mergeTwoSortedLists(arr1,arr2);
System.out.println("merged lis"+mergedList);



/*************************************************************************/
	}
	
	private static ArrayList<Integer> mergeTwoSortedLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mergedList=new ArrayList<>();
		int i=0;int j=0;
		while(i<arr1.size() && j<arr2.size()){
			
			if(arr1.get(i)<arr2.get(j))
			{
				mergedList.add(arr1.get(i));
				i++;
			}
			else 
			{
				mergedList.add(arr2.get(j));
				j++;
			}
			
		}
		
		
		while(i<arr1.size())
		{
			mergedList.add(arr1.get(i));
		}
		
		while(j<arr2.size())
		{
			mergedList.add(arr2.get(j));
			j++;
		}
		return mergedList;
	}

	public static int occur(ArrayList<String> arr, String string) {
		int count=0;
		for(String s:arr)
		{
			if(s.equals(string))
			{
				count++;// TODO Auto-generated method stub
			}
		}
		return count;
	}

	public static void reverselist(ArrayList<Integer> list)
	{
		Collections.reverse(list);
		System.out.println("Reverse list  :  "+list);
	}


}
