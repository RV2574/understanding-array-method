import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        
        int intArr[]= {10,20,30,40,55};
// initializing the array

Arrays.sort(intArr);
// Sorting these numbers number from smaller to bigger

int intkey = 40;
// special number 
System.out.println(intkey + "found at index = " + Arrays.binarySearch(intArr, 1,3,intkey));


// binary search made easy :
/*Start from the middle : it begins by looking at the number of the sorted list, which is 30 in this case.
 Comparision : it compares the middle number (30) with your special number that is 40.
 Dicision: if the middle number (30) is less than your special number (40) it knows your special number must be in the right becoz 
 the list is sorted.
 Found : hence it finds out the number  
 */
    }
}