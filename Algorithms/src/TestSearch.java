public class TestSearch {

  /*
   * public static void main(String[] args) {
   * 
   * // linear search = Iterate through a collection one element at a time
   * // time complexity: O(n)
   * int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
   * int index = linearSearch(array, 1);
   * if(index != -1) {
   * System.out.println("Element found at index: " + index);
   * }
   * else {
   * System.out.println("Element not found");
   * }
   * 
   * }
   * 
   * private static int linearSearch(int[] array, int value) {
   * for (int i = 0; i < array.length; i++) {
   * if(array[i] == value) {
   * return i;
   * }
   * }
   * return -1;
   * }
   */

  /*
   * public static void main(String[] args) {
   * 
   * // binary search - within a sorted array
   * // time complexity: O(log n)
   * int array[] = new int[1000000];
   * int target = 7777;
   * 
   * for (int i = 0; i < array.length; i++) {
   * array[i] = i;
   * }
   * 
   * int index = binarySeach(array, target);
   * if(index == -1) {
   * System.out.println("Element not found");
   * }
   * else {
   * System.out.println("Element found at: " + index);
   * }
   * 
   * }
   * 
   * private static int binarySeach(int[] array, int target) {
   * 
   * int low = 0;
   * int high = array.length - 1;
   * while(low <= high) {
   * int middle = low + (high - low) / 2;
   * int value = array[middle];
   * 
   * System.out.println("middle: "+value);
   * 
   * if(value < target) low = middle + 1;
   * else if(value > target) high = middle - 1;
   * else return middle;
   * 
   * }
   * 
   * 
   * return -1;
   * }
   */

  public static void main(String[] args) {
    // interpolation search based on probe "guesses"
    // time complexity: O(log (log (n))) worst case O(n)

//    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] array = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
    int target = 256;

    int index = interpolationSearch(array, target);
    if(index == -1) System.out.println("Element not found");
    else System.out.println("Element found at: " + index);

  }

  private static int interpolationSearch(int[] array, int value) {

    int high = array.length - 1;
    int low = 0;

    while (value >= array[low] && value <= array[high] && low <= high) {
      int probe = low + (high - low) * (value - array[low]) /
          (array[high] - array[low]);
      System.out.println("probe: " + probe);

      if (array[probe] == value)
        return probe;
      else if (array[probe] < value)
        low = probe + 1;
      else
        high = probe - 1;
    }

    return -1;
  }

}
