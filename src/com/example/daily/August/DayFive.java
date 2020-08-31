package com.example.daily.August;

import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * @author Zzwen
 * @date 2020-8-14 17:18
 */
public class DayFive {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ci = s.charAt(i);
            if(ci=='('){
                stack.push(ci);
            }else if(ci =='['){
                stack.push(ci);
            }else if(ci=='{'){
                stack.push(ci);
            }else if(ci==')'){
                if(stack.empty()||stack.peek()!='('){
                    return false;
                }
                stack.pop();
            }else if(ci==']'){
                if(stack.empty()||stack.peek()!='['){
                    return false;
                }
                stack.pop();
            }else if(ci=='}'){
                if(stack.empty()||stack.peek()!='{'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty()&&stack.empty()&&stack.empty();
    }

}
