package question3;

public class MainQuestion3 {
    public static void main(String[] args) {
        // original number sequence
        int[] numbers = {39, 88, 102, 64, 128, 113, 124, 248, 46, 39,
                         92, 117, 184, 351, 52, 60, 104, 77, 208, 94};

        System.out.println("original sequence:");
        printArray(numbers);

        // remove 92 using array-based queue
        ArrayRemover arrayRemover = new ArrayRemover();
        int[] arrayResult = arrayRemover.removeNumber(numbers, 92);
        System.out.println("\n\nafter removing 92 (array queue):");
        printArray(arrayResult);

        // remove 92 using linked list queue
        LinkedListRemover linkedListRemover = new LinkedListRemover();
        int[] linkedListResult = linkedListRemover.removeNumber(numbers, 92);
        System.out.println("\n\nafter removing 92 (linked list queue):");
        printArray(linkedListResult);
    }

    // helper method to print an array
    private static void printArray(int[] arr) {
    	System.out.print("{");
    	for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
        }
      }
       System.out.print("}");
   }
}