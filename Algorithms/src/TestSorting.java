public class TestSorting {
  public static void main(String[] args) {

    int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

    // bubbleSort(array);
    // selectionSort(array);
    insertionSort(array);

    for (int i : array) {
      System.out.print(i + " ");
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
