/*here
    *'current' referes to the address reference of the currently accessed node of the list
    *'head' refers to the head node of the list
    * function 'createlist' is used to create the linked list
    * function 'printlist' is used to traverse through the list
 */
class node(val item:Int)
{
    var data:Int=item
    var next:node?=null
}
fun main()
{
    var head: node? =null
    print("Enter the number of node in the list: ")
    var n=readLine()!!.toInt()
    head=createlist(n)
    if (head != null) {
        printlist(head)
    }
}
fun createlist(n:Int): node? {
    var start:node?=null
    var current:node?=start
    for(i in 0..n-2)
    {
        if(start==null)
        {
            start=getnode()
            current=start
        }
        if (current != null) {
            current.next=getnode()
            current=current.next
        }
    }
    return start
}
fun getnode():node{
    val newnode:node=node(readLine()!!.toInt())
    return newnode
}
fun printlist(start:node)
{
    if(start!=null){
        println("The data in the linked list is: ")
        var current:node?=start
        while(current!=null)
        {
            print("${current.data} ")
            current= current.next
        }
    }
}