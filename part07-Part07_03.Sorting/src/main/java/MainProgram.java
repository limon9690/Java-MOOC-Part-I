
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    
    public static int smallest(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            min = Math.min(min, num);
        }
        return min;
    }

    public static int indexOfSmallest(int[] array){
        int idx = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                idx = i;
            }
        }

        return idx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int idx = startIndex;
        int min = Integer.MAX_VALUE;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                idx = i;
            }
        }

        return idx;
    }

    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }   

        for (int i = 0; i < array.length; i++) {
            int smallestidx = indexOfSmallestFrom(array, i);
            swap(array, i, smallestidx);

            for(int num : array) {
                System.out.println(num);
            }
        }
    }
    


}
