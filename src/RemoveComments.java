import java.util.ArrayList;
import java.util.List;

public class RemoveComments {
    public static String helper(List<String> list){
        StringBuilder sb = new StringBuilder();
        ArrayList<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        boolean flag = false;
        for(String s : list){
            for(int i = 0; i <s.length(); i++){
                if(flag){
                    if(s.charAt(i)=='*' && i != s.length()-1 && s.charAt(i+1)=='/'){
                        flag = false;
                        i++;
                    }
                    if(s.charAt(i)=='/' && i != s.length()-1 && s.charAt(i+1) =='/'){
                        break;
                    }
                    temp.append(s.charAt(i));
                }else if(s.charAt(i)=='/' && i != s.length()-1 && s.charAt(i+1) =='/'){
                    break;
                } else if(s.charAt(i)=='/' && i != s.length()-1 && s.charAt(i+1) =='*'){
                    flag = true;
                    i++;
                    temp.append("/*");
                }else{
                    sb.append(s.charAt(i));
                }

            }
            if(sb.length() > 0 && flag){
                res.add(sb.toString()+temp.toString()+"\n");
                sb = new StringBuilder();
                temp = new StringBuilder();
            }
            if(flag && temp.length() > 0){
                res.add(temp.toString()+"\n");
                temp = new StringBuilder();
            }
        }
        String s = "";
        for(String ss : res){
            s +=ss;
        }
        return s;
    }
    public static void main(String[] args) {
        String s1 = "aaaa/*bc";
        String s2 = "cc//de";
        String s3 = "1212*/";
        String s4 = "fdf/*ssd";
        List<String> inputs = new ArrayList<>();
        inputs.add(s1);
        inputs.add(s2);
        inputs.add(s3);
        inputs.add(s4);
        System.out.println(helper(inputs));
    }
}
