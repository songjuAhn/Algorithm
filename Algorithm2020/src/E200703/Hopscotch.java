package E200703;

import java.util.Arrays;

public class Hopscotch {
	public int solution(int[][] land) {
        for(int i = land.length-1 ; i > 0 ; i--) {
           land[i-1][0] += Math.max(land[i][1], Math.max(land[i][2], land[i][3]));
           land[i-1][1] += Math.max(land[i][0], Math.max(land[i][2], land[i][3]));
           land[i-1][2] += Math.max(land[i][0], Math.max(land[i][1], land[i][3]));
           land[i-1][3] += Math.max(land[i][0], Math.max(land[i][1], land[i][2]));
        }
        Arrays.sort(land[0]);
        return land[0][3];
    }
}
