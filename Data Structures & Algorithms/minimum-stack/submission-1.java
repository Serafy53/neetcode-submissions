class MinStack {
    private List<Integer> stack;
    private List<Integer> minStack = new ArrayList<>();

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
        if (minStack.isEmpty()) {
            minStack.add(val);
        } else {
            if (minStack.getLast() > val) {
                minStack.add(val);
            } else {
                minStack.add(minStack.getLast());
            }
        }
    }
    public void pop() {
        this.stack.removeLast();
        minStack.removeLast();
    }
    
    public int top() {
        return this.stack.getLast();
    }
    
    public int getMin() {
        return minStack.getLast();
    }
}
