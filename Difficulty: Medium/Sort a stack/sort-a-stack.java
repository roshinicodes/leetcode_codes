class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer>temp=new Stack<>();
        while(!st.isEmpty())
        {
            int top=st.pop();
            while(!temp.isEmpty() && temp.peek() < top)
            {
                st.push(temp.pop());
            }
            
            temp.push(top);
        }
        
        while(!temp.isEmpty())
        {
            st.push(temp.pop());
        }
    }
}