package DSAARRAY;

public class array1 {
	public static int printmax(int[] arr)
	{
		
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	
	return max;
	}
	
	
	public static int printmin(int[] arr)
	{
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array={2,3,66,1};

int ans=printmax(array);
int ans1=printmin(array);
System.out.println(ans);
System.out.println(ans1);
	}

}
