package lesson6;

import java.util.Arrays;

public class DynamicArray {

    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        this.array = new int[1];
        this.count = 0;
        this.size = array.length;
    }

    public void add(int data) {
        if (count == size) {
            growSize();
        }
        array[count++] = data;
    }

    private void growSize() {
        int[] newArray = Arrays.copyOf(array, (array.length * 2));
        array = newArray;
        size = array.length;
    }

    public void remove() {
        if (count > 0) {
            array[--count] = 0;
        } else {
            throw new RuntimeException("Array is empty");
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", count=" + count +
                ", size=" + size +
                '}';
    }
}
