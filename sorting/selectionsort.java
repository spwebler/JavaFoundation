package sorting;

	public class selectionsort {
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
			int smallest =i;
			for(int j=1+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
			printArray(arr);

		}

	}

/****
	considers first element as smallest then compare further swpas with the smallest incase further smallest found
	swaps and calls function
	Complexity n*n
	O(n2)
	
	
	
	*****/