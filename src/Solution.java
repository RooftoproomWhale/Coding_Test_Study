import java.util.Arrays;

public class Solution
{
    public int solution(int n, int[] adventurer)
    {
        int groupCnt = 0;
        int cnt = 0;

        Arrays.sort(adventurer);

        for(int ad : adventurer)
        {
            cnt++;
            if(cnt >= ad)
            {
                groupCnt++;
                cnt = 0;
            }
        }

        return groupCnt;
    }
}
