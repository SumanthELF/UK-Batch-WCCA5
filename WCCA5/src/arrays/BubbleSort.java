package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {20,18,27,77,34,45,66,12,8,89,103,43};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 1; j < arr.length - i; j++) 
			{
				if (arr[j-1] > arr[j]) 
				{
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
