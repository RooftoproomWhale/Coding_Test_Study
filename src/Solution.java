public class Solution
{
    public int solution(int[][] data)
    {
        int answer = Integer.MIN_VALUE;

        for(int[] row : data)
        {
            int minValue = Integer.MAX_VALUE;
            for (int i : row)
            {
                minValue = Math.min(i,minValue);
            }
            answer = Math.max(minValue,answer);
        }

        return answer;
    }

}
