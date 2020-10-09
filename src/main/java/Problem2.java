public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        for(int k = data.length; k > 0; k--) {
            for (int i = 0; i < k-1; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }//end if
            }//end inner for
        }//end outer for
    }
}
