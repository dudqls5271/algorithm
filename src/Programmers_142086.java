import java.util.Arrays;

public class Programmers_142086 {
    public static void main(String[] args) {
        Programmers_142086 programmers142086 = new Programmers_142086();

        System.out.println(Arrays.toString(programmers142086.solution("banana")));
        System.out.println(Arrays.toString(programmers142086.solution("foobar")));

    }
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if(sb.lastIndexOf(String.valueOf(s.charAt(i))) == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - sb.lastIndexOf(String.valueOf(s.charAt(i)));
            }
            sb.append(s.charAt(i));
        }

        return answer;
    }
}
