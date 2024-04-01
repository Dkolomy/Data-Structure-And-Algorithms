public class TestSorting {
  public static void main(String[] args) {

    int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

    // bubbleSort(array);
    // selectionSort(array);
    // insertionSort(array);
    // mergeSort(array);
    quickSort(array, 0, array.length - 1);

    for (int i : array) {
      System.out.print(i + " ");
    }

  }

  // runtime complexity = O(n log(n))
  // space complexity = O(log(n))
  private static void quickSort(int[] array, int start, int end) {
    if (end <= start)
      return; // base case

    int pivot = partition(array, start, end);
    quickSort(array, start, pivot - 1);
    quickSort(array, pivot + 1, end);

  }

  private static int partition(int[] array, int start, int end) {
    int pivot = array[end];
    int i = start - 1;

    for (int j = start; j <= end - 1; j++) {
      if (array[j] < pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    i++;
    int temp = array[i];
    array[i] = array[end];
    array[end] = temp;

    return i;
  }

  // runtime complexity = O(n Log n)
  // space complexity = O(n)
  private static void mergeSort(int[] array) {
    int length = array.length;
    if (length <= 1)
      return; // base case

    int middle = length / 2;
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];

    int i = 0; // leftArray
    int j = 0; // rightArray

    for (; i < length; i++) {
      if (i < middle) {
        leftArray[i] = array[i];
      } else {
        rightArray[j] = array[i];
        j++;
      }
    }
    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
  }

  private static void merge(int[] leftArray, int[] rightArray, int[] array) {
    int leftSize = array.length / 2;
    int rightSize = array.length - leftSize;
    int i = 0, l = 0, r = 0; // indicies

    // check the conditions for merging
    while (l < leftSize && r < rightSize) {
      if (leftArray[l] < rightArray[r]) {
        array[i] = leftArray[l];
        i++;
        l++;
      } else {
        array[i] = rightArray[r];
        i++;
        r++;
      }
    }
    while (l < leftSize) {
      array[i] = leftArray[l];
      i++;
      l++;
    }
    while (r < rightSize) {
      array[i] = rightArray[r];
      i++;
      r++;
    }

  }

  // Quadratic time O(n^2)
  private static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = temp;

    }
  }

  // Quadratic time O(n^2)
  private static void selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j])
          min = j;
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }
  }

  // Quadratic time O(n^2)
  private static void bubbleSort(int array[]) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

}
