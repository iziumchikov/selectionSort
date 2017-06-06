package algo;

public class SelectionSort 
{
	private static int k = 1;
	
	public static <T extends Comparable<? super T>>
			void selectionSort(T[] array,int n) 
	{
		for(int last = n - 1; last >= 1; last--)
		{
			int largest = indexOfLargest(array, last + 1);
			T temp = array[largest];
			array[largest] = array[last];
			array[last] = temp;
			
			System.out.println("*****************************");
			System.out.print("Step " + (k) + ":");
			System.out.println("Largest num: " + temp + "");
			System.out.println("Moving to index:"+ "[" + last + "]");
			
			for(int i = 0; i < array.length;i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
			System.out.println("*****************************");
			k += 1;
		}
	}
	
	private static <T extends Comparable<? super T>>
			int indexOfLargest(T[] array,int size) 
	{
		int indexSoFar = 0;
		
		for(int currIndex = 1; currIndex < size; ++currIndex)
		{
			if(array[currIndex].compareTo(array[indexSoFar]) > 0)
			{
				indexSoFar = currIndex;
			}
		}
		return indexSoFar;
	}
}
