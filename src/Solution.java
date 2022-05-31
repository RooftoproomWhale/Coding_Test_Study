import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer>  solution() throws IOException {
        List<Integer> results = new ArrayList<>();
        Queue queue = new Queue();
        final List<String> commendLines = this.getFile("input.tsv");
        for (String commendLine : commendLines) {
            String[] splitCommend = commendLine.split("\t");
            String operator = splitCommend[0];
            String operand = null;

            if(splitCommend.length == 2){
                operand = splitCommend[1];
            }

            switch (operator){
                case "push":
                    queue.push(Integer.parseInt(operand));
                    break;
                case "pop":
                    results.add(queue.pop());
                    break;
                case "size":
                    results.add(queue.size());
                    break;
                case "empty":
                    results.add(queue.empty());
                    break;
                case "front":
                    results.add(queue.front());
                    break;
                case "back":
                    results.add(queue.back());
                    break;
                default:
                    throw new IllegalArgumentException("정의되지 않은 연산자.");
            }
        }
        return results;
    }


    public List<String> getFile(String fileName) throws IOException {
        return Files.readAllLines(Path.of(this.getClass().getClassLoader().getResource(fileName).getPath()));
    }
}

