package sorting;

public class Insertionsort {
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		
		
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={7,8,3,1,2};
		for(int i=1;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
		//placement
			arr[j+1]=current;
		}
		printArray(arr);

	}
	
}




/***
divides array in sorted and unsorted array 
7 8 3 1 2
7 | 8 3  1 2
compares 8 with 7 untill small then add elemts from unsorted to sorted
7 8 | 3 1 2
3 comapre with 7 8 small so push it in osrted
3 7 8|1 2
1 3 7 8|2

***/
