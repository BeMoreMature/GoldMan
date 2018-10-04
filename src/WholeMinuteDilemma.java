import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WholeMinuteDilemma {
    public static int helper(List<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
        int c6 = 0;
        for(int i : list){
            int key = i%60;
            if(key != 0){
                if(!map.containsKey(key)){
                    map.put(key,1);
                }else {
                    map.put(key,map.get(key)+1);
                }
            }else{
                c6++;
            }

        }
        int count = 0;
        for(int i : list){
            int k = i%60;
            int sub = 60-k;
            if(map.containsKey(sub) && sub != k){
                count += map.get(sub);
            }
        }
        count = count / 2;
        if(map.containsKey(30) && map.get(30) > 1){
            for(int i = map.get(30)-1; i >=0; i--){
                count+=i;
            }
        }
        for(int i = c6-1; i>=0; i--){
            count=count+i;
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(3,60,60,60);
        List<Integer> input = Arrays.asList(4,10,50,90,30);
        int output = helper(input);
        System.out.println(output);

    }
}
