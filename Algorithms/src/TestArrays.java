import myarray.DynamicArray;

public class TestArrays {
    public static void main(String[] args) throws Exception {

        long startTime;
        long endTime;
        long elapsedTime;

        DynamicArray dynamicArray = new DynamicArray(5);

        startTime = System.nanoTime();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        // dynamicArray.insert(0, "X");
        // dynamicArray.delete("A");
        // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }
}
