// Write a method that searches an Array of integers for a given integer using the
// Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
// You can assume that the given array of integers is already sorted
// in ascending order.

// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean binarySearch(int[] arr, int n){
    int low = 0;
    int high = arr.length - 1;
    
    while (low <= high) {
        int mid = (low + high) / 2;
        
        if (arr[mid] < n) {
            low = mid + 1;
        }
        else if (arr[mid] > n) {
            high = mid - 1;
        }
        else if (arr[mid] == n) {
            return true;
        }
    }
    
    return false;
}