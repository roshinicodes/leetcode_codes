class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        //step 1: always sort the array
        Arrays.sort(arr);
        
        int n=arr.length;
        
        for(int i=0;i<n-2;i++)
        {
            //skip the duplicate firs elemnts
            
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            
            //assign left and right pointers 
            int left=i+1;
            int right=n-1;
            
            //assign sum
            
            while(left<right)
            {
            int sum=arr[i]+arr[left]+arr[right];
            //if sum is zero -> remove left duplicate and then right duplicate
            //then increase the pointer
            
            ArrayList<Integer>triplets=new ArrayList<>();
            
            
            if(sum==0)
            {
               
                triplets.add(arr[i]); triplets.add(arr[left]);triplets.add(arr[right]);
                result.add(triplets);
                while(left<right && arr[left]==arr[left+1])
                {
                    left++;
                }
                
                while(left<right && arr[right]==arr[right-1])
                {
                    right--;
                }
                
                left++;
                right--;
            }
            else if(sum<0)
            {
                left++;
            }
            else
            {
                right--;
            }
            
            }
        }
        
        return result;
        
    }
}
