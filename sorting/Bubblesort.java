package sorting;

public class Bubblesort {
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
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
		printArray(arr);

	}

}
//big o notaion ignoeres constant first loop runs n times
/**
 * second loop returns n-1-i compares ignores already sorted algorithm
 * total complexity n-1+
 * n-3times in second loop big o2
 * 
 * 7 8 3 1 2
 * 7 will compare 8 and push largest element to last
 * second loop will places second largest element at last
 * last elemenet auto saved
 * 1 compare adjacent elements
 * 7 3 1 2 8
 * 2 loop
 * ignore last element
 * 3 1 2 7 8
 * ignore 2 last elm
 * 1 2 3 7 8
 * 4 llop
 * compare 1 2 
 * 1 2 3 7 8
 * 
 * 
 * 
 * **/
