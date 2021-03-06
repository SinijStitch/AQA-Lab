package day_3;
import java.util.*;

public class CollectionsTask {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 3, 3, 4, 5, 5, 6, 0,6,4));
        System.out.println(replaceHalf(list, 6,10));
        List<List<Integer>> intMatrix = new ArrayList<>(Arrays.asList(Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,12,8),
                Arrays.asList(9,10,11,12),
                Arrays.asList(12,12,15,16)));
        printReverseMatrix(intMatrix);
        System.out.println();
        printMatrix(removeMatrixDuplicates(intMatrix));
        System.out.println();
        System.out.println(CountOfLetters("Given: String with big text (more than 1000 words). Write a method that calculates the numbers of words for each letter that starts the word."));
    }

    // Replaces value in first half of list with new value
    private static List<Integer> replaceHalf(List<Integer> intList, Integer element, Integer newElement) throws Exception {
            for (int i = 0; i < intList.size() / 2; i++) {
                if(intList.get(i).equals(element)) {
                    intList.set(i, newElement);
                }
            }
            return intList;
    }
    // Prints matrix
    private static void printMatrix(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            System.out.println();
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j)+"\t");
            }
        }
    }
    // Prints matrix in reverse order
    private static void printReverseMatrix(List<List<Integer>> matrix) {
        for(int i = 0; i<matrix.size(); i++) {
            System.out.println();
            for (int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(j).get(i)+"\t");
            }
        }
    }




    // Returns a matrix with unique values

    private static List<List<Integer>> removeMatrixDuplicates(List<List<Integer>> matrix) throws Exception {
        List<Integer> uniqueElements = new ArrayList<>();
        System.out.print("Returns a matrix with unique values");
        for(int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (uniqueElements.contains(matrix.get(i).get(j))) {
                    matrix.get(i).set(j,0);
                }
                else {
                    uniqueElements.add(matrix.get(i).get(j));
                }
            }
        }
        return matrix;
    }

    // Returns map where key is letter, and value is the number of words that starts with that letter
    private static Map<Character, Integer> CountOfLetters(String text) {
        Map<Character, Integer> letters = new HashMap<>();
        for (String word : text.split(" ")) {
            if (!letters.containsKey(word.charAt(0))) {
                letters.put(word.charAt(0), 1);
            }
            else {
                letters.put(word.charAt(0), letters.get(word.charAt(0))+1);
            }
        }
        return letters;
    }
}
