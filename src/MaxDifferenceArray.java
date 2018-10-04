import java.util.Arrays;
import java.util.List;

public class MaxDifferenceArray {
    public static int helper(List<Integer> inputs) {
        int min = Integer.MAX_VALUE;
        int diff = Integer.MIN_VALUE;
        for (Integer val: inputs) {
            if (val % 2 != 0) {
                min = Math.min(min, val);
            } else if (val - min > 0){
                if(min != Integer.MAX_VALUE)
                    diff = Math.max(diff, val - min);
            }
        }

        return diff==Integer.MIN_VALUE?-1:diff;
    }
    public static void main(String[] args) {
        List<Integer> inputs = Arrays.asList(2,3,5,4,8,6,1,4);
        System.out.println(helper(inputs));
    }
}
