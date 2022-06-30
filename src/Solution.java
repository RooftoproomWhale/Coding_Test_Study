import java.util.Arrays;

public class Solution
{

    public int[] solution(int[] array, int[][] commands)
    {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] command : commands)
        {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int[] cutArray= Arrays.copyOfRange(array,i - 1,j);
            Arrays.sort(cutArray);
            answer[index] = cutArray[k - 1];
            index++;
        }

        return answer;
    }
}
