import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        final int[] array = {1, 5, 2, 6, 3, 7, 4};
        final int[][] commands = {new int[]{2, 5, 3}, new int[]{4, 4, 1}, new int[]{1, 7, 3}};
        final Solution solution = new Solution();
        final int[] expeted = solution.solution(array, commands);
        final int[] actualy = new int[]{5, 6, 3};
        assert Arrays.equals(expeted, actualy);
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            final int[] command = commands[i];
            final int from = command[0] - 1;
            final int to = command[1];
            final int targetIdx = command[2] - 1;
            final int[] subArray = Arrays.copyOfRange(array, from, to);
            final QuickSort quickSort = new QuickSort(subArray);
            quickSort.sort();
            answer[i]=subArray[targetIdx];
        }
        return answer;
    }

}
class QuickSort  {
    private final int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        sort(0, array.length - 1);
    }

    private void sort(int left, int right) {
        if (left >= right) return;
        int pivot = this.partition(left, right);
        sort(left, pivot - 1);
        sort(pivot + 1, right);
    }

    private int partition(int left, int right) {
        int pivot = left;
        left = left + 1;
        while (left <= right) {
            while (left <= right && array[left] <= array[pivot]) ++left;
            while (left <= right && array[right] >= array[pivot]) --right;
            if(left <= right) swap(left, right);
        }
        swap(pivot, right);
        return right;
    }

    private final void swap(int to, int from) {
        int swap = array[to];
        array[to] = array[from];
        array[from] = swap;
    }
}