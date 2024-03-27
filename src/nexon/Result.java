package nexon;
import java.util.*;
public class Result {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(2);
        integers.add(4);
        integers.add(1);
        integers.add(0);
        System.out.println(countSubsequences(integers, 2, 3));

        int[] array = {0, 2, 4, 1, 0};
        List<Integer> chosen = new ArrayList<>();
        printSubsequences(array, 0, chosen);
    }

    public static void printSubsequences(int[] array, int index, List<Integer> current) {
        if (index == array.length) {
            // 기저 사례: 모든 요소를 고려했을 때
            System.out.println(current);
            return;
        }

        // 현재 요소를 포함시키지 않는 경우
        printSubsequences(array, index + 1, current);

        // 현재 요소를 포함시키는 경우
        current.add(array[index]);
        printSubsequences(array, index + 1, current);
        // 재귀 호출 후에는 현재 요소를 다시 제거하여 이전 상태로 되돌림
        current.remove(current.size() - 1);
    }
    public static int countSubsequences(List<Integer> arr, int l, int r) {
        int count = 0;

        for (int i = 0; i < (1 << arr.size()); i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < arr.size(); j++) {
                if ((i & (1 << j)) > 0) {
                    set.add(arr.get(j));
                }
            }

            int mex = 0;
            while (set.contains(mex)) {
                mex++;
            }

            if (mex >= l && mex <= r) {
                count = (count + 1);
            }
        }

        return count;
    }
}