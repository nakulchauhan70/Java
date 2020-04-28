
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 89, 45, 66, 0, 7, 100, 34, 56, 23, 01, 9, 849, 9, 66, 354, 6,90 };

		arr = insertionSort(arr,arr.length);
		printArr(arr);

	}

	private static int[] insertionSort(int[] arr, int length) {
		
		for(int i=1;i<length;i++) {
			int key = arr[i];
			
			int j =i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			
			arr[j+1] = key;
		}
		
		return arr;
	}
	
	private static void printArr(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
