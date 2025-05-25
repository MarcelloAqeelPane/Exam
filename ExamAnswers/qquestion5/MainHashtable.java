package qquestion5;

public class MainHashtable {
   
	public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        
        String[] names = {"Andi", "Ingrit", "Dora", "Chris", "Della", "Jeremy", "Jessica", "Bella", "Emma", "Blake"};
        
        for (String name : names) {
            hashTable.insert(name);
        }
        
        hashTable.display();
    }
}
