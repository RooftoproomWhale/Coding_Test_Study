import java.util.ArrayDeque;

public class Solution
{
    public String solution(int N, String commands)
    {
        ArrayDeque<String> queue = new ArrayDeque<>();
        StringBuilder returnValue = new StringBuilder();

        String[] commandArray = commands.split("\n");

        for (int i = 0; i < N; i++)
        {
            String[] command = commandArray[i].split(" ");

            switch (command[0])
            {
                case "push":
                    queue.offer(command[1]);
                    break;
                case "pop" :
                    if (queue.size() > 0) {
                        returnValue.append(queue.poll()).append("\n");
                        continue;
                    }
                    returnValue.append("-1").append("\n");
                    break;
                case "size" : returnValue.append(queue.size()).append("\n"); break;
                case "empty" : returnValue.append((queue.isEmpty()) ? 1 : 0).append("\n"); break;
                case "front" : returnValue.append(queue.peekFirst()).append("\n"); break;
                case "back" : returnValue.append(queue.peekLast()).append("\n"); break;
                default : throw new IllegalArgumentException("올바르지 않은 명령어");
            }
        }

        return returnValue.toString();
    }
}
