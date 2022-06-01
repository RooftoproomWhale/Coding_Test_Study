import java.util.Collections;
import java.util.PriorityQueue;

public class Solution
{
    public int solution(int[] priorities, int location)
    {
        int answer = 1;

        PriorityQueue<Integer> printerQueue = new PriorityQueue<>(Collections.reverseOrder());//내림차순 우선순위 큐

        for (int priority : priorities)
            printerQueue.add(priority); // 뽑히는 순서 세팅

        while (!printerQueue.isEmpty()) // 큐가 빌 때까지 poll 하기 때문에 양뱡향 방식으로 순회
        {
            for (int i = 0; i < priorities.length; i++)
            {
                if(priorities[i] == printerQueue.peek())
                {
                    if(i == location) return answer; // 인쇄를 요청한 문서를 찾음
                    printerQueue.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}
