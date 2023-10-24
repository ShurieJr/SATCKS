public class Main {
    public static void main(String[] args) {
        int[] numbers ={3,5 ,3 , 4};
        int[] result = twoSum(numbers , 6);
        System.out.println(result[0] + " , " + result[1] );

        //problem two
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
    }
    //problem 1: two sum
    public static int[] twoSum(int[] nums, int target) {
        int[] index =new int[2];
        for(int i=0; i<nums.length; i++){
         for(int j =i+1; j < nums.length; j++){
             if(nums[i] + nums[j] == target) {
                 index[0] = i;
                 index[1] = j;
             }
         }
        }
        return index;
    }

    //problem 2:  Add Two Numbers
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return l1;
    }
}