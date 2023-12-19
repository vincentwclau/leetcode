public class L83 {

  public static class ListNode {
    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("ListNode[");
      ListNode curNode = this;
      while (curNode != null) {
        sb.append(curNode.val);
        if (curNode.next != null)
          sb.append(", ");
        curNode = curNode.next;
      }
      return sb.append("]").toString();
    }
  }

  public ListNode deleteDuplicates(ListNode head) {
    ListNode node = head;
    ListNode temp = null;
    while (node != null) {
      temp = node;
      while (temp.next != null && node.val == temp.next.val) {
        temp = temp.next;
      }
      node.next = temp.next;
      node = node.next;
    }
    return head;
  }

  public static void main(String[] args) {
    L83 solution = new L83();
    ListNode case1 = new ListNode(1, new ListNode(1, new ListNode(2, null)));
    System.out.println(solution.deleteDuplicates(case1));

    ListNode case2 = new ListNode(1, new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(3, null)))));
    System.out.println(solution.deleteDuplicates(case2));

    ListNode case3 = new ListNode(1, new ListNode(1, new ListNode(1, null)));
    System.out.println(solution.deleteDuplicates(case3));
  }

}
