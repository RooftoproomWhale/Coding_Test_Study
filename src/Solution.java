import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int k, int[] inputs) {
        ArrayDeque<Integer> stack = new ArrayDeque<>(k);
        for (int input : inputs) {
            if(input != 0){
                stack.push(input);
            }else{
                stack.pop();
            }
        }
        return stack.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 횟수(k)를 입력하시오 : ");
        int k = Integer.parseInt(scanner.nextLine());
        int[] inputs = IntStream.range(0, k).map(i ->{
            System.out.printf("%d번째 정수를 입력하시오 : ",i+1);
            return Integer.parseInt(scanner.nextLine());
        }).toArray();
        System.out.printf("결과 : %d", new Solution().solution(k, inputs));
    }
}
