class MyStack {
    
    private Queue<Integer> queue = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> aux = new LinkedList<Integer>();
        while (queue.size() != 0) aux.offer(queue.poll());
        queue.offer(x);
        while (aux.size() != 0) queue.offer(aux.poll());
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.size() == 0;
    }
}
