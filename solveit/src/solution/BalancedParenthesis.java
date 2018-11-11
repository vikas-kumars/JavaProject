package solution;

	import java.util.Scanner;
	import java.util.Stack;

	public class BalancedParenthesis {
		/*static class Stack{
			int top=-1;
			char items[]=new char[100];
			void push(char x) {
				if(top==99) {
					System.out.println("stack full");
				}else {
					items[++top]=x;
				}
			}
			char pop() {
				if(top==-1) {
					System.out.println("underflow error");
					return '\0';
				}else {
					char elements=items[top];
					top--;
					return elements;
				}
			}
			boolean isEmpty() {
				return (top==-1)?true:false;
			}
		}

		private static boolean areParenthesisBalanced(char[] exp) 
		{
			Stack st=new Stack();
			for(int i=0;i<exp.length;i++) 
			{
				if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
					st.push(exp[i]);
				if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
				{
					if(st.isEmpty()) 
					{
						return false;
					}
					else if(!isMatchingPair(st.pop(),exp[i]))
					{
						return false;
					}
				}
			}
			if(st.isEmpty()) {
				return true;
			}else {
				return false;
			}
			}
		private static boolean isMatchingPair(char character1, char character2) {
			if (character1 == '(' && character2 == ')')
				return true;
			else if (character1 == '{' && character2 == '}')
				return true;
			else if (character1 == '[' && character2 == ']')
				return true;
			else
				return false;
		}


		public static void main(String[] args) {
			char exp[] = {'{','(',')','}','[',']'};
			if (areParenthesisBalanced(exp))
				System.out.println("Balanced ");
			else
				System.out.println("Not Balanced "); 
		}
		 */
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.println(str+" "+isBalanced(str));
		}

		private static String isBalanced(String str) {
			if(str.isEmpty())
				return "Balanced";
			Stack<Character> st=new Stack<Character>();
			for(int i=0;i<str.length();i++) {
				char current=str.charAt(i);
				if(current=='[' || current=='{' || current=='(') {
					st.push(current);
				}
				if(current==']' || current=='}' || current==')') {
					if(st.isEmpty())
						return "Not Balanced";

					char last=st.peek();
					if(current==']'&& last=='['||current=='}'&& last=='{'|| current==')'&& last=='(')
						st.pop();
					else
						return "Not Balanced";
				}
			}
			return st.isEmpty()?"Balanced":"Not Balanced";
		}
		
	}




