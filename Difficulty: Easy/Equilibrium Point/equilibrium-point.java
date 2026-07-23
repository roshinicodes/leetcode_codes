class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int leftsum=0;
        
        int totalsum=0;
        
        for(int num:arr)
        {
            totalsum+=num;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            int rightsum=totalsum-leftsum-arr[i];
            
            if(leftsum==rightsum)
            {
                return i;
            }
            
            leftsum=leftsum+arr[i];
        }
        
        return -1;
    }
}
