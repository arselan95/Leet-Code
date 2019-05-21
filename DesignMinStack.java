import java.util.Stack;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 */
public class DesignMinStack {
	Stack<Integer> min = new Stack<>();
	Stack<Integer> stack = new Stack<>();

	public void push(int x) {
		stack.push(x);
		if (min.isEmpty() || min.peek() >= x) {
			min.push(x);
		}
	}

	public void pop() {
		if (stack.pop().equals(min.peek())) {
			min.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min.peek();
	}
	
	/*
	 *  private Node head;
    
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        
        private Node(int val, int min) {
            this(val, min, null);
        }
        
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
	 */
}
