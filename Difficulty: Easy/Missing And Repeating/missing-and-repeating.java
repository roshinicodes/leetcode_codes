class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        
        HashMap<Integer,Integer>freq=new HashMap<>();
        
        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int n=arr.length;
        
        int repeating=0;
        int missing=0;
        for(int i=1;i<=n;i++)
        {
            if(!freq.containsKey(i))
            {
                missing=i;
            }
            else if(freq.get(i)>1)
            {
                repeating=i;
            }
        }
        
        list.add(repeating);
        list.add(missing);
        
        return list;
        
    }
}
