package _59CollectionFramework;
import java.util.Scanner;
public class _07Hashing {
/*❤️❤️1>. Hashing in Java*/
    /*Hashing Java mein ek technique hai jisme hum data ko key ke basis par quickly store
    aur retrieve karte hain. Java mein hashing mainly HashMap aur HashSet ke through
    use hoti hai. // HashMap<Integer, String> map = new HashMap<>();
HashMap data ko Key–Value pair mein store karta hai.*/
    // Hashing is technique to Convert a Range of Key value to range of Indices
    // 2.> 2. Java mein Hashing ke important classes
   /* | Class           | Kya store karta hai? | Duplicate?      |
            | --------------- | -------------------- | --------------- |
            | `HashMap`       | Key + Value          | Key duplicate ❌ |
            | `HashSet`       | Only values          | Duplicate ❌     |
            | `Hashtable`     | Key + Value          | Key duplicate ❌ |
            | `LinkedHashMap` | Key + Value          | Key duplicate ❌ |
            | `LinkedHashSet` | Values               | Duplicate ❌     |

 A>> 3. HashMap : HashMap key-value pair store karta hai.
     import java.util.*;
     HashMap<String, Integer> map = new HashMap<>();
     map.put("A", 90);
     map.put("B", 80);
     map.put("C", 70);
     Key       Value
"A"  →     90
"B"  →     80
"C"  →     70

Operation
 1>. Value get karna : System.out.println(map.get("A"));
 2.>put() — Add / Update : map.put(1, "Junaid");
 3.> containsKey() — Key present hai? : map.containsKey(2);
 if(map.containsKey(5)) {
    System.out.println("Key exists");
}
 4.> containsValue() — Value present hai? : map.containsValue("Junaid");
 5.> remove() — Key remove karna // map.remove(2); , Key + Value  , remove map.remove(1, "Junaid"); // Ye tabhi remove karega jab key aur value dono match karein.
 6.> size() — Total entries // System.out.println(map.size());
 7.> isEmpty() : Check karta hai HashMap empty hai ya nahi. // map.isEmpty();
 8>. clear() — Sab remove // map.clear();
 9.> keySet() — Saari keys // System.out.println(map.keySet());
 loop ;
 for(Integer key : map.keySet()) {
    System.out.println(key);
}

10.> values() — Saari values
for(String value : map.values()) {
    System.out.println(value);
}

11.>entrySet() — Key + Value dono
// Importants
for(Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}
// Shortcut
for(var entry : map.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}

12.> getOrDefault() ⭐ DSA mein very important
map.put(5, map.getOrDefault(5, 0) + 1);
Agar 5 present hai → uski current value lo
Agar present nahi hai → 0 lo
Then +1
int[] arr = {1, 2, 2, 3, 1, 2};
HashMap<Integer, Integer> map = new HashMap<>();
for(int x : arr) {
    map.put(x, map.getOrDefault(x, 0) + 1);
}
 13.> putIfAbsent() : Agar key already hai to value change nahi karega.
Ye especially frequency counting mein use hota hai. // map.putIfAbsent(1, "New"); : 1 → Junaid : already hai, to Junaid hi rahega.
14. replace() : Existing key ki value change karne ke liye:
map.replace(1, "Ali");
15.> replace(key, oldValue, newValue) // map.replace(1, "Junaid", "Ali"); // map.replace(1, "Junaid", "Ali");
16.> getOrDefault() vs get()
Get(): map.get(10) : Key nahi hai → null
getOrDefault() : map.getOrDefault(10, 0); // Key nahi hai → 0

import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // put
        map.put(1, "Junaid");
        map.put(2, "Rahul");
        map.put(3, "Aman");
        // get
        System.out.println(map.get(1));
        // containsKey
        System.out.println(map.containsKey(2));
        // containsValue
        System.out.println(map.containsValue("Aman"));
        // size
        System.out.println(map.size());
        // remove
        map.remove(2);
        // keySet
        for(Integer key : map.keySet()) {
            System.out.println(key);
        }
        // values
        for(String value : map.values()) {
            System.out.println(value);
        }
        // entrySet
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}
⭐ Interview ke liye most important HashMap operations
| Operation         | Purpose                       |
| ----------------- | ----------------------------- |
| `put()`           | Add/update key-value          |
| `get()`           | Value find                    |
| `remove()`        | Entry delete                  |
| `containsKey()`   | Key check                     |
| `containsValue()` | Value check                   |
| `size()`          | Number of entries             |
| `isEmpty()`       | Empty check                   |
| `clear()`         | All entries delete            |
| `keySet()`        | All keys                      |
| `values()`        | All values                    |
| `entrySet()`      | Key + Value                   |
| `getOrDefault()`  | Default value ke saath access |
| `putIfAbsent()`   | Only if key absent            |
| `replace()`       | Existing value update         |



 ❤️❤️B.>>> 4. HashSet : HashSet mein sirf unique values store hoti hain.
 HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(10);
set.add(30);

Operation
1>. 1. add() — Element insert karna
set.add(10);
set.add(20);
set.add(30);
2.> 2. contains() — Element exist karta hai ya nahi : System.out.println(set.contains(20));
3.> 3. remove() — Element delete karna : set.remove(20);
4.> 4. size() — Total elements : System.out.println(set.size());
5. isEmpty() — Set empty hai? : System.out.println(set.isEmpty());
6. clear() — Saare elements delete : set.clear();
7. Traversal : Enhanced for loop
for(int x : set) {
    System.out.println(x);
}
8. Iterator
Iterator<Integer> it = set.iterator();
while(it.hasNext()) {
    System.out.println(it.next());
}
9. removeIf() : set.removeIf(x -> x % 2 == 0);
10. toArray() : HashSet ko array mein convert karna:
Object[] arr = set.toArray();
Typed array: Integer[] arr = set.toArray(new Integer[0]);
11. clone() :  Set ki shallow copy:
HashSet<Integer> copy = (HashSet<Integer>) set.clone(); // Ab copy mein same elements honge.
12. equals() : Do sets ke elements same hain ya nahi:
HashSet<Integer> set1 = new HashSet<>();
HashSet<Integer> set2 = new HashSet<>();
set1.add(10);
set1.add(20);
set2.add(20);
set2.add(10);
System.out.println(set1.equals(set2));
13. containsAll() : Check karta hai ki ek collection ke saare elements current set mein hain ya nahi.
HashSet<Integer> set1 = new HashSet<>();
set1.add(10);
set1.add(20);
set1.add(30);
HashSet<Integer> set2 = new HashSet<>();
set2.add(10);
set2.add(20);
System.out.println(set1.containsAll(set2));
14. Set Union : Mathematical union: A ∪ B , A = {1, 2, 3}, B = {3, 4, 5} , A ∪ B = {1, 2, 3, 4, 5}
                Java : set1.addAll(set2);
15. Set Intersection : Common elements:
A = {1, 2, 3}
B = {2, 3, 4}
A ∩ B = {2, 3}
set1.retainAll(set2); // set1 mein sirf common elements bachenge.
16. Set Difference // A - B
A = {1, 2, 3}
B = {2, 3, 4}
A - B = {1}
set1.removeAll(set2);
17. addAll() : Do collections ke elements add: set1.addAll(set2);// Duplicate automatically ignore.
18. removeAll() // set1.removeAll(set2); // set1 se set2 ke matching elements remove ho jayenge.
19. retainAll() // set1.retainAll(set2); // Sirf common elements rakhe jayenge.

❤️ Complete Operations Cheat Sheet
| Operation          | Java method     | Average Time |
| ------------------ | --------------- | -----------: |
| Insert             | `add()`         |         O(1) |
| Search             | `contains()`    |         O(1) |
| Delete             | `remove()`      |         O(1) |
| Size               | `size()`        |         O(1) |
| Empty check        | `isEmpty()`     |         O(1) |
| Delete all         | `clear()`       |         O(n) |
| Traverse           | `for-each`      |         O(n) |
| Iterator           | `iterator()`    |         O(n) |
| Conditional delete | `removeIf()`    |         O(n) |
| Union              | `addAll()`      |       O(n+m) |
| Intersection       | `retainAll()`   |       O(n+m) |
| Difference         | `removeAll()`   |       O(n+m) |
| Subset check       | `containsAll()` | O(n) approx. |
| Compare sets       | `equals()`      | O(n) approx. |
| Convert to array   | `toArray()`     |         O(n) |
For Interviw : HashSet stores unique elements and provides average O(1) time
for insertion, deletion, and search. It does not maintain insertion order.

    */
    public static void main(String[] args) {

    }
}
