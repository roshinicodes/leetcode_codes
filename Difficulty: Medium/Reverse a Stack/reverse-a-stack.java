class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
          // Base case
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int x = st.pop();

        // Reverse the remaining stack
        reverseStack(st);

        // Insert removed element at the bottom
        insertAtBottom(st, x);
    }

    private static void insertAtBottom(Stack<Integer> st, int x) {

        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int temp = st.pop();

        insertAtBottom(st, x);

        st.push(temp);
    }
      

    
}
