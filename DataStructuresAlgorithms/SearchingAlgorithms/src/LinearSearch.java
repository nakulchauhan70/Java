

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 89, 45, 66, 0, 100, 34, 56, 23, 01, 9, 849, 9, 66, 354, 6 };

		int index = linearSearch(arr, 9);
		
		if(-1!=index) {
			System.out.println("Element found at index : "+index);
		}else {
			System.out.println("Element is not found");
		}

	}

	private static int linearSearch(int[] arr, int x) {

		int length = arr.length;

		for (int i = 0; i < length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}

		return -1;
	}

}
