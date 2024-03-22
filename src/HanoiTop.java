import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class HanoiTop {
    private static List<int[]> arr = new ArrayList<>();

    public static void main(String[] args) {
        HanoiTop hanoiTop = new HanoiTop();
        System.out.println(Arrays.deepToString(hanoiTop.solution(2)));
    }

    public int[][] solution(int n) {
        hanoi(n, 1, 2, 3);

        int[][] answer = arr.stream().toArray(int[][]::new);
        return answer;
    }

    public static void hanoi(int n, int start, int mid, int end) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, start, end, mid);
        arr.add(new int[]{start, end});
        hanoi(n-1, mid, start, end);
    }
}
