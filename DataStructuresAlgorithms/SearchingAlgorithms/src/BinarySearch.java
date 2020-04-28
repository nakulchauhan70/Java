
public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = { 89, 45, 66, 0, 100, 34, 56, 23, 01, 9, 849, 9, 66, 354, 6 };

		arr = selectionSort(arr);
		int index = binarySearch(arr,0,arr.length-1,1);
		
		if(-1!=index) {
			System.out.println("Element found at index : "+index);
		}else {
			System.out.println("Element is not found");
		}
		
	}
	
	private static int[] selectionSort(int[] arr) {
		int length = arr.length;
		
		for(int i=0;i<length;i++) {
			int min_index = i;
			for(int j=i+1;j<length;j++) {
				if(arr[j]<arr[min_index])
					min_index = j;
			}
			
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
	}

	static int binarySearch(int[] a, int start, int end, int element) {
		if(end>=start) {
			int mid = start+(end-start)/2;
			if(a[mid]==element) 
				return mid;

			if(a[mid]>element) 
				return binarySearch(a, start, mid-1, element);
			
			return binarySearch(a,  mid+1, end, element);
		}
		return -1;
	}

}
