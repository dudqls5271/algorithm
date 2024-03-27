package nexon;

import java.util.*;

public class MeetingScheduler {

    public static int countMeetings(int[] firstDay, int[] lastDay) {
        // 투자자의 수
        int n = firstDay.length;

        // 투자자들의 미팅 가능 일자를 저장할 리스트
        List<int[]> meetings = new ArrayList<>();

        // 리스트에 각 투자자의 시작일과 종료일을 저장
        for (int i = 0; i < n; i++) {
            meetings.add(new int[]{firstDay[i], lastDay[i]});
        }

        // 미팅 가능한 마지막 날을 기준으로 정렬하고, 같다면 빠른 시작일 기준으로 정렬
        Collections.sort(meetings, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        // 스케줄된 미팅을 추적할 세트
        Set<Integer> scheduledDays = new HashSet<>();

        // 가능한 많은 미팅을 스케줄
        for (int[] meeting : meetings) {
            // 시작일부터 종료일까지 루프를 돌며 가능한 날에 스케줄
            for (int day = meeting[0]; day <= meeting[1]; day++) {
                // 해당 날짜에 미팅이 아직 스케줄되지 않았다면 스케줄하고 다음 투자자로 넘어감
                if (!scheduledDays.contains(day)) {
                    scheduledDays.add(day);
                    break;
                }
            }
        }

        // 스케줄된 미팅의 수 반환
        return scheduledDays.size();
    }

    public static void main(String[] args) {
        int[] firstDay = {1,1,2};
        int[] lastDay = {1,2,2};

        System.out.println("Maximum number of meetings: " + countMeetings(firstDay, lastDay));
    }
}
