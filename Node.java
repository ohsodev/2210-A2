/*
 * Node class to do the separate chaining
 */
public class Node<T> 
{
	private Node<T> next;
    private T element;
	
    public Node() 
	{
		this.next = null;
		this.element = null;
	}
    
    public Node(T elem) 
	{
		this.next = null;
		this.element = elem;
	}
    
    public Node<T> getNext()
    {
    	return this.next;
    }
    
    public void setNext(Node<T> elem)
    {
    	this.next = elem;
    }
    
    public T getElement()
    {
    	return this.element;
    }
    
    public void setElement(T elem)
    {
    	this.element = elem;
    }

}
