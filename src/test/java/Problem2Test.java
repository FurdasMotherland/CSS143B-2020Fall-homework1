import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {2},
                {3},
                {1,3},
                {7,3},
                {2,5,9},
                {5,2,7},
                {9,8,6},
                {6,2,1,11},
                {2,2,2,2,1},
                {11,7,14,23,4,1},
                {3,6,2,5,3},
        };

        for(int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            for (int k = 0; k < inputs[i].length-1; k++) {
                //System.out.print(inputs[i][k] + " ");
                assert(inputs[i][k] <= inputs[i][k + 1]);
            }//end for
            //System.out.println();
        }//end outer for

    }
}
