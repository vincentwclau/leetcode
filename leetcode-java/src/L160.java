public class L160 {

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }

    ListNode(int x, ListNode next) {
      val = x;
      this.next = next;
    }
  }

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null)
      return null;

    ListNode a = headA;
    ListNode b = headB;

    while (a != b) {
      if (a.next == null && b.next == null)
        return null;
      a = a.next == null ? headB : a.next;
      b = b.next == null ? headA : b.next;
    }
    return a;
  }

  public static void main(String[] args) {
    L160 s = new L160();
    ListNode intersecthead = new ListNode(8, new ListNode(4, new ListNode(5)));
    ListNode headA = new ListNode(4, new ListNode(1, intersecthead));
    ListNode headB =
        new ListNode(5, new ListNode(6, new ListNode(1, intersecthead)));

    System.out.println(s.getIntersectionNode(headA, headB).val);

    ListNode intersecthead2 = new ListNode(8, new ListNode(4, new ListNode(5)));
    ListNode headA2 = new ListNode(4, new ListNode(1, null));
    ListNode headB2 = new ListNode(5, new ListNode(6, new ListNode(1, null)));

    System.out.println(s.getIntersectionNode(headA2, headB2));
  }

}
