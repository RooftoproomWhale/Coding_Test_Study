import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public static class File implements Comparable<File>
    {
        private final String head;
        private final String number;
        private final String tail;

        public File(String head, String number, String tail) {
            this.head = head;
            this.number = number;
            this.tail = tail;
        }

        public String getHead() {
            return head;
        }

        public String getNumber() {
            return number;
        }

        public String getTail() {
            return tail;
        }

        @Override
        public String toString() {
            return head + number + tail;
        }

        @Override
        public int compareTo(File o)
        {
            return Integer.parseInt(this.number) - Integer.parseInt(o.getNumber());
        }
    }
    public String[] solution(String[] files)
    {
        ArrayList<File> fileList = new ArrayList<>();
        for (String file : files)
        {
            String head = file.split("\\d")[0];
            String number = convertNum(file.substring(head.length()));
            String tail = file.substring(head.length() + number.length());

            fileList.add(new File(head, number, tail));
        }
        Comparator<File> comparator = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                int result = o1.getHead().compareToIgnoreCase(o2.getHead());

                if (result == 0) {
                    result = o1.compareTo(o2);
                }

                return result;
            }
        };

        return fileList.stream()
                .sorted(comparator)
                .map(File::toString)
                .toArray(String[]::new);
    }
    public String convertNum(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
            {
                result.append(c);
                continue;
            }
            break;
        }
        return result.toString();
    }
}
