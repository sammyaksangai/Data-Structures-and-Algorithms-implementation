// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HeapSort {
    
    public void MaxHeapify(int[] arr, int index, int size)
    {
        int temp;
        int largestIndex = index;
        int left = index*2 + 1;
        int right = index*2 + 2;
        if(left < size && arr[left] > arr[index])
            largestIndex = left;
        if(right < size && arr[right] > arr[largestIndex])
            largestIndex = right;
        if(largestIndex != index)
        {
            temp = arr[largestIndex];
            arr[largestIndex] = arr[index];
            arr[index] = temp;
            MaxHeapify(arr, largestIndex, size);
        }
    }
    
    public void BuildMaxHeap(int[] arr)
    {
        //MaxHeapify(arr, index, arr.length);
        for(int i = arr.length / 2 - 1; i >= 0; i--)
        {
            MaxHeapify(arr,i,arr.length);
        }
    }
    
    public void HeapSort(int[] arr)
    {
        BuildMaxHeap(arr);
        int temp;
        int size = arr.length;
        for(int i = size - 1; i > 0; i--)
        {
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            size -= 1;
            MaxHeapify(arr,0,size);
        }
        for (int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        HeapSort h = new HeapSort();
        int[] arr = {3,1,6,4,8,12,6,5};
        h.HeapSort(arr);
    }
}
