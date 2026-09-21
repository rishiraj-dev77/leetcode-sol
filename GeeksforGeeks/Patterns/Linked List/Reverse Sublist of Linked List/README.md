# 📝 Reverse Sublist of Linked List (GeeksforGeeks)

🔗 [Problem Link](https://www.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1)

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Linked List

### 🚀 Performance
- **Runtime:** Successfully Evaluated
- **Memory:** N/A

---

### 📜 Problem Description

Given a  **singly linked list**  and two positions  **a**  and  **b** , reverse the nodes of the linked list from position a to b (1-indexed) and return the head of the modified linked list. The reversal must be done in-place without using extra space for another list.

**Examples:**

```
Input: a = 2, b = 4, head = 1->3->5->4->9->8->10->NULL
 
Output:

Explanation: Nodes from position 3 to 4 are reversed resulting in 1 4 5 3 9 8 10.
```

```
Input: a = 1, b = 8, head = 1->7->5->3->9->8->10->2->2->5->NULL

Output: 

Explanation: The nodes from position 1 to 8 are reversed, resulting in 2 10 8 9 3 5 7 1 2 5.
```

 **Constraints:** 1 ≤ size of linked list ≤ 10^51 ≤ a ≤ b ≤ size of linked list1 ≤ data of nodes ≤ 109