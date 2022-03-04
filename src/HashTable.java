/**
 HashTable
 The program will create a HashTable
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 2/2/22
 On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: MZ
 **/
import java.lang.Math;

public class HashTable {
    //instance data
    //array
    private String[] hashTable;
    //buckets filled
    int bucketsFilled;

    //constructor
    public HashTable(int capacity){
        hashTable = new String[capacity];
        bucketsFilled = 0;
    }

    //put method
    public boolean put(String key, String value){
        boolean success = false;
        //hashcode value
        int hash = hashCode(key);
        //if buckets are filled. Grow the array
        if(bucketsFilled == hashTable.length){
            String[] newHashTable = new String[hashTable.length * 2];
            for(int i=0; i<hashTable.length; i++){
                newHashTable[i] = hashTable[i];
            }
        }
        if (hashTable[hash] == "") {
            success = true;
            hashTable[hash] = value;
        }
        return success;
    }
    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    //get method
    public String get(String key){
        //hashcode value
        int hash = hashCode(key);
        if(hashTable[hash] != ""){
            return hashTable[hash];
        }else{
            return null;
        }
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
        //int value of key
        Integer keyVal = Integer.valueOf(key);
        int indexValue = (int) (hashTable.length % (Math.pow(2,keyVal)));
        return indexValue;
    }
}
