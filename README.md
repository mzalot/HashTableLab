# HashTableLab
Challenge One
x % n where n is a large prime number would make a better hash function becuase it would produce a unique number and the one with many factors could possibly not create a unique number. 
Ex: 1000%120 = 40, 1000%320= 40, 1000%97=30
Challenge Two
Char values summed % 599 would not make a good hash function for strings becuase some of the values could end up being the same int value.
Challenge Three
Java's hashmap class allows null keys and null values, and the order of the keys and values may not remain constant over time. There are buckets that the keys and values are put in. The performance is affected by how big you make the hashmap(how many buckets you make) and how many buckets are filled. When the number of buckets in the hashmap are filled to a certain amount the load factor is reached and the hashmap is rehashed which means it is recreated with twice the buckets. The load factor is normally 75% of the buckets to maximize time and space costs. To calculate the index of the hash (h & (length-1)) is used where h is the the size of the HashMap and length is the number of buckets. Then it performs the bitwise AND operator which turns the int into a binary sequence.
