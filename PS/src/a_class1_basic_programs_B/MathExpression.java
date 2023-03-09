package a_class1_basic_programs_B;


	
	

	import java.util.Stack;

	public class MathExpression {
		public static int equationResult(String expression){
			char[] tokens = expression.toCharArray();

			Stack<Integer> values = new Stack<Integer>();
			Stack<Character> op = new Stack<Character>();

			for (int i = 0; i < tokens.length; i++)
			{
				if (tokens[i] == ' ')
				{
					continue;
				}
				if (tokens[i] >= '0' && tokens[i] <= '9') 
				{
					StringBuffer sbuf = new StringBuffer();
					while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
					{
						sbuf.append(tokens[i++]);
					}
					values.push(Integer.parseInt(sbuf.toString()));

					i--;
				}
				else if (tokens[i] == '(')
				{ 
					op.push(tokens[i]);
				}
				else if (tokens[i] == ')')
				{
					while (op.peek() != '(')
					{
						values.push(result(op.pop(),values.pop(),values.pop()));
					}
					op.pop();
				}
				else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/')
				{
					while (!op.empty() && operatorOrder(tokens[i],op.peek())) 
					{
						values.push(result(op.pop(),values.pop(),values.pop()));
					}
					op.push(tokens[i]);
				}
			}
			while (!op.empty())
			{
				values.push(result(op.pop(),values.pop(),values.pop()));
			}
			return values.pop();
		}
		public static boolean operatorOrder(char op1, char op2)
		{
			if (op2 == '(' || op2 == ')')
			{
				return false;
			}
			if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-') )
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		public static int result(char op,int b, int a)
		{
			switch (op)
			{
			case '+': return a + b;
			case '-': return a - b;
			case '*': return a * b;
			case '/': return a / b;
			}
			return 0;
		}
		public static void main(String[] args) 
		{
			System.out.println(MathExpression.equationResult("10+20*2"));
			System.out.println(MathExpression.equationResult(" 6 / 3 - 1 "));
		}
	}