public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        int lowIndex = 0;
        int highIndex = data.length-1; //These indices will be used to define subarray
        int i = data.length/2;

        while( lowIndex <= highIndex ) {
            i = (highIndex-lowIndex)/2 + lowIndex;
            if( data[i] < target ) { //when target is greater than middle value
                lowIndex = i+1;
            }//end if
            else if ( data[i] > target ) { //when target is less than middle value
                highIndex = i-1;
            }//end else if
            else return i; //target found

        }//end while
        return -1;
    }//end binarySearch
}//end class
