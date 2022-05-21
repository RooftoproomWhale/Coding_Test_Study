import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ou are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * 1 -> 2 -> 4
 * 1 -> 3 -> 4
 *
 * result : 1 -> 1 -> 2 -> 3 -> 4- > 4
 */
public class Solution {
    static public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode solution(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode mergedList;
        ListNode mergedHead;
        if(list2 == null){
            return list1;
        }else if(list1 == null){
            return list2;
        }

        if(list1.val >= list2.val){
            mergedList = list2;
            list2 = list2.next;
        }else{
            mergedList = list1;
            list1 = list1.next;
        }
        mergedHead = mergedList;

        while(list1 != null && list2 != null){
            if(list1.val >= list2.val){
                mergedList.next = list2;
                list2 = list2.next;
            }else{
                mergedList.next = list1;
                list1 = list1.next;
            }
            mergedList = mergedList.next;
        }

        while(list1 != null){
            mergedList.next = list1;
            mergedList = mergedList.next;
            list1 = list1.next;
        }
        while(list2 != null){
            mergedList.next = list2;
            mergedList = mergedList.next;
            list2 = list2.next;
        }

        return mergedHead;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        final String[] split1 = line1.split(" ");
        final String[] split2 = line2.split(" ");
        int[] inputIntArray1 = Arrays.stream(split1).mapToInt(Integer::parseInt).toArray();
        int[] inputIntArray2 = Arrays.stream(split2).mapToInt(Integer::parseInt).toArray();

        ListNode head1 = new ListNode(inputIntArray1[0]);
        ListNode head2 = new ListNode(inputIntArray2[0]);

        ListNode list1 = head1;
        for (int i = 1; i < inputIntArray1.length; i++) {
            list1.next = new ListNode(inputIntArray1[i]);
            list1 = list1.next;
        }

        ListNode list2 = head2;
        for (int i = 1; i < inputIntArray2.length; i++) {
            list2.next = new ListNode(inputIntArray2[i]);
            list2 = list2.next;
        }

        Solution solution = new Solution();
        ListNode mergedListNode = solution.solution(head1, head2);
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(mergedListNode != null){
            arrayList.add(mergedListNode.val);
            mergedListNode = mergedListNode.next;
        }

        System.out.println(arrayList);
    }
}
