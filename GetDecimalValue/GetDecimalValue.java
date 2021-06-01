import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

    Return the decimal value of the number in the linked list.

    Input: head of a linked list
    Output: integer
    Constraints: The Linked List is not empty.
                 Number of nodes will not exceed 30.
                 Each node's value is either 0 or 1.
*/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LinkedList {
    ListNode head;

    LinkedList() {}

    void add(ListNode node) {
        ListNode current = head;

        if (head == null) {
            head = node;
            return;
        }

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
    }

    /**
     * @return the head
     */
    public ListNode getHead() {
        return head;
    }
}

public class GetDecimalValue {
    public static int getDecimalValue(ListNode head) {
        int result = 0;
        List<Integer> list = new ArrayList<>();

        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                result += Math.pow(2, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new ListNode(1));
        list.add(new ListNode(0));
        list.add(new ListNode(1));

        System.out.println(getDecimalValue(list.getHead()));
    }
}

/*
    ALTERNATIVE SOLUTION:
    sing the number 123 as an example, then from basic Math, we know this:

    1 is in the hundreds column so it’s value is 100
    2 is in the tens column so it’s value is 20
    3 is in the ones column so it’s value is just 3
    Let’s forget about binary for a second and focus on decimal counting since that’s what humans use. So, if we were to convert the string “123” to integer 123, we’ll go through each character one at a time.

    When we start with the first character, 1, we don’t really know it’s value is yet. i.e whether it’s in the millions or hundreds or thousands etc. But, we do know that if we encounter a character again, then it’s value has to go up by x10.

    So if we get 1, we assume it’s just 1. Then we encounter 2. At this point, we realize that the previous was is no longer just a 1 but (1 x 10). So we do that arithmetic and then add the current value. This is how is looks like in tabular form.

    Loop	Character	Operation	  Result
    1	    ‘1’	        1	          1
    2	    ‘2’	        (1x10) + 2	  12
    3	    ‘3’	        (12*10) + 3	  123
    Note: Operation is always the previous multiplied by the counting system. In this this, we're doing decimal so x10. If we were doing hex, it'll x16. Binary will be x 2.

    Using this logic, let’s come back to binary. It’s exactly the same except for instead of multiplying by 10 when we encounter the next digit, we multiply by 2. So If we have a LinkedList 1 -> 0 -> 1 and apply the same logic, this is how it'll be

    Loop	Character	Operation	  Result
    1	    ‘1’	        1	          1
    2	    ‘0’	        (1x2) + 0	  2
    3	    ‘1’	        (2*2) + 1	  5

    public int getDecimalValue(ListNode head) {
       int sum = 0;

        while (head != null){
            sum *= 2;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

    ALTERNATIVE SOLUTION:
    public int getDecimalValue(ListNode head) {
        int num = 0;                // Initialize num to 0
        while(head!=null) {         // Iterate over the linked list until head is null
            num <<= 1;              // Left shift num by 1 position to make way for next bit
            num += head.val;        // Add next bit to num at least significant position
            head = head.next;       // Update head
        }
        return num;
    }

    (10110)2 = (22)10 =>
    initially sum = 0
    steps:
    1. sum * 2 = sum ( or left shift)
    2. sum + 1 or 0 = sum
    then goes to step 1 and loops until head!=null
    ---------------------------------------
    left shift 1 =>  ( 0 * 2 ) =  0
    After sum    =>  0 + 1 = 1
    left shift 1 =>  ( 1 * 2 ) =  2
    After sum    =>  2 + 0 = 2
    left shift 1 =>  ( 2 * 2 ) =  4
    After sum    =>  4 + 1 = 5
    left shift 1 =>  ( 5 * 2 ) =  10
    After sum    =>  10 + 1 = 11
    left shift 1 =>  ( 11 * 2 ) =  22
    After sum    =>  22 + 0 = 22
*/