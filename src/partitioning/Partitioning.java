package partitioning;

/**
 * Created by Sean Keane on 11/03/2016.
 * <p/>
 * Utilities to partition an integer array
 */
public class Partitioning {

    private static int[] integerArray;
    private static int arraySize;

    public Partitioning(int newArraySize) {
        arraySize = newArraySize;
        integerArray = new int[arraySize];
        generateRandomArray();
    }

    public void partitionArray(int pivot) {

        int leftPointer = -1;
        int rightPointer = arraySize;

        while (true) {
            //wait until left pointer becomes a value
            while (leftPointer < (arraySize - 1) && integerArray[++leftPointer] < pivot) ;
            System.out.println(integerArray[leftPointer] + " in index " + leftPointer
                    + " is bigger than the pivot " + pivot);
            printHorzArray(leftPointer, rightPointer);

            while (rightPointer > 0 && integerArray[--rightPointer] > pivot) ;
            System.out.println(integerArray[rightPointer] + " in index " + rightPointer
                    + " is less than the pivot " + pivot);
            printHorzArray(leftPointer, rightPointer);

            if (leftPointer >= rightPointer) {
                break;
            } else {
                swapValues(leftPointer, rightPointer);
            }

        }

    }

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            //generate number between 10 to 59
            integerArray[i] = (int) (Math.random() * 50) + 10;
        }
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

    public void runQuicksort() {
        Quicksort quicksort = new Quicksort(integerArray);
        quicksort.quickSort(0, 9);
    }
}
