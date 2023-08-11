package arrays;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {20,18,27,77,34,45,66,12,8,89,103,43};
		
		for (int i = 0; i < arr.length; i++) 
		{
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[j] < arr[minIndex]) 
				{
					minIndex = j;
				}
			}
			if(minIndex!=i) 
			{
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] =temp;
			}
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
