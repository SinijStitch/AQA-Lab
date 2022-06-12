package day_2;

public class StringProcessor {
    public static void main(String[] args) {
        String s = "Task 2. Given a string, find the number of words in it.";
        int count = 0;
        System.out.println(s.split(" ").length);

        //Task 3. Given a string, show number of chars in each word
        //Не впевнений чи так можна. вирішив порахувати загальну к-сть чарів щоб була своя реалізація
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of characters in a string: " + count);

        //Task 4. Create function which takes 2 parameters
        System.out.println(stringWordCalc(s, 4));
    }

    private static int stringWordCalc(String s, int i){
        return s.split(" ")[i].length();
    }
}
