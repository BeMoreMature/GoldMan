import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class charityGiving {
    public static String[] helper(int[] input) {

        String[] person = new String[]{"A", "B", "C"};
        int[] money = new int[3];
        String[] res = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            int minIndex = findMinIndex(money);
            res[i] = person[minIndex];
            money[minIndex] += input[i];
        }

        return res;
    }

    private static int findMinIndex(int[] money) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < money.length; i++) {
            if (money[i] < min) {
                index = i;
                min = money[i];
            }
        }

        return index;
    }


    public static void main(String[] argv) {
        int[] input = new int[] {25,8,2,35,15,120,55,42};
        String[] res = helper(input);
        for(String s : res) {
            System.out.println(s);
        }
    }
}
