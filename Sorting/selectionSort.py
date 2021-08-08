def selectionSort(arr):
  size=len(arr)
  for i in range(0,size-1):
    for j in range(i+1,size):
      if arr[j] < arr[i]:
        arr[i],arr[j] = arr[j],arr[i]
  print(arr)

def selectionSortDescending(arr):
  size=len(arr)
  for i in range(0,size-1):
    for j in range(i+1,size):
      if arr[j] > arr[i]:
        arr[i],arr[j] = arr[j],arr[i]
  print(arr)
  
arr = [45,76,76,123,9,6]
selectionSort(arr)
selectionSortDescending(arr)
