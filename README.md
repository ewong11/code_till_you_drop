# Team: code_till_you_drop 
Colin Hosking, Aaron Li, Shruthi Venkata
APCS Lab 02: All Hands on Deque!

# To Do List:
1. Obtain DLLNode class in repo
1. Write interface Deque
2. Implement methods (see below for priority), always maintaining functionality.
3. Create main method to test functionality

# Deque methods(in order of priority for implementation)
1) `size()`  
2) `isEmpty()`  
3) `addFirst()`  
4) `addLast()`    
5) `removeFirst()`    
6) `removeLast()`    
7) `peekFront()`    
8) `peekLast()`     

# Architecture Options
  Our team has opted to use the DLLNode(doubly linked list) because it offers a two way linkage. Double-ended queue means that one can enqueue and dequeue from both ends, which is why DLLNodes make the most sense. The node structure points both ways, allowing for a more logical implementation for Deque.

# Development Plan:
We plan on implementing Deque by first examining many of the methods in class NodeQueue. The addLast(), removeFirst(), and peekFirst()
will have nearly identical implementations due to the FIFO/LILO property of NodeQueue. However, we need to also implememnt addFirst(),
removeLast(), and peekLast(), which are similar to the previous methods in funtionality but correspond to the opposite end of the doubly
linked list underlying data structure.

size() should be simple to implemement in constant runtime as long as we increment and decrement an instance variable whenever we add or remove elements.
isEmpty() should be simple to implement in constant runtime because the Deque is empty when size is 0.
