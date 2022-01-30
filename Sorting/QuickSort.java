class QuickSort {

    public int Partition(int[] arr, int low, int high)
    {
        int i = low-1;
        int pivot = arr[high];
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j] <= pivot)
            {
                i += 1;
               //Swapping in one line without temp
                arr[i] += (arr[j] - (arr[j] = arr[i]));
            }
        }
        arr[high] += (arr[i+1] - (arr[i+1] = arr[high]));
        return (i+1);
    }
    
	public void QuickSort(int[] arr, int low, int high)
	{
	    if(low < high)
	    {
	        int pivot = Partition(arr, low, high);
	        QuickSort(arr,low,pivot-1);
	        QuickSort(arr, pivot+1,high);
	    }
	    
	}

	public static void main(String[] args)
	{
	    QuickSort q = new QuickSort();
	    int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
	    q.QuickSort(arr,0,arr.length-1);
	    for(int i = 0; i < arr.length; i++)
	        System.out.print(arr[i] + " ");

	}
}
