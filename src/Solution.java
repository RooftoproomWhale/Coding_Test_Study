public class Solution
{
    public int solution(String s)
    {
        String[] intStrArr = s.split("");
        int currNum = Integer.parseInt(intStrArr[0]);

        for (int i = 1; i < intStrArr.length; i++)
        {
            int nextNum = Integer.parseInt(intStrArr[i]);
            if(currNum == 0 || nextNum == 0)
            {
                currNum += nextNum;
                continue;
            }
            currNum *= nextNum;
        }

        return currNum;
    }
}
