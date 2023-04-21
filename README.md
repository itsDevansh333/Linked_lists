# Linked_lists
Like array, linked list is also a linear data structure which is used to store data. but unlike arrays, the data stored in linked list is not contiguous, rather form a chain or series of nodes which are at different memory locations but are connected through pointers( in case of non-object oriented ) or object references( in case of object oriented). 
Linked lists are basically of four types:
    1. singly linked_list
    2. doubly linked_list
    3. circular linked_list
    4. doubly circular linked_list
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Singly Linked_list:- In singly Linked_list, there is a connected chain of nodes such that each node contains data field and a pointer or object reference for storing the refernce of the next node. This lists can be traversed only in one direction(from head to tail) and cannot be traversed backward.


![singly-linked-list](https://user-images.githubusercontent.com/131320569/233594539-b9722507-dea1-4923-a9dc-519ebf576ea2.png)

2. Doubly Linked_list:- In doubly Linked_list, there is connected chain of nodes such that each node has three fields, the data field, and two pointers or object references, one for the reference of previous node and other for the reference of the next node. Unlike Singly Linked List, this type of linked list can be traversed in both the directions (from head to tail and from tail to head).

3. Singly Circular Linked_List:- A singly circular linked list is a connected chain of nodes exactly like the normal singly linked list. The only difference between singly linked list and singly circular linked is that the next address pointer of object refernce of last node refers to the first node (Head Node) of the list.

4. Doubly Circular Linked_List:- A doubly circular linked list is a connected chain of nodes exactly like normal doubly linked list but the difference is that the last node of the list refers to the head node and head node's previous reference points to last node.
