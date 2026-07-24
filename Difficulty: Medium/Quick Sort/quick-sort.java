class Solution {
    public void quickSort(int[] arr, int low, int high) {
        
        if(low<high)
        {
            int pivotindex=partition(arr,low,high);
            quickSort(arr,low,pivotindex-1);//sort the left group
            quickSort(arr,pivotindex+1,high);//sort the right group
        }
        // code here
        return;
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot=arr[high];
        int i=low-1;
        
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        
        swap(arr,i+1,high);
        return i+1;
        
    }
    private void swap(int arr[],int left,int right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}