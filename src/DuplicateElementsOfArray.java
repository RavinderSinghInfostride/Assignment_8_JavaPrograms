public class DuplicateElementsOfArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 2, 7, 8, 1, 4, 8};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Duplicate elements of array are : " + array[j]);
                }
            }
        }
    }
}
