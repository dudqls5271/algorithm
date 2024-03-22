import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Lifeboat {
    public static void main(String[] args) {
        Lifeboat lifeboat = new Lifeboat();
        System.out.println(lifeboat.solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(lifeboat.solution(new int[]{70, 80, 50}, 100));
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;

        Arrays.sort(people);

        for (int i = people.length - 1; min <= i; i--){
            if(people[min] + people[i] <= limit) {
                min++;
            }
            answer++;
        }

        return answer;
    }
}
