package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExValidCheck {

	public static void main(String[] args) {
		/// 수식이 주어졌다 치자 => exp 문자열
		//String exp = "(2+3)*4-(4-7)/2*3)";
		// java ch11.ExValidCheck (2+3)*4-(4-7)/2*3) 
		if(args.length != 1) {
			System.out.println("Usage: java ch11.ExValidCheck expression");
			System.out.println("Example: java ch11.ExValidCheck ((2+3)*2)+3");
			System.exit(0);
		}
		String exp = args[0];
		Stack st = new Stack();
		try {
			for(int i = 0; i < exp.length(); i++) {
				char ch = exp.charAt(i);
				if(ch=='('){
					st.push(ch);
				} else if(ch==')') {
					st.pop();
				}
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 마습니다");
			} else {
				System.out.println("괄호가 일치하지 않습나");
			}
		}catch(EmptyStackException e) {
			System.out.println("괄호가 맞지 않습니다");
		}
		/*
		 * exp 문자열의 첫 번째 문자부터 끝  번째 문자까지 다음을 수행
		 *   - 문자 '(' 이면 스택에 푸시
		 *   - 문자가 ')'이면 스택에서 pop <== 요기서 exception이 발
		 *      하는 경우도 괄호가 맞지 않는 경우이다. 
		 *   
		 * 위의 작업 수행 후 스택이 empty이면 괄호가 일치하는 것이다
		 * 그렇지 않으면 괄호가 일치하지 않는 것이며  
		 */
	}

}
