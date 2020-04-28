
public class SelectionSort2 {

	public static void main(String[] args) {

		int[] arr = { 89, 45, 66, 0, 100, 34, 56, 23, 01, 9, 849, 9, 66, 354, 6 };

		arr = selectionSort(arr);
		printArr(arr);
	}

	//Unstable Sort
	private static int[] selectionSort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {
			int maxIndex = 0;
			
			for(int j=1;j<=i;j++) {
				if(arr[j]>arr[maxIndex])
					maxIndex = j;
			}
			
			int temp = arr[i];
			arr[i]= arr[maxIndex];
			arr[maxIndex] = temp;
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
