import java.util.*;
import java.io.*;
public class SortPrepSelection {

	public static void main(String[] args)throws IOException {
		int[] smallArray1 = new int[16];
		int[] smallArray2 = new int[16];
		int[] smallArray3 = new int[16];
		int[] bigArray1 = new int[2000];
		int[] bigArray2 = new int[2000];
		int[] bigArray3 = new int[2000];
		
		//1-16 Ordered file array
		String orderedFile = "orderedFile.txt";
		File orderedFile1 = new File(orderedFile);
		Scanner smallFileScan1 = new Scanner(orderedFile1);
		for(int i = 0; i < smallArray1.length; i++) {
			smallArray1[i] = smallFileScan1.nextInt();
		}
		smallFileScan1.close();
		//System.out.println(Arrays.toString(smallArray1));
		
		//1-16 Reverse file array
		String reverseFile = "ReverseFile.txt";
		File reverseFile1 = new File(reverseFile);
		Scanner smallFileScan2 = new Scanner(reverseFile1);
		for(int i = 0; i < smallArray2.length; i++) {
			smallArray2[i] = smallFileScan2.nextInt();
		}
		smallFileScan2.close();
		//System.out.println(Arrays.toString(smallArray2));
		
		//1-16 Random file array
		String unorderedFile = "RandomFile.txt";
		File unorderedFile1 = new File(unorderedFile);
		Scanner smallFileScan3 = new Scanner(unorderedFile1);
		for(int i = 0; i < smallArray3.length; i++) {
			smallArray3[i] = smallFileScan3.nextInt();
		}
		smallFileScan3.close();
		//System.out.println(Arrays.toString(smallArray3));
		
		
		//1-2000 Ordered file array
		String orderedFile2 = "OrderedFile2.txt";
		File bigOrderedFile = new File(orderedFile2);
		Scanner bigOrderedFileScan = new Scanner(bigOrderedFile);
		for(int i = 0; i < bigArray1.length; i++) {
			bigArray1[i] = bigOrderedFileScan.nextInt();
		}
		bigOrderedFileScan.close();
		//System.out.println(Arrays.toString(bigArray1));
		
		//1-2000 Reverse file array
		String reverseFile2 = "ReverseFile2.txt";
		File bigReverseFile = new File(reverseFile2);
		Scanner bigReverseFileScan = new Scanner(bigReverseFile);
		for(int i = 0; i < bigArray2.length; i++) {
			bigArray2[i] = bigReverseFileScan.nextInt();
		}
		bigReverseFileScan.close();
		//System.out.println(Arrays.toString(bigArray2));
		
		//1-2000 Random file array
		String randomFile2 = "RandomFile2.txt";
		File bigRandomFile = new File(randomFile2);
		Scanner bigRandomFileScan = new Scanner(bigRandomFile);
		for(int i = 0; i < bigArray3.length; i++) {
			bigArray3[i] = bigRandomFileScan.nextInt();
		}
		bigRandomFileScan.close();
		//System.out.println(Arrays.toString(bigArray3));
		
		Scanner k = new Scanner(System.in);
		System.out.println("Which sorting method would you like to use?\nEnter 1 for Selection sort\n2 for Bubble Sort\n3 for Insertion Sort");
		int sorting = k.nextInt();
		k.nextLine();
		System.out.println("Which array would you like to use?\nEnter 1 for 1-16\n2 for 1-2000");
		int arrayChoice = k.nextInt();
		k.nextLine();
		
		if(sorting == 1 && arrayChoice == 1) {
			System.out.println (" ========================= ");
			System.out.println ("Testing selection sort with smaller array: ");
			System.out.println (" --- best case ---");
			selectionSort(smallArray1);
			System.out.println (" --- worst case ---");
			selectionSort(smallArray2);
			System.out.println (" --- average case ---");
			selectionSort(smallArray3);
		}
		else if(sorting == 1 && arrayChoice == 2) {
			System.out.println (" ========================= ");
			System.out.println ("Testing selection sort with larger array: ");
			System.out.println (" --- best case ---");
			selectionSort(bigArray1);
			System.out.println (" --- worst case ---");
			selectionSort(bigArray2);
			System.out.println (" --- average case ---");
			selectionSort(bigArray3);
		}
		else if(sorting == 2 && arrayChoice == 1) {
			System.out.println (" ========================= ");
			System.out.println ("Testing bubble sort with smaller array: ");
			System.out.println (" --- best case ---");
			bubbleSort(smallArray1);
			System.out.println (" --- worst case ---");
			bubbleSort(smallArray2);
			System.out.println (" --- average case ---");
			bubbleSort(smallArray3);
		}
		else if(sorting == 2 && arrayChoice == 2) {
			System.out.println (" ========================= ");
			System.out.println ("Testing bubble sort with larger array: ");
			System.out.println (" --- best case ---");
			bubbleSort(bigArray1);
			System.out.println (" --- worst case ---");
			bubbleSort(bigArray2);
			System.out.println (" --- average case ---");
			bubbleSort(bigArray3);
		}
		else if(sorting == 3 && arrayChoice == 1) {
			System.out.println (" ========================= ");
			System.out.println ("Testing insertion sort with smaller array: ");
			System.out.println (" --- best case ---");
			insertionSort(smallArray1);
			System.out.println (" --- worst case ---");
			insertionSort(smallArray2);
			System.out.println (" --- average case ---");
			insertionSort(smallArray3);
		}
		else if(sorting == 3 && arrayChoice == 2) {
			System.out.println (" ========================= ");
			System.out.println ("Testing insertion sort with larger array: ");
			System.out.println (" --- best case ---");
			insertionSort(bigArray1);
			System.out.println (" --- worst case ---");
			insertionSort(bigArray2);
			System.out.println (" --- average case ---");
			insertionSort(bigArray3);
		}

	}
	public static void selectionSort(int[] array) {

		int temp, min, exchanges = 0, comparisons = 0;
		int numberOfItems = array.length;
		for (int pass=0; pass != numberOfItems - 1; pass++) {
		 min = pass;
		 for (int index = pass+1; index != numberOfItems; index++) {
		comparisons++;
		if (array[index] < array[min])
		 min = index;
		 } // end inner loop
		 temp = array[min];
		 array[min] = array[pass];
		 array[pass] = temp;
		 exchanges++;
		 } // end outer loop
		 System.out.println("Selection Sort: Number of Exchanges: " +
		exchanges);
		 System.out.println("Selection Sort: Number of Comparisons: " +
		comparisons);
		 System.out.println ("Sorted file:");
		 for (int i= 0; i < array.length; i++)
		 System.out.print (array[i] + " ");
		 System.out.println ();
		 } // end selection sort

	public static void bubbleSort(int arr[]) {
		int comparisons = 0, exchanges = 0;
		int temp;
		int numberOfItems = arr.length;
	    boolean cont = true;     
		for (int pass=1; pass != numberOfItems; pass++)	{ 
	       if (cont) {    
		      cont = false;  
	          for (int index=0; index != numberOfItems-pass; index++) {
	        	  comparisons++;
	        	  if (arr[index] > (arr[index+1])) {
						temp = arr[index];
						arr[index] = arr[index+1];
						arr[index+1] = temp;
						exchanges++;
	                    cont = true;
	        	  }  // end inner if              
	          }  // end inner for            
			}//end outer if(cont)
	           else
	              break;  // end outer if
					}
		
		System.out.println("Bubble Sort: Number of Exchanges: " +
				exchanges);
		System.out.println("Bubble Sort: Number of Comparisons: " +
				comparisons);
		System.out.println ("Sorted file:");
		for (int i= 0; i < arr.length; i++)
			System.out.print (arr[i] + " ");
			System.out.println ();
	}//end bubble sort
	
	public static void insertionSort(int[] array){
		int exchanges = 0, comparisons = 0;
		for(var i = 1; i < array.length; i++){
			var current = array[i];
			var j = i - 1;
			while(j >= 0 && array[j] > current) {
				if(array[current] > array[j + 1]) {
					exchanges++;
				}
				array[j + 1] = array[j];
				j--;
				comparisons++;
			}
			array[j + 1] = current;
		}
		System.out.println("Insertion Sort: Number of Exchanges: " +
				exchanges);
		System.out.println("Insertion Sort: Number of Comparisons: " +
				comparisons);
		System.out.println ("Sorted file:");
		for (int i= 0; i < array.length; i++)
			System.out.print (array[i] + " ");
			System.out.println ();
	}//end insertion sort
}//end class




