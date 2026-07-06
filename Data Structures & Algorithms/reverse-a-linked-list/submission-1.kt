/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {

        var prev: ListNode? = null
        var curr = head

        while (curr != null) {
            val tempNext = curr.next
            curr.next = prev
            prev = curr
            curr = tempNext
        }
        return prev

    }
}
