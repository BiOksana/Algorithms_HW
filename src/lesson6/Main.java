package lesson6;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(5);
        System.out.println("dynamicArray.getSize() = " + dynamicArray.getSize());
        dynamicArray.add(10);
        System.out.println("dynamicArray.getSize() = " + dynamicArray.getSize());
        dynamicArray.add(8);
        System.out.println("dynamicArray.getSize() = " + dynamicArray.getSize());
        dynamicArray.add(11);
        dynamicArray.add(16);
        dynamicArray.add(12);
        System.out.println(dynamicArray);
        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.remove();
        dynamicArray.remove();
        System.out.println(dynamicArray);
        dynamicArray.add(11);
        dynamicArray.add(16);
        dynamicArray.add(12);
        System.out.println(dynamicArray);

    }
}
