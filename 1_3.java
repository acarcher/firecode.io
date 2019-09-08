// Write a method that takes in an array of ints and uses the Bubble Sort algorithm to sort the array 'in place' in ascending order. The method should return the same, in-place sorted array.

// Note: Bubble sort is one of the most inefficient ways to sort a large array of integers. Nevertheless, it is an interview favorite. Bubble sort has a time complexity of O(n2). However, if the sample size is small, bubble sort provides a simple implementation of a classic sorting algorithm.

// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] bubbleSortArray(int[] arr){
    int temp;
    for (int i = arr.length-1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }    
    }

    return arr;
}