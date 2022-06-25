package day_3;
import java.util.Arrays;

public class ArraysTask {
    public static void main(String [] args) throws Exception {
        //1) Find max number in array: 5, 9, 3, 2, 0, -4, -8.3, 3, -4
        double[] array_1 = {2, 7, 3, 2, 0, -4, -8.3, 2, -4};
        double max = array_1[0];

        for(double i: array_1) {
            if(i > max){
                max = i;
            }
        }

        System.out.println("Task_1");
        System.out.println("max = " + max);
        System.out.println();

        //2) Given array: {1, 6, 3, 3, 4, 5, 5, 6, 0}. Print array with only unique values, which are sorted.

        int[] array_2 = {1, 6, 3, 3, 4, 5, 5, 6, 0};
        int[] result_2 = new int[array_2.length];
        int tmp = 0;

        for(int i:array_2) {
            if(!contains(result_2, i)) {
                result_2[tmp++] = i;
            }
        }

        System.out.println("Task_2");
        Arrays.sort(result_2);
        for(int i = 0; i < result_2.length; i++ ) {
            if(i != (result_2.length - 1)) {
                if (result_2[i] != result_2[i + 1]) {
                    System.out.print(result_2[i] + "\t");
                }
            } else {
                System.out.print(result_2[i]);
            }
        }
        System.out.println();
        System.out.println();

        //Given an array, e.g. "12", "23", "34", "12", "56", "67“. Replace all values “12” to “replaced”
        String[] array_3 = {"12", "23", "34", "12", "56", "67"};
        for(int i = 0; i < array_3.length; i++){
            if(array_3[i].equals("12")) {
                array_3[i] = "replaced";
            }
        }

        System.out.println("Task_3");
        Arrays.stream(array_3).forEach(System.out::println);
        System.out.println();
        System.out.println("Task_4");
        //Print any array in reverse mode (from the end)
        String[] array_4 = {"12", "23", "34", "12", "56", "67"};
        int l=array_4.length-1;
        for(int i = l; i >- 1; i--){
            System.out.println(array_4[i]);
        }
    }

    private static boolean contains(int[] array, int test_element) {
        for(int i:array){
            if(test_element == i) {
                return true;
            }
        }
        return false;
    }
}
