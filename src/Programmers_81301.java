import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmers_81301 {
    public static void main(String[] args) {
        Programmers_81301 programmers81301 = new Programmers_81301();
        System.out.println(programmers81301.solution("seventwo"));
    }

    public int solution(String s) {
        String[] intArr = {"0","1","2","3","4","5","6","7","8","9"};
        String[] engArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < engArr.length; i++) {
            s = s.replace(engArr[i], intArr[i]);
        }

        return Integer.parseInt(s);
    }
}
