package E200627;

public class JadenCase {
	public static String solution(String s) {
        String answer = "";
        String [] split = s.toLowerCase().split(" ");
        for(int i=0;i<split.length;i++){
            char[] array = split[i].toCharArray();
            array[0] = Character.toUpperCase(array[0]);
            answer += new String(array);
            if(i != split.length-1)
                answer +=" ";
        }
        return answer;
    }
}