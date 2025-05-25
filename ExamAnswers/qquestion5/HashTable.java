package qquestion5;
import java.util.LinkedList;

public class HashTable {
	//data variables
    private int size;
    private LinkedList<String>[] table;

    //Constructor
    @SuppressWarnings("unchecked")
	public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }
    //calculates whos name goes to where index
    private int hashFunction(String key) {
        return key.length() % size;
    }
    //gets the Hash index
    public void insert(String key) {
        int index = hashFunction(key);
        table[index].add(key); //adds to the appropriate list
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            if (table[i].isEmpty()) {
                System.out.println("null");
            } else {
                System.out.print(table[i].get(0));
                for (int j = 1; j < table[i].size(); j++) {
                    System.out.print(" → " + table[i].get(j));
                }
                System.out.println();
            }
        }
    }
}