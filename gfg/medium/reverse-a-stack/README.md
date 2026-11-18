# Reverse a Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a stack  **st[]**, reverse the order of its elements.

 **Note:** The input array represents the stack from bottom to top, where the last element is the top. The output should display the elements from top to bottom after reversing the stack.

 **Examples:** 

```
Input: st[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: After reversing, the elements of stack are in opposite order.

```

```
Input: st[] = [3, 2, 1]
Output: [3, 2, 1]
Explanation: After reversing, the elements of stack are in opposite order.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T22:31:30.870Z  

```java
import java.util.Stack;

class Solution {
    static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, x);
        s.push(top);
    }

    static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        insertAtBottom(s, top);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-stack/1)