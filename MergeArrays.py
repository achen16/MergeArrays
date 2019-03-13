def mergeArrays(arr1, arr2, x):
    mergedList = []
    for i in arr1:
        mergedList.append(i)

    for j in arr2:
        mergedList.append(j)


    print ("Unsorted: ")
    print (mergedList)
    for r in range(0, x):
        print (mergedList[r])

def mergeSortedArrays(arr1, arr2, x):
    mergedSortedList = []
    i = 0
    j = 0

    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            mergedSortedList.append(arr1[i])
            i += 1
        else:
            mergedSortedList.append(arr2[j])
            j += 1

    while i < len(arr1):
        mergedSortedList.append(arr1[i])
        i += 1

    while j < len(arr2):
        mergedSortedList.append(arr2[j])
        i += 1

    print ("Sorted: ")
    print (mergedSortedList)
    for r in range(0, x):
        print (mergedSortedList[r])

def main():
     arr1 = [ 1, 18, 22, 100, 105, 1002 ]
     arr2 = [ 16, 17, 19, 21, 1001 ]
     x = 5;

     mergeArrays(arr1, arr2, x)
     mergeSortedArrays(arr1, arr2, x)


if __name__ == '__main__':
    main()
