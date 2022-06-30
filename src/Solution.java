import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution
{
    public String solution(int[] numbers)
    {
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((t1, t2) -> (t2 + t1).compareTo((t1 + t2)))
                .collect(Collectors.joining());

        if(answer.startsWith("0")) return "0"; // [0,0,0] 대비

        return answer;
    }
}
