package question2;

public class SingleLinked {
	 NodeObject head;

	    //insert-at-end
	    public void insert(int data) {
	        NodeObject newNode = new NodeObject(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            NodeObject current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    //insert after value 
	    public void insertAfter(int target, int newData) {
	        NodeObject current = head;
	        while (current != null) {
	            if (current.data == target) {
	                NodeObject newNode = new NodeObject(newData);
	                newNode.next = current.next;
	                current.next = newNode;
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Target value " + target + " not found in the list.");
	    }

	    //delete specific value
	    public void delete(int target) {
	        if (head == null) return;

	        if (head.data == target) {
	            head = head.next;
	            return;
	        }

	        NodeObject current = head;
	        while (current.next != null) {
	            if (current.next.data == target) {
	                current.next = current.next.next;
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Target value " + target + " not found in the list.");
	    }

	    //display
	    public void display() {
	        NodeObject current = head;
	        System.out.print("{");
	        
	        	while (current != null) {
	        		System.out.print(current.data + ", ");
	        		current = current.next;
	        	}
	        System.out.println("}");
	  }
}