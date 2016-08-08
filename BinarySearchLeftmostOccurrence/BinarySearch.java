package BinarySearchLeftmostOccurrence;
/**
 * This class implements a method that returns 
 * the leftmost occurrence of passed element 
 * in the array
 * @author shobhit agarwal
 *
 */
public class BinarySearch{
	
	/**
	 * This method uses recursive approach
	 * for searching for an element
	 * implementing binary search
	 * @param arr[], searching array
	 * @param first
	 * @param last
	 * @param target, element to be searched
	 * @return
	 */
	 public int binarySearchMethod(int arr[], int first, int last, int target){
		int mid = (first + last) / 2;
		if (first > last) { // target not found condition
			return -1;
		} else if (target < arr[mid]) {
			return binarySearchMethod(arr, first, mid - 1, target);
		} else if (target > arr[mid]) {
			return binarySearchMethod(arr, mid + 1, last, target);
		} else {
			mid = checkLeftOccurrence(arr, mid);
			return mid; // target found condition
		}
	} // End of binaryFunction

	public int checkLeftOccurrence(int arr[], int mid) {
		int leftPlace = mid;

		for (int index = mid - 1; index >= 0; index--) {
			if (arr[index] == arr[mid]) {
				leftPlace = index;
			}
		}

		return leftPlace;
	}

}