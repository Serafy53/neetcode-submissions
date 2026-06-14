class MinStack {
    private List<Integer> stack;
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
    }
    public void pop() {
        this.stack.removeLast();
    }
    
    public int top() {
        return this.stack.getLast();
    }
    
    public int getMin() {
        int min = stack.getFirst();
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) < min) {
                min = stack.get(i);
            }
        }
        return min;
    }
}
