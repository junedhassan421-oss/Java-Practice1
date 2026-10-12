package _59CollectionFramework;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class _02COllectionHierrchy {

    /* 1.Complete Collection Hierarchy> Collection [ Set,List,Queue,AbstractionCollection
    *                          Iterable
                            │
                            ▼
                       Collection
             ┌──────────────┼──────────────┐
             │              │              │
             ▼              ▼              ▼
           List            Set           Queue
             │              │              │
       ┌─────┼─────┐   ┌────┼────┐    ┌────┴────┐
       ▼     ▼     ▼   ▼         ▼    ▼         ▼
 ArrayList LinkedList Vector   HashSet  PriorityQueue Deque
                    │            │
                  Stack     LinkedHashSet
                                 │
                              SortedSet
                                 │
                              NavigableSet
                                 │
                              TreeSet
                              * Important: Map Collection interface ko extend nahi karta. Ye Collections Framework ka separate hierarchy hai.
                              *                          Map
                          │
            ┌─────────────┼─────────────┐
            ▼             ▼             ▼
         HashMap     LinkedHashMap    TreeMap
            │
         Hashtable*/
    /*

    2.> Iterable : Iterable is the root interface that allows an object to be iterated, commonly using the enhanced for-each loop.
    Iterable ka purpose hai kisi collection ke elements ko iterate/traverse karna.

    List<Integer> list = Arrays.asList(10, 20, 30);
    for (int x : list) {
      System.out.println(x);
    }

    3.>  Collection : Collection ek major interface hai jo objects ke group ko represent karta hai.
         Iske important child interfaces:
         Collection
├── List
├── Set
└── Queue

Common Methoe :
add()
remove()
contains()
size()
isEmpty()
clear()

Collection<Integer> c = new ArrayList<>();
c.add(10);
c.add(20);
System.out.println(c.size());

    4. List ⭐⭐⭐⭐⭐
List is an ordered collection that generally allows duplicate elements.

List elements ko ordered sequence mein rakhta hai aur duplicates allow karta hai.

List
├── ArrayList
├── LinkedList
├── Vector
└── Stack
List<String> names = new ArrayList<>();
names.add("Raza");
names.add("Aman");
names.add("Raza");

5. ArrayList ⭐⭐⭐⭐⭐
Internally dynamically growing array-based structure
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);.

6. LinkedList
LinkedList uses linked nodes and implements both List and Deque.
10 ⇄ 20 ⇄ 30 ⇄ 40
Useful when working with frequent insertions/removals at appropriate positions or as a deque.
LinkedList<Integer> list = new LinkedList<>();
list.add(10);
list.addFirst(5);
list.addLast(20);

7. Vector : Vector is a legacy, synchronized, dynamically growing list implementation.
Vector<Integer> v = new Vector<>();
ArrayList is generally preferred over Vector in modern single-threaded code because Vector's methods are synchronized.

8. Stack : Stack is a legacy class that extends Vector.
It follows LIFO: Last In → First Out , For modern stack behavior, Deque/ArrayDeque is generally preferred.

9. Set ⭐⭐⭐⭐⭐
Set is a collection that does not permit duplicate elements.
Set mein duplicate elements allowed nahi hote.
Set
├── HashSet
├── LinkedHashSet
└── SortedSet
      │
   NavigableSet
      │
   TreeSet

   10. HashSet ⭐⭐⭐⭐⭐
Duplicates ❌
Generally no guaranteed iteration order
Allows one null element

Set<Integer> set = new HashSet<>(); // Conceptually stored unique values:
set.add(10);
set.add(20);
set.add(10);

11. LinkedHashSet
HashSet + predictable insertion-order iteration
Set<Integer> set = new LinkedHashSet<>();
set.add(30);
set.add(10);
set.add(20);.

12. SortedSet → NavigableSet → TreeSet ⭐⭐⭐⭐⭐
TreeSet elements ko sorted order mein maintain karta hai.

TreeSet<Integer> set = new TreeSet<>();
set.add(30);
set.add(10);
set.add(20);

Hierarchy
Set
 ↓
SortedSet
 ↓
NavigableSet
 ↓
TreeSet

13. Queue ⭐⭐⭐⭐⭐
Queue generally FIFO concept follow karti hai. : First In → First Out

Queue
├── PriorityQueue
└── Deque
      ├── ArrayDeque
      └── LinkedList

14. PriorityQueue : Elements priority ke according process hote hain; default natural ordering mein smallest element head par hota hai.
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(30);
pq.add(10);
pq.add(20);
System.out.println(pq.poll());

15. Deque ⭐⭐⭐⭐
Deque = Double Ended Queue
Dono ends se insertion/removal kar sakte ho.

addFirst()  ← [ 10 20 30 ] → addLast()
removeFirst() removeLast()

Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(10);
dq.addLast(20);

16. Map — Separate Hierarchy ⭐⭐⭐⭐⭐
Ye interview ka very important point hai.
                    Map
                     │
       ┌─────────────┼──────────────┐
       ▼             ▼              ▼
    HashMap    LinkedHashMap     SortedMap
                                    │
                                NavigableMap
                                    │
                                TreeMap
                                Map kya karta hai?

Key-value pairs store karta hai.
Map<String, Integer> marks = new HashMap<>();
marks.put("Raza", 90);
marks.put("Aman", 85);



| Collection    | Duplicate | Order                  | Main Use                 |
| ------------- | --------- | ---------------------- | ------------------------ |
| ArrayList     | ✅         | Insertion              | Fast index access        |
| LinkedList    | ✅         | Insertion              | Linked/deque operations  |
| HashSet       | ❌         | No guaranteed order    | Unique elements          |
| LinkedHashSet | ❌         | Insertion              | Unique + insertion order |
| TreeSet       | ❌         | Sorted                 | Unique + sorted          |
| PriorityQueue | Depends   | Priority-based         | Priority processing      |
| ArrayDeque    | ✅         | Ends-based             | Stack/Deque              |
| HashMap       | Keys ❌    | No guaranteed order    | Key-value lookup         |
| LinkedHashMap | Keys ❌    | Insertion/access order | Ordered key-value        |
| TreeMap       | Keys ❌    | Sorted by keys         | Sorted key-value         |

Q1. Is Map a child of Collection?
No. Map does not extend the Collection interface. It is a separate hierarchy in the Java Collections Framework.
Nahi. Map, Collection ka child nahi hai. Map ki separate hierarchy hai.

Q2. Difference between List and Set?
List is ordered and generally allows duplicates, whereas Set does not allow duplicate elements.

Q3. ArrayList vs LinkedList?
ArrayList is backed by a resizable array and provides fast random access by index. LinkedList is node-based and can be useful for insertion/removal operations when the relevant position is already known, but random access is slower.

Q4. HashSet vs TreeSet?
HashSet does not guarantee sorted iteration order and is generally used for fast set operations, while TreeSet maintains elements according to their ordering and provides sorted-set operations.

Q5. HashMap vs TreeMap?
HashMap provides hash-based key-value storage without sorted-key ordering, while TreeMap maintains keys in sorted order.

Q6. Why do we use Collections instead of arrays?
Arrays have a fixed size, while collection classes provide dynamic sizing and specialized data structures such as lists, sets, queues and maps.
Array ka size generally fixed hota hai, jabki Collections dynamic size aur different data structures provide karte hain.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

    }
}
