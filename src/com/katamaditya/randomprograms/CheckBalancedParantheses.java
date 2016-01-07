/**
 * 
 */
package com.katamaditya.randomprograms;

import com.katamaditya.Stack.Stack;

/**
 * 
 * Program to check for balanced parentheses in an expression using stack. Given
 * an expression as string comprising of opening and closing characters of
 * parentheses - (), curly braces - {} and square brackets - [], we need to
 * check whether symbols are balanced or not. First closing bracket should match
 * last unclosed bracket.
 * 
 * @author VeeraSivaSriAditya
 */
public class CheckBalancedParantheses {

	public static boolean checkForBalancing(String string) {
		char c;
		Stack stack = new Stack();
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty() || !arePair(((char) stack.peek()), c)) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkForBalancing("{}"));
		System.out.println(checkForBalancing("{"));
		System.out.println(checkForBalancing("{()}"));
		System.out.println(checkForBalancing("{(})"));
		System.out.println(checkForBalancing("(){}[]"));
	}

	private static boolean arePair(char start, char end) {

		if (start == '(' && end == ')')
			return true;
		else if (start == '{' && end == '}')
			return true;
		else if (start == '[' && end == ']')
			return true;
		return false;
	}
}
