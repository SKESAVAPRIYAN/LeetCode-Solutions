class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1=new Stack<>();
        int a,b;
        for(String s:tokens){
            if(s.equals("+")){
                b=s1.pop();
                a=s1.pop();
                s1.push(a+b);
            }
            else if(s.equals("-")){
                b=s1.pop();
                a=s1.pop();
                s1.push(a-b);
            }
            else if(s.equals("*")){
                b=s1.pop();
                a=s1.pop();
                s1.push(a*b);
            }
            else if(s.equals("/")){
                b=s1.pop();
                a=s1.pop();
                s1.push(a/b);
            }
            else{
                s1.push(Integer.parseInt(s));
            }
        }return s1.pop();
    }
}