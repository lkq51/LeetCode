package AddTwoNumbers;

/**
 * Created by lkq on 2017/1/18.
 */
public class AddTwoNumbers {
        public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(3);
            l1.next.next = new ListNode(3);

            ListNode l2 = new ListNode(9);
            l2.next = new ListNode(7);


            AddTwoNumbers add = new AddTwoNumbers();
            ListNode l3 = add.addTwoNumbers(l1, l2);
            for (;l3!=null;){
                System.out.print(l3.val);
                l3 = l3.next;
            }
        }



        public ListNode addTwoNumbers(ListNode l1, ListNode l2){
            ListNode l3 = new ListNode(0);
            l3 = add(l1, l2, l3);
            return l3;
        }

        private ListNode add(ListNode l1,ListNode l2, ListNode l3){
            int sum = l1.val + l2.val + l3.val;
            l3.val = sum % 10;
            l3.next = new ListNode(sum/ 10);
            if(l1.next!= null&&l2.next!= null){
                l3.next = add(l1.next, l2.next, l3.next);
            }else if(l2.next == null && l1.next != null){
                l3.next.val = l3.next.val + l1.next.val;
            }else if(l1.next == null && l2.next != null) {
                l3.next.val = l3.next.val + l2.next.val;
            }
            return l3;
        }

        public void getNext(ListNode l){
            System.out.println(l.next.val);
        }


        /*
        * 网站上给出的做法
        */
       /* public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;
        }*/
}
