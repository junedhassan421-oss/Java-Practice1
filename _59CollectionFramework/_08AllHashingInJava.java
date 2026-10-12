package _59CollectionFramework;
import java.util.Scanner;
public class _08AllHashingInJava {
    public static void main(String[] args) {
       /* Hashing as a DSA technique → HashMap, HashSet, frequency counting, duplicate detection, lookup, etc.
                Hash table collision-handling techniques → Separate Chaining, Open Addressing, Linear Probing,
                Quadratic Probing, Double Hashing.  Main dono ko detail mein cover kar raha hoon.

                1. What is Hashing?
Hashing is a technique that maps a key to a location/index in a hash table using a hash function, allowing fast insertion, searching, and deletion.
Hashing mein hum kisi key/data ko hash function ke through ek index/bucket mein map karte hain, jisse data ko quickly search, insert aur delete kar sakte hain.
Key
 ↓
Hash Function
 ↓
Hash Value
 ↓
Index / Bucket
 ↓
Store / Search

2. Hash Table
Hash table ek data structure hai jisme key ko hash function se index mein convert karke data store kiya jata hai.
Hash Table
Index
  0
  1
  2
  3
  4
  5  ← 25
  6
  7
  8
  9

3. Collision : Jab do ya more keys same index/bucket par map ho jaati hain, usse collision kehte hain.
25 → 25 % 10 → 5
35 → 35 % 10 → 5
45 → 45 % 10 → 5
        Bucket 5
           ↓
       25
       35
       45
       Isko handle karne ke liye different collision resolution techniques hoti hain.

4. Major Hashing Techniques
Hashing
│
├── Hash Function
│
├── Collision Resolution
│   │
│   ├── Separate Chaining
│   │
│   └── Open Addressing
│       ├── Linear Probing
│       ├── Quadratic Probing
│       └── Double Hashing
│
└── Java Collections
    ├── HashMap
    ├── HashSet
    ├── LinkedHashMap
    └── LinkedHashSet

5. Hash Function
Hash function key ko integer/hash value mein convert karta hai.
For simple integer keys: h(k) = k % tableSize
Example : tableSize = 10, k = 27 ,h(27) = 27 % 10 = 7

 6. Division Method : Sabse common basic technique: h(k) = k mod m , where m = hash table size.
 k = 123
m = 10
123 % 10 = 3

7. Separate Chaining ⭐
Ye important collision-resolution technique hai.
Har bucket ke andar multiple entries store ki ja sakti hain, commonly a linked structure ke through.
25 % 10 = 5
35 % 10 = 5
45 % 10 = 5

0 → null
1 → null
2 → null
3 → null
4 → null
5 → 25 → 35 → 45
6 → null
7 → null
8 → null
9 → null

8. Open Addressing
Open addressing mein har element hash table ke andar hi store hota hai.
Agar calculated position occupied hai, to another position search ki jaati hai.
Main techniques:
Open Addressing
│
├── Linear Probing
├── Quadratic Probing
└── Double Hashing

9. Linear Probing ⭐
Collision hone par next position check karte hain. // h(k,i) = (h(k) + i) % m , Where : i = 0,1,2,3...

10. Quadratic Probing
Linear probing mein:
+1
+2
+3
Quadratic probing mein jumps square ke according badhte hain:
+1²
+2²
+3²
+4²
h(k,i) = (h(k) + i²) % m
initial idx : 5
i=1 → 5 + 1² = 6
i=2 → 5 + 2² = 9
i=3 → 5 + 3² = 14 → 4

11. Double Hashing ⭐
Double hashing mein two hash functions use hote hain.
h(k,i) = (h1(k) + i × h2(k)) % m
h1(k) = k % 10
h2(k) = 7 - (k % 7)

k + 5;
h1(25) = 5
h2(25) = 7 - 4 = 3

12. Comparison of Collision Techniques
| Technique         | Formula        | Main Problem         |
| ----------------- | -------------- | -------------------- |
| Chaining          | Bucket + chain | Extra memory         |
| Linear Probing    | `h+i`          | Primary clustering   |
| Quadratic Probing | `h+i²`         | Secondary clustering |
| Double Hashing    | `h1+i*h2`      | More computation     |


13. Load Factor ⭐
Hash table mein ek very important concept: Load Factor = Number of elements / Table size
10 elements
100 buckets
Load Factor = 10 / 100
            = 0.10  // Agar load factor increase hota hai, collisions generally increase hone ka chance badhta hai.

14. Rehashing
Jab hash table sufficiently full ho jata hai, table ko larger capacity mein resize karke entries ko new table ke according reinsert kiya ja sakta hai.
Old table
size = 10
     ↓
threshold reached
     ↓
resize
     ↓
New table
size = larger capacity
     ↓
entries rehashed

Rehashing ka matlab sirf old array ko copy karna nahi hai.
Entries ko new capacity ke according bucket/index mapping ke saath place karna padta hai.

15. HashMap in Java
Java mein hashing ka most important class:
HashMap<K, V>
HashMap<Integer, String> map = new HashMap<>();
map.put(101, "Junaid");
map.put(102, "Rahul");
map.put(103, "Aman");

16. HashMap vs HashSet
HashMap
Key → Value   // HashMap<Integer, String> map = new HashMap<>();

HashSet
Value     // HashSet<Integer> set = new HashSet<>();

17. Frequency Hashing ⭐⭐⭐
DSA mein hashing ka sabse common use.
Array: [1, 2, 1, 3, 2, 1]
Frequency:
1 → 3
2 → 2
3 → 1
HashMap<Integer, Integer> freq = new HashMap<>();
for(int x : arr) {
    freq.put(x, freq.getOrDefault(x, 0) + 1);
}

18.> Duplicate Detection
Array: [1, 2, 3, 4, 2]
HashSet :
HashSet<Integer> set = new HashSet<>();

for(int x : arr) {

    if(set.contains(x)) {
        System.out.println("Duplicate: " + x);
        break;
    }

    set.add(x);
}
19>. Tow SUm
Array:[2, 7, 11, 15]
Target:
9
Approach:
Current = 7
Required = 9 - 7
         = 2
Agar 2 HashMap mein mil gaya → answer.
HashMap<Integer, Integer> map = new HashMap<>();

for(int i = 0; i < arr.length; i++) {
    int need = target - arr[i];
    if(map.containsKey(need)) {
        System.out.println(map.get(need) + " " + i);
        break;
    }
    map.put(arr[i], i);
}

20.> hashCode() in Java
Every Java object ultimately inherits: hashCode()
from Object unless overridden through inheritance.
      String s = "Hello";
System.out.println(s.hashCode());
HashMap/HashSet hashing ke context mein hashCode() important hai.
Conceptually:*/

    }
}
