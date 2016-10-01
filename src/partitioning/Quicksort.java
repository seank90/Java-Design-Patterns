package partitioning;

/**
 * Created by Sean Keane on 11/03/2016.
 * <p/>
 * Utility that sorts an integer array in acceding order using quicksort
 */
class Quicksort {

    private static int[] integerArray;
    private static int arraySize;

    Quicksort(int[] integerArray) {
        this.integerArray = integerArray;
        this.arraySize = this.integerArray.length;
    }

    public void quickSort(int left, int right) {
        if (right - left <= 0) {
            //array is sorted
            return;
        } else {
            int pivot = integerArray[right];
            System.out.println("Value in right " + integerArray[right] + " is made pivot");
            System.out.println("Left : " + left + " right : " + right + " pivot: " + pivot
                    + " Sent to be partitioned");

            int pivotLocation = partitionArray(left, right, pivot);

            System.out.println("Value in left " + integerArray[left] + " is made pivot");

            quickSort(left, pivotLocation - 1);
            quickSort(pivotLocation + 1, right);
        }

    }

    private int partitionArray(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;

        while (true) {

            //wait until left pointer becomes a value
            while (integerArray[++leftPointer] < pivot) ;
            System.out.println(integerArray[leftPointer] + " in index " + leftPointer
                    + " is bigger than the pivot " + pivot);
            printHorzArray(leftPointer, rightPointer);

            while (rightPointer > 0 && integerArray[--rightPointer] > pivot) ;
            System.out.println(integerArray[rightPointer] + " in index " + rightPointer
                    + " is less than the pivot " + pivot);
            printHorzArray(leftPointer, rightPointer);

            if (leftPointer >= rightPointer) {
                System.out.println();
                break;
            } else {
                swapValues(leftPointer, rightPointer);
            }
        }
        swapValues(leftPointer, right);

        return leftPointer;
    }

    private void swapValues(int leftPointer, int rightPointer) {
        int temp = integerArray[leftPointer];
        integerArray[leftPointer] = integerArray[rightPointer];
        integerArray[rightPointer] = temp;
        System.out.println(integerArray[leftPointer] + " was swapped for " + integerArray[rightPointer]);
    }

    static void printHorzArray(int i, int j) {
        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {
            System.out.format("| %2s " + " ", n);
        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {
            System.out.print(String.format("| %2s " + " ", integerArray[n]));
        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        if (i != -1) {
            // Number of spaces to put before the F
            int spacesBeforeFront = 5 * i + 1;

            for (int k = 0; k < spacesBeforeFront; k++)
                System.out.print(" ");

            System.out.print("L");

            // Number of spaces to put before the R
            int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;

            for (int l = 0; l < spacesBeforeRear; l++)
                System.out.print(" ");

            System.out.print("H");
            System.out.println("\n");
        }
    }


}
