package myarray;

public class DynamicArray {
  public int size;
  public int capacity = 10;
  public Object[] array;

  public DynamicArray() {
    this.array = new Object[capacity];
  }

  public DynamicArray(int capacity) {
    this.capacity = capacity;
    this.array = new Object[capacity];
  }

  public void add(Object data) {

  }

  public void insert(int index, Object data) {

  }

  public void delete(Object data) {

  }

  public int search(Object data) {
    return -1;
  }

  private void grow() {

  }

  private void shrink() {

  }

  public boolean isEmpty() {
    return size == 0;
  }

  public String toString() {
    return null;
  }

}
