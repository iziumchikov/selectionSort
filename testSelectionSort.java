package algo;

public class testSelectionSort {

	public static void main(String[] args) {
		
		Integer[] anArray = { 15, 8, 10, 2, 5 };
		
		System.out.println("Test for Selection Sort "
									+ "Algorithm");
		System.out.print("Array is: ");
		
		for (int i = 0; i < anArray.length; i++){
			System.out.print(anArray[i] + " ");
		}

		System.out.println("\n");
		SelectionSort.selectionSort(anArray,anArray.length);
		
		System.out.println("\nSorted array: ");
		
		for (int i = 0; i < anArray.length; i++){
			System.out.print(anArray[i] + " ");
		}
	}
}
 
