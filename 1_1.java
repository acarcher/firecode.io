// Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. Assume you have 9 numbers between 1 to 10 and only one number is missing.


// findMissingNumber({1,2,4,5,6,7,8,9,10}) --> 3
// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int findMissingNumber(int[] arr) {
    Arrays.sort(arr);
    for(int i = 0; i < arr.length-1; i++){
        if (arr[i+1] != arr[i] + 1){
            return arr[i] + 1;
        }    
    }
    return -1;
}