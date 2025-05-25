package question3;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListRemover {
    public int[] removeNumber(int[] numbers, int toRemove) {
        //create a queue
        Queue<Integer> queue = new LinkedList<>();

        //remove elements (checks for how many)
        int removeCount = countOccurrences(numbers, toRemove);

        //reduce the size of the array
        int[] result = new int[numbers.length - removeCount];
        int index = 0;

        //enqueue
        for (int num : numbers) {
            queue.add(num);
        }

        //process the queue
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num != toRemove) {
                result[index++] = num;
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