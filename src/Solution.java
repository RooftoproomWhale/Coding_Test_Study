public class Solution
{
    public String solution(String p) {
        return (isBalance(p)) ? p : convert(p);
    }

    private boolean isBalance(String s)
    {
        int count = 1;

        if(s.charAt(0) == ')') return false;

        for (int i = 1; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == ')') {
                count--;
                if(count < 0) return false;
            }
            else
                count++;
        }

        return true;
    }
    private String createStr(String u, String v)
    {
        StringBuilder sb = new StringBuilder("(");

        sb.append(convert(v));
        sb.append(")");
        for(int i = 1; i < u.length() - 1; i++)
        {
            if(u.charAt(i) == '(')
            {
                sb.append(")");
                continue;
            }
            sb.append("(");
        }

        return sb.toString();
    }
    private String convert(String s)
    {
        if(s.length() == 0) return "";

        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();

        int count = 0;

        for(int i = 0; i < s.length(); i++)
        {
            count = (s.charAt(i) == '(') ? count + 1 : count - 1 ;

            if(count == 0)
            {
                u.append(s, 0, i + 1);
                v.append(s,i + 1,s.length());

                if(isBalance(u.toString()))
                    u.append(convert(v.toString()));
                else
                    return createStr(u.toString(),v.toString());

                break;
            }
        }
        return u.toString();
    }
}