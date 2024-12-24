import java.util.Stack;
class MinStack {
    private Stack<Integer> ms;
    private Stack<Integer> min;

    public MinStack() {
        ms=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        ms.push(val);
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(ms.peek().equals(min.peek())){
            min.pop();
        }
        ms.pop();
    }
    
    public int top() {
        return ms.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */