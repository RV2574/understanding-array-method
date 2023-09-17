import java.util.Arrays;
public class main {
// implementation of binary search
public static void main(String[] args)
{

    int intArr[] = {10,20,30,40,50};
    // initializing the array
    Arrays.sort(intArr);
    // it is used to sort the element in ascending order.

    int intkey = 30;

    System.out.println(intkey + "found at index = " + Arrays.binarySearch(intArr, intkey));
    // method used for binary search on the sorted array and the result will be the index of the element


}

}
