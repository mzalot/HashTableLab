/**
 HashTableDriver
 The program will create a driver for the HashTable class
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 2/4/22
 On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: MZ
 **/
public class HashTableDriver {
    public static void main(String[] args) {
        HashTable test = new HashTable(100);
        //put method
        System.out.println("Testing the put method(should return true for both):");
        System.out.println(test.put("trent", "daddy"));
        System.out.println(test.put("august", "pogust"));
        //get method
        System.out.println("Testing get method(Should return daddy): " + test.get("trent"));
        System.out.println("Testing get method(Should return pogust): " + test.get("august"));
        System.out.println("Testing get method(Should return null): " + test.get("kevin"));
        //test put with conflicting values
        System.out.println("Testing the put method(should return false):");
        System.out.println(test.put("trent", "not dad"));
    }
}
