// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MergeSort 
{
    
    public void Merge(int[] arr, int low, int mid, int high)
    {
            int n1, n2;
            n1 = mid - low + 1;
            n2 = high - mid;
            
            int[] left = new int[n1];
            int[] right = new int[n2];
            
            for(int i = 0; i < n1; i++)
                left[i] = arr[low + i];
                
            for(int j = 0; j < n2; j++)
                right[j] = arr[mid + 1 + j];
                
            int i=0,j=0;
            int k=low; 
            
            while(i < n1 && j < n2)
            {
                if(left[i] <= right[j])
                {
                    arr[k] = left[i];
                    i += 1;
                }
                else
                {
                    arr[k] = right[j];
                    j += 1;
                }
                k +=1 ;
            }
            while (i < n1)
            {
                arr[k] = left[i];
                i += 1;
                k += 1;
            }
            while (j < n2)
            {
                arr[k] = right[j];
                j += 1;
                k += 1;
            }
    }
    public void MergeSort(int[] arr, int low, int high)
    {
            
        if(low < high)
        {
            int mid = low + (high - low )/2;
            MergeSort(arr, low, mid);
            MergeSort(arr, mid + 1, high);
            Merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) 
    {
        MergeSort m = new MergeSort();
        int[] arr = {3,4,2,1,5,6,6,0,9};
        m.MergeSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
