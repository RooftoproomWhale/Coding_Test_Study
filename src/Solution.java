import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        final int[][] nodeinfo = {
                new int[]{5, 3}
                , new int[]{11, 5}
                , new int[]{13, 3}
                , new int[]{3, 5}
                , new int[]{6, 1}
                , new int[]{1, 3}
                , new int[]{8, 6}
                , new int[]{7, 2}
                , new int[]{2, 2}
        };
        final Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.solution(nodeinfo)));
    }
    public int[][] solution(int[][] nodeinfo) {
        Tree tree = new Tree();
        IntStream.range(0, nodeinfo.length)
                .mapToObj(idx -> this.createNodeXY(nodeinfo, idx))
                .sorted(Comparator.comparing(NodeXY::getY).reversed())
                .forEach(tree::append);
        return tree.getTraversals();
    }

    private NodeXY createNodeXY(int[][]nodeinfo, int idx){
        int[] xy = nodeinfo[idx];
        return  new NodeXY(xy[0], xy[1], ++idx);
    }
}
