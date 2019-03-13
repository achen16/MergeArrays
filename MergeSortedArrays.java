import java.util.Arrays;
public class MergeSortedArrays {
   static void mergeSortedArrays(int arr1[],int arr2[], int x)
   {
     int[] arr3 = new int[arr1.length + arr2.length];
     int i = 0, j = 0, k = 0;
     while (i < arr1.length && j < arr2.length) {
          if (arr1[i] < arr2[j]) {
              arr3[k] = arr1[i];
              i++;
          } else {
              arr3[k] = arr2[j];
              j++;
          }
          k++;
     }
     /* Copy remaining elements of arr1 if any */
     while (i < arr1.length)
     {
       arr3[k] = arr1[i];
       i++;
       k++;
     }

     /* Copy remaining elements of arr2 if any */
     while (j < arr2.length)
     {
       arr3[k] = arr2[j];
       j++;
       k++;
     }

     System.out.println("Sorted Merged Array: " + Arrays.toString(arr3));

     for (int count = 0; count < x; count++ ) {
       System.out.println(arr3[count]);
     }


   }

static void mergeArrays(int arr1[],int arr2[], int x)
{
  int[] arr3 = new int[arr1.length + arr2.length];
  int index = 0;
  int i = 0;
  for (i = 0; i < arr1.length; i++) {
    arr3[i] = arr1[i];
  }

  for (int j = 0; j < arr2.length; j++) {
    arr3[i+j] = arr1[j];
  }

  System.out.println("Merged Array: " + Arrays.toString(arr3));
  for (int count = 0; count < x; count++ ) {
    System.out.println(arr3[count]);
  }

}
   public static void main(String[] args) {
     int[] arr1 = { 1, 18, 22, 100, 105, 1002 };
     int[] arr2 = { 16, 17, 19, 21, 1001 };
     int x = 5;

     mergeArrays(arr1, arr2, x);
     mergeSortedArrays(arr1, arr2, x);

   }
 }
