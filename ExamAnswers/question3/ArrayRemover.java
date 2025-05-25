package question3;

public class ArrayRemover {
    public int[] removeNumber(int[] numbers, int toRemove) {
        //create a queue using array
        int[] queue = new int[numbers.length];
        int front = 0, rear = 0;

        //count how many elements
        int removeCount = countOccurrences(numbers, toRemove);

        //array will be smaller if we found the number
        int[] result = new int[numbers.length - removeCount];
        int resultIndex = 0;

        //enqueue the list
        for (int num : numbers) {
            queue[rear++] = num;
        }

        //dequeue and skip the number to remove
        while (front < rear) {
            int num = queue[front++];
            if (num != toRemove) {
                result[resultIndex++] = num;
            }
        }
        return result;
    }

    private int countOccurrences(int[] numbers, int target) {
        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}