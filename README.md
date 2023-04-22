<h1>Linked_lists</h1>
Like array, linked list is also a linear data structure which is used to store data. but unlike arrays, the data stored in linked list is not contiguous, rather form a chain or series of nodes which are at different memory locations but are connected through pointers( in case of non-object oriented ) or object references( in case of object oriented). 
Linked lists are basically of four types:
    1. singly linked_list
    2. doubly linked_list
    3. circular linked_list
    4. doubly circular linked_list<br>
-------------------------------------------------------------------------------------------------------------------------------------------------------
1. Singly Linked_list:- In singly Linked_list, there is a connected chain of nodes such that each node contains data field and a pointer or object reference for storing the refernce of the next node. This lists can be traversed only in one direction(from head to tail) and cannot be traversed backward.

![singly-linked-list-removebg-preview](https://user-images.githubusercontent.com/131320569/233600124-a9e05dcc-2c3a-4741-800c-39b0bd4fbbd6.png)



2. Doubly Linked_list:- In doubly Linked_list, there is connected chain of nodes such that each node has three fields, the data field, and two pointers or object references, one for the reference of previous node and other for the reference of the next node. Unlike Singly Linked List, this type of linked list can be traversed in both the directions (from head to tail and from tail to head).


![DLL-removebg-preview](https://user-images.githubusercontent.com/131320569/233598628-85939937-b69f-41eb-99be-43b6a76f5fa3.png)


3. Singly Circular Linked_List:- A singly circular linked list is a connected chain of nodes exactly like the normal singly linked list. The only difference between singly linked list and singly circular linked is that the next address pointer of object refernce of last node refers to the first node (Head Node) of the list.

![singly-Circular-Linked-List-768x384-removebg-preview](https://user-images.githubusercontent.com/131320569/233660090-2bd25944-6903-4618-a4d9-066d3dbef777.png)


4. Doubly Circular Linked_List:- A doubly circular linked list is a connected chain of nodes exactly like normal doubly linked list but the difference is that the last node of the list refers to the head node and head node's previous reference points to last node.

![doubly-circular_linked_list-removebg-preview](https://user-images.githubusercontent.com/131320569/233660343-aa9911ec-a659-4674-8a5d-e225e355d575.png)

There are basically three types of operartions involved in linked lists.
    1. Insertion<br>
        <h6>     a. insertion at head<br></h6>
        <h6>     b. insertion at tail<br></h6>
        <h6>     c. insertion in between two nodes<br></h6>
    2. Deletion<br>
        a. deletion of head node<br>
        b. deletion of last node<br>
        3. deletion of a random node<br>
    3. traversal

