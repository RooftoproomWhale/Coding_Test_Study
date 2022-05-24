import java.util.LinkedList;
import java.util.ListIterator;

public class Solution
{
    public String solution(String password)
    {
        StringBuilder answer = new StringBuilder();
        LinkedList<Character> linkedList = new LinkedList<>();
        ListIterator<Character> listIterator = linkedList.listIterator();


        for (int i = 0; i < password.length(); i++)
        {
            char pw = password.charAt(i);
            switch (pw)
            {
                case '<':
                    if(listIterator.hasPrevious()) listIterator.previous();
                    break;
                case '>':
                    if(listIterator.hasNext()) listIterator.next();
                    break;
                case '-':
                    if(listIterator.hasPrevious())
                    {
                        listIterator.previous();
                        listIterator.remove();
                    }
                    break;
                default:
                    listIterator.add(pw);
            }
        }

        for (char c : linkedList)
        {
            answer.append(c);
        }

        return answer.toString();
    }
}
