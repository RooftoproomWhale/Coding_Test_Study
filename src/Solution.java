import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public int solution(int[] priorities, int location) {
        ArrayDeque<Document> deque = new ArrayDeque<>();
        Document target = null;
        for (int i = 0; i < priorities.length; i++) {
            Document document = new Document(priorities[i]);
            if (location == i) {
                target = document;
            }
            deque.offer(document);
        }

        ArrayList<Document> documents = new ArrayList<>();
        while (!deque.isEmpty()) {
            Document topDocument = deque.stream()
                    .max(Comparator.comparing(Document::getPriority))
                    .orElseThrow(NoSuchFieldError::new);
            Document firstDocument = deque.poll();
            if (firstDocument.getPriority() < topDocument.getPriority()) {
                deque.offerLast(firstDocument);
                continue;
            }
            documents.add(topDocument);
        }

        return documents.indexOf(target) + 1;
    }
}