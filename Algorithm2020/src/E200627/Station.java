package E200627;

public class Station {
	public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        int pos = 1; //APT postion
        int idx = 0;
        while(pos<=n){
            //Except out of bound
            if(idx<stations.length && pos >= stations[idx]-w && pos <= stations[idx]+w){
                pos = stations[idx] + w + 1; //Move end of station
                idx ++;
            } else {
                answer++;
                pos += (w*2) + 1;
            }
        }
        return answer;
    }
}
