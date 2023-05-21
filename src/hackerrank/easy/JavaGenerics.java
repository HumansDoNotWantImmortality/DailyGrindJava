package hackerrank.easy;

public class JavaGenerics {

    public static void main(String[] args) {
        JavaGenerics javaGenerics = new JavaGenerics();
        Integer[] arr = {1, 2, 3};
        String[] sArr = {"Hello", "World"};
        javaGenerics.printArray(arr);
        javaGenerics.printArray(sArr);
    }

    private <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
}
