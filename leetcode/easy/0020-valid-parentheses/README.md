# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

Original
Java
 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 40.97%)  
**Memory:** 42.8 MB (beats 80.89%)  
**Submitted:** 2026-11-19T04:43:51.732Z  

```java
class Solution {
    public boolean isValid(String s) {
        if(s.length()% 2 != 0)
        return false;  
    
    Deque<Character>stack = new ArrayDeque<>();

    for(char c: s.toCharArray()){
        if(c=='('){
            stack.push(')');
        } else if (c=='{'){
            stack.push('}');
        } else if (c=='['){
            stack.push(']');
        } else{
            if(stack.isEmpty()|| stack.pop()!= c){
                return false;
            }
        }
         
    }
    return stack.isEmpty();
}
}

    

```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)