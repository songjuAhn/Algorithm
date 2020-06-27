package E200627;

public class Cookie {
	public static int solution(int[] cookie) {
        int answer = 0;
        for(int i = 0; i < cookie.length - 1; i++) {
            int front = cookie[i];
            int back = cookie[i+1];
            int idxFront = i;
            int idxBack = i+1;
            while(true) {
                if(front == back) answer = Math.max(front, answer);
                if(idxFront > 0 && front <= back) {
                    idxFront--;
                    front += cookie[idxFront];
                } else if(idxBack < cookie.length - 1 && front >= back) {
                    idxBack++;
                    back += cookie[idxBack];
                } else break;
            }
        }
        return answer;
    }
}