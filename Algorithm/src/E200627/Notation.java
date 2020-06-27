package E200627;

public class Notation {
	 public static String solution(int n, int t, int m, int p) {
        String answer = "";
        String[] number = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

        String result = "0";

        int idx = 1;
        int count = 1; //Result length check
        boolean flag = true;

        while(count < t*m) { //count must be less than the minimum (turn*member)
            flag = true;
            String tmp = "";
            int num = idx;

            while(flag) {
                if (num / n == 0) flag = false;
                tmp = number[num%n] + tmp;
                num/=n;
            }
            count += tmp.length();
            result += tmp;
            idx++;

        }
        char [] toChar = result.toCharArray();
        
        for(int i= p-1 ;i<toChar.length;i+=m){
            /* 2 1 [0.2.4.6.8....]
               2 2 [1.3.5.7..]
               3.3 [2.5.8.11...]*/
            answer +=toChar[i];
            if( answer.length() >= t ) break;
        }
        return answer;
    }
}