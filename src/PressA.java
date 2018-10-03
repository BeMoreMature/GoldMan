public class PressA {
    public static String helper(String s ){
        int flag = 0;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'A'){
                flag++;
                continue;
            }else if(flag % 2  == 0){
                sb.append(c);
            }else{
                sb.append(Reverse(c));
            }
        }
        return sb.toString();
    }
    public static char Reverse(char c){
        if(c >= 'b' && c <= 'z') {
            return Character.toUpperCase(c);
        } else if(c >= 'B' && c <= 'Z') {
            return Character.toLowerCase(c);
        } else {
            return c;
        }
    }
    public static void main(String args[]){

        String input1 = "My keyboard is broken";
        String input2 = "'Baa, Baa!' said the sheep";
        System.out.println(helper(input1));
        System.out.println(helper(input2));
    }
}
