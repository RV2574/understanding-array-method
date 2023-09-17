import java.util.Arrays;
public class compare {
    public static void main(String[] args) {
        // get the array
        int intArr[] = {1,2,3,5};

        // get the second array
        int intArr1[]= {1,2,3,4};
        // to compare both arrays
int result = Arrays.compare(intArr,intArr1);

if(result == 0) {
    System.out.println("Arrays are equal."); 
}
else if(result < 0) {
    System.out.println("intarr is less than intarr1");
} else {
System.out.println("intarr is greater than intarr1");
}


    }
}
