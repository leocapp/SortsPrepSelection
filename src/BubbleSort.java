
public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int comparisons = 0, exchanges = 0;
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				comparisons++;
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr [j + 1] = temp;
					exchanges++;
				}
			}
		}
		System.out.println("Bubble Sort: Number of Exchanges: " +
				exchanges);
		System.out.println("Bubble Sort: Number of Comparisons: " +
				comparisons);
		System.out.println ("Sorted file:");
		for (int i= 0; i < arr.length; i++)
			System.out.print (arr[i] + " ");
			System.out.println ();
	}
}
