import java.util.ArrayList;

public class SmallSubstring {
    public static void main(String[] args) {
        SmallSubstring smallSubstring = new SmallSubstring();
//        System.out.println(smallSubstring.solution("3141592", "271"));
//        System.out.println(smallSubstring.solution("500220839878", "7"));
        System.out.println(smallSubstring.solution("10203", "15"));
    }
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();

        for (int i = 0; i <= t.length()-len; i++) {
            String tempStr = t.substring(i, i+len);
            if(Long.parseLong(tempStr) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
