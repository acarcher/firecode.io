//Write a method that takes in a String and returns the reversed version of the String.

// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String reverseString(String str){
    String inputString = str;
    
    if (inputString == null) return null;
    
    int start = 0;
    int end = inputString.length()-1;
    char[] charArray = inputString.toCharArray();
    char temp;
    
    while (end > start) {
        temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        start++;
        end--;
    }
    
    return new String(charArray);
}