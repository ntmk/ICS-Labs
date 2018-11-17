/* 
    A linked list implementation of a stack which uses the structures
    of LinkedList.java. (Therefore, Is a child of LinkedStack.)
   
    Your tasks:
        1. complete the code as indicated by the comments
        2. modify UndoRedo.java so that it uses this LinkedStack instead of
           the java.util.Stack.
*/

/* 
    Rename this file: LinkedStack.java
*/

/*
    Complete the header so that LinkedStack is a child of LinkedList
*/

public class LinkedStack extends LinkedList implements Stack {

    /* Write the default (no parameter) constructor.
       Have it call the constructor of the super class.
    */
	public LinkedStack() {
		super();
	}
    
    /*
        Complete the method for the push operation.
        1. Create a new node containing the data given by the formal parameter.
        2. If the linked list is empty make the head and the tail refer to the new node.
           Otherwise, add the new node to the head of the linked list.
    */
    public void push(Object data) {
		Node n = createNode(data);
		n.next = head;
		head = n;
		if (tail == null) {
			tail = n;
		}
		push(data);
    }
   
    /*
        Complete the method for the peek operation.
        This method returns the data from the top of the stack.
        The stack must remain unchanged.
        1. If the stack is empty peek throws an EmptyCollectionException.
           See EmptyCollectionException.java that is written for you.
        2. Otherwise, return the data from the top of the stack.
           (Hint: return the data from the head of the list.)
    */
    public Object peek() throws EmptyCollectionException {
		if (isEmpty() == true) {
			throw new EmptyCollectionException("Stack is empty.");
		}
		else {
		return head;	
		}
    }
    
    /* 
        Complete the method for the pop operation.
        This method does the same as peek and, in addition,
        it removes the item that is on top of the stack.
        1. Call peek to get the data from the top of the stack.
        2. If peek returned null throw an EmptyCollectionException as
           there is nothing to pop off the stack.
           Otherwise remove the top of the stack. (Hint: make the top
           of the stack the next item on the stack.)
        3. return the data that was returned by peek in 1.
        
    */
    public Object pop() throws EmptyCollectionException {
		if (isEmpty() == true) {
			throw new EmptyCollectionException("Stack is empty.");
		}
		Object value = head.data;
		head = head.next;
		return value;
    }
     
}