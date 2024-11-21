# List Of Algorithms
1. Sorting Algorithms
   
    * Bubble Sort
    * Selection Sort
    * Insertion Sort
    * Merge Sort
    * Quick Sort
    * Heap Sort
    * Radix Sort
    * Counting Sort
    * Bucket Sort
    * Shell Sort
   
3. Searching Algorithms
    * Linear Search
    * Binary Search
    * Jump Search
    * Interpolation Search
    * Exponential Search
4. Graph Algorithms
    * Breadth-First Search (BFS)
    * Depth-First Search (DFS)
    * Dijkstra’s Algorithm (Shortest Path)
    * Bellman-Ford Algorithm (Shortest Path)
    * Floyd-Warshall Algorithm (All-Pairs Shortest Path)
    * Prim’s Algorithm (Minimum Spanning Tree)
    * Kruskal’s Algorithm (Minimum Spanning Tree)
    * Topological Sort
    * A Search Algorithm*
5. Dynamic Programming
    * Knapsack Problem (0/1 Knapsack, Fractional Knapsack)
    * Longest Common Subsequence (LCS)
    * Longest Increasing Subsequence (LIS)
    * Matrix Chain Multiplication
    * Fibonacci Sequence
    * Subset Sum Problem
    * Coin Change Problem
    * Rod Cutting Problem
6. String Algorithms
    * KMP Algorithm (Knuth-Morris-Pratt)
    * Rabin-Karp Algorithm
    * Boyer-Moore Algorithm
    * Z Algorithm
    * Aho-Corasick Algorithm (Multiple Pattern Searching)
    * Longest Palindromic Substring
    * String Matching/Pattern Matching
7. Divide and Conquer
    * Merge Sort
    * Quick Sort
    * Binary Search
    * Strassen’s Matrix Multiplication
8. Greedy Algorithms
    * Activity Selection Problem
    * Huffman Coding
    * Dijkstra’s Algorithm
    * Prim’s Algorithm
    * Kruskal’s Algorithm
9. Backtracking
    * N-Queens Problem
    * Sudoku Solver
    * Subset Generation
    * Word Search Problem
    * Hamiltonian Path and Cycle
10. Mathematical Algorithms
    * Greatest Common Divisor (GCD)
    * Least Common Multiple (LCM)
    * Sieve of Eratosthenes (Finding primes)
    * Modular Exponentiation
    * Fast Fourier Transform (FFT)
11. Data Structure-Specific Algorithms
    * Binary Tree Traversals (Inorder, Preorder, Postorder)
    * Level Order Traversal
    * AVL Tree Rotations
    * Union-Find (Disjoint Set)
    * Trie Insert/Search
12. Advanced Algorithms
    * Ford-Fulkerson Algorithm (Max Flow)
    * Edmonds-Karp Algorithm (Max Flow)
    * KMP Algorithm (String Matching)
    * Convex Hull Algorithm (Graham’s Scan, Jarvis March)
13. Miscellaneous Algorithms
    * Reservoir Sampling
    * Randomized Algorithms (Quickselect, Randomized QuickSort)
    * Monte Carlo and Las Vegas Algorithms
# List of Data structures

1. Array
   * Description: A fixed-size, indexed collection of elements.
   * Key Methods: Arrays are part of the core language, so they rely on standard array syntax.
```java
Example:
java
Copy code
int[] numbers = {1, 2, 3, 4, 5};
System.out.println("Element at index 2: " + numbers[2]); // Accessing an element
numbers[2] = 10; // Modifying an element
```

2. ArrayList
   * Description: A resizable array from the java.util package.
   * Key Methods: add(), get(), set(), remove(), size(), contains()
```java
Example:
java
Copy code
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
System.out.println("List: " + list);
list.remove("Python");
System.out.println("Contains Java? " + list.contains("Java"));
```

3. LinkedList
   * Description: Doubly-linked list implementation of List and Deque.
   * Key Methods: addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()
```java
Example:
java
Copy code
import java.util.LinkedList;

LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.add(1);
linkedList.add(2);
linkedList.addFirst(0);
System.out.println("LinkedList: " + linkedList);
linkedList.removeLast();
System.out.println("After removal: " + linkedList);
```

4. HashMap
   * Description: A key-value pair mapping; part of Map.
   * Key Methods: put(), get(), remove(), containsKey(), containsValue(), keySet()
```java
Example:
java
Copy code
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("Alice", 25);
map.put("Bob", 30);
System.out.println("Age of Alice: " + map.get("Alice"));
map.remove("Bob");
System.out.println("Contains Bob? " + map.containsKey("Bob"));
```

5. HashSet
   * Description: A collection that contains no duplicate elements.
   * Key Methods: add(), remove(), contains(), isEmpty(), size()
```java
Example:
java
Copy code
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
set.add("Java");
set.add("Python");
set.add("Java"); // Duplicate ignored
System.out.println("Set: " + set);
System.out.println("Contains Python? " + set.contains("Python"));
```
6. Stack
   * Description: A last-in, first-out (LIFO) stack.
   * Key Methods: push(), pop(), peek(), isEmpty()
```java
Example:
java
Copy code
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
System.out.println("Top Element: " + stack.peek());
stack.pop();
System.out.println("After pop: " + stack);
```

7. Queue
   * Description: A first-in, first-out (FIFO) collection.
   * Key Methods: add(), remove(), peek(), poll()
```java
Example:
java
Copy code
import java.util.LinkedList;
import java.util.Queue;

Queue<String> queue = new LinkedList<>();
queue.add("Alice");
queue.add("Bob");
System.out.println("Front Element: " + queue.peek());
queue.remove();
System.out.println("After removal: " + queue);
```
8. PriorityQueue
   * Description: A queue that orders elements based on natural ordering or a comparator.
   * Key Methods: add(), peek(), poll()
```java
Example:
java
Copy code
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(5);
pq.add(2);
pq.add(8);
System.out.println("Top Element: " + pq.peek()); // Smallest element
pq.poll(); // Removes the smallest element
System.out.println("After poll: " + pq);
```
9. TreeSet
   Description: A sorted set based on a TreeMap.
   Key Methods: add(), remove(), first(), last(), contains()
```java
Example:
java
Copy code
import java.util.TreeSet;

TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(5);
treeSet.add(20);
System.out.println("TreeSet: " + treeSet);
System.out.println("First Element: " + treeSet.first());
```
10. TreeMap
   * Description: A sorted map based on keys.
   * Key Methods: put(), get(), remove(), firstKey(), lastKey()
```java
Example:
java
Copy code
import java.util.TreeMap;

TreeMap<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Alice", 25);
treeMap.put("Bob", 30);
System.out.println("First Key: " + treeMap.firstKey());
System.out.println("TreeMap: " + treeMap);
```
11. Deque (Double-Ended Queue)
     *  Description: A queue that allows insertion/removal from both ends.
     *  Key Methods: addFirst(), addLast(), removeFirst(), removeLast(), peekFirst(), peekLast()
```java       
Example:
java
Copy code
import java.util.ArrayDeque;
import java.util.Deque;

Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(10);
deque.addLast(20);
System.out.println("Deque: " + deque);
deque.removeFirst();
System.out.println("After removal: " + deque);
```
