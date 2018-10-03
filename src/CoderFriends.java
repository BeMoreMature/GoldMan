public class CoderFriends {
    public static String helper(String E, String B){
        int e[]= count(E);
        int b[]= count(B);

        int sum1=0, sum2=0;
        for(int i : e){
            sum1+=i;
        }
        for(int i : b){
            sum2+=i;
        }
        if(sum1 > sum2) return "Erica Wins";
        else if(sum1 < sum2) return "Bob Wins";
        else{
            if(e[0] > b[0]) return "Erica Wins";
            else if(e[0] < b[0]) return "Bob Wins";
            else{
                if(e[1] > b[1]) return "Erica Wins";
                else if(e[1] < b[1]) return "Bob Wins";
                else{
                    if(e[2] > b[2]) return "Erica Wins";
                    else if(e[2] < b[2]) return "Bob Wins";
                    else return "Tie";
                }
            }
        }

    }
    public static int [] count(String s){
        int res[]=new int[3];
        for(char c : s.toCharArray()){
            if(c=='H'){
                res[0]+=5;
            }else if(c == 'M'){
                res[1]+=3;
            }else if(c == 'E'){
                res[2]+=1;
            }
        }
        return res;
    }
    public static void main(String args[]){
        String E = "EHH";
        String B = "EME";
        System.out.print(helper(E,B));
    }
}
