package question2;

public class SingleMainTest {
	    public static void main(String[] args) {
	        SingleLinked list = new SingleLinked();
	       //data
	        int[] numbers = {100, 12, 70, 24, 40, 36, 16, 35, 14, 30, 25, 43, 5, 9, 42, 6, 11, 41, 7, 13};
	        
	        //child a
	        //insert all numbers into a linked list
	        System.out.println("a. Initial single-linked list:");
	        for (int num : numbers) {
	            list.insert(num);
	        }
	        list.display();

	        //child b
	        //insert 32 into the list, making sure its after 30
	        System.out.println("\nb. Inserting 32 after 30:");
	        list.insertAfter(30, 32);
	        list.display();

	        //child c
	        //delete 42 from the list
	        System.out.println("\nc. After deleting 42:");
	        list.delete(42);
	        list.display();
	    }
}