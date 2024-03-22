import java.io.*;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BaekJoon_11637 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

         int t = Integer.parseInt(bf.readLine());

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bf.readLine());
            int sum = 0;

            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(bf.readLine());
                sum = sum + x;
                queue.add(new int[] {j + 1, x});
            }

            int[] temp = queue.poll();
            if(Objects.requireNonNull(temp)[1] == Objects.requireNonNull(queue.peek())[1]) {
                bw.write("no winner" + "\n");
            } else {
                if(temp[1] > sum/2) {
                    bw.write("majority winner " + temp[0] + "\n");
                } else {
                    bw.write("minority winner " + temp[0] + "\n");
                }
            }
            queue.clear();
        }
        bw.flush();
    }

}
