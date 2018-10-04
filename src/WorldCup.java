import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorldCup {
    public static String helper(List<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(!map.containsKey(list.get(i)+list.get(j))){
                    map.put(list.get(i)+list.get(j),1);
                }else{
                    map.put(list.get(i)+list.get(j), map.get(list.get(i)+list.get(j))+1);
                }
            }
        }
        int maxCount = 0;
        for(int count : map.keySet()){
            if(count > maxCount){
                maxCount = count;
            }
        }
        double sum = 0;
        for(int s : map.values()){
            sum +=s;
        }
        return String.valueOf(map.get(maxCount)/sum);
    }
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(2);
        input.add(3);
        System.out.println(helper(input));
    }
}
