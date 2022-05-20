import java.util.LinkedList;
import java.util.Scanner;

/**
 https://www.acmicpc.net/problem/1021
 지민이는 N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 지민이는 이 큐에서 몇 개의 원소를 뽑아내려고 한다.

 지민이는 이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.

    1. 첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 → a2, ..., ak와 같이 된다.
    2. 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 → a2, ..., ak, a1이 된다.
    3. 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 → ak, a1, ..., ak-1이 된다.
 큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다.
 (이 위치는 가장 처음 큐에서의 위치이다.) 이때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
 */

public class Solution {

    public static void main(String[] args) {
        Solution T = new Solution();

        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int M =sc.nextInt();

        int[] order = new int[M];

        for(int i = 0; i < M; i++) {
            order[i] = sc.nextInt();
        }

        System.out.println();T.solution(N, M, order);
    }

    public int solution(int N, int M, int[] order) {
        int answer = 0;

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        for(int i = 0; i < M; i++) {

            int targetIdx = queue.indexOf(order[i]);
            int halfIdx;

            if(queue.size() % 2 == 0) {
                halfIdx = queue.size() / 2 - 1;
            }
            else {
                halfIdx = queue.size() / 2;
            }

            if(targetIdx <= halfIdx) {
                for(int j = 0; j < targetIdx; j++) {
                    int temp = queue.pollFirst();
                    queue.offerLast(temp);
                    answer++;
                }
            }
            else {
                for(int j = 0; j < queue.size() - targetIdx; j++) {
                    int temp = queue.pollLast();
                    queue.offerFirst(temp);
                    answer++;
                }

            }
            queue.pollFirst();
        }

        return answer;
    }
}
