import java.util.Stack;

public class ReverseExpression {
    public static String reverseExpression(String input) {
        Stack<String> s = new Stack();
        StringBuilder sb = new StringBuilder();

        int index = 0;
        if(input.charAt(index) == '-'){
            sb.append('-');
            index++;
            while(!isSymbol(input,index)){
                sb.append(input.charAt(index));
                index++;
            }
            s.add(sb.toString());
            sb = new StringBuilder();
        }

        for(int i = index; i <input.length(); i++){
            while(i < input.length() && (Character.isDigit(input.charAt(i)) || input.charAt(i)=='.' || (i-1>=0 && input.charAt(i)=='-' && isSymbol(input,i-1)))){
                sb.append(input.charAt(i));
                i++;
            }
            if(sb.length()>0) {
                s.add(sb.toString());
                sb = new StringBuilder();
            }
            if(i < input.length()){
                sb.append(input.charAt(i));
                s.add(sb.toString());
                sb = new StringBuilder();
            }

        }
        String res = new String();
        while(!s.isEmpty()){
            String temp = s.pop();
            res +=temp;
        }
        return  res;
    }

    private static boolean isSymbol(String s, int index) {
        if (s.charAt(index) == '*' || s.charAt(index) == '+' || s.charAt(index) == '-'|| s.charAt(index) == '/') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String equation1 = "-1*2+9-23";
        String equation2 = "12*2.4+-9.6--23.89";
        System.out.println(reverseExpression(equation1));
        System.out.println(reverseExpression(equation2));
    }
}
