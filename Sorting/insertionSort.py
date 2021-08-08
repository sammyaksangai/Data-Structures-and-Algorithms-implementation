def insertionSort(arr):
  size = len(arr)
  for i in range(1,size):
    #Sorted elements to the left of this key
    key = arr[i]
    j = i-1
    #place the element in correct position and then place the key
    while j>=0 and arr[j] > key: # change this to arr[j] < key to sort in non-increasing order
      arr[j+1] = arr[j]
      j -= 1
    arr[j+1] = key
  print(arr)


arr = [5,4,4,3,2,-2]
insertionSort(arr)
