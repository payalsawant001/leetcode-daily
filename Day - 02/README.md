# Add Two Numbers (LeetCode #2)

## 📌 Problem Statement
You are given two non-empty linked lists representing two non-negative integers.  
The digits are stored in **reverse order**, and each node contains a single digit.  

Your task is to **add the two numbers** and return the result as a linked list.

👉 You may assume the two numbers do not contain any leading zero, except the number `0` itself.

---

## 💡 Examples

### Example 1
**Input:**  
`l1 = [2,4,3]`, `l2 = [5,6,4]`  
**Output:**  
`[7,0,8]`  
**Explanation:** 342 + 465 = 807  

---

### Example 2
**Input:**  
`l1 = [0]`, `l2 = [0]`  
**Output:**  
`[0]`  

---

### Example 3
**Input:**  
`l1 = [9,9,9,9,9,9,9]`, `l2 = [9,9,9,9]`  
**Output:**  
`[8,9,9,9,0,0,0,1]`  

---

## ✅ Constraints
- The number of nodes in each linked list is in the range **[1, 100]**  
- `0 <= Node.val <= 9`  
- It is guaranteed that the list represents a number without leading zeros  

---

## 🛠️ Approach
1. Traverse both linked lists simultaneously.  
2. At each step:
   - Add corresponding digits along with any carry from the previous step.  
   - Create a new node for the resulting digit (`sum % 10`).  
   - Carry forward (`sum / 10`) if the sum is greater than 9.  
3. Continue until both lists and the carry are fully processed.  

Time Complexity: **O(max(m, n))** where `m` and `n` are the lengths of the two lists.  
Space Complexity: **O(max(m, n))** for the result linked list.  

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/add-two-numbers.git
   cd add-two-numbers
