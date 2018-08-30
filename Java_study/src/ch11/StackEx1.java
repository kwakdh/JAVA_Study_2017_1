package ch11;

import java.util.Stack;

public class StackEx1 {
	private static Stack back = new Stack();
	private static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("1. 네이트");
		goURL("2. 야후");
		goURL("3. 네이버");
		goURL("4. 다음");		
		printStatus();
		
		System.out.println("뒤로가비 버튼을 누른 후");
		goBack();
		printStatus();
		
		System.out.println("뒤로가비 버튼을 누른 후");
		goBack();
		printStatus();
		
		System.out.println("앞으로가기 버튼을 누른 후");
		goForward();
		printStatus();
		
		System.out.println("앞으로가기 버튼을 누른 후");
		goForward();
		printStatus();
		
		System.out.println("새로운 주소로 이동");
		goURL("5. codechobo.com");
		printStatus();
		

	}
	/* 주소줄에 URL 입력해서 이동 */
	public static void goURL(String url) {
		back.push(url);
		// forward stack 비운다. 
		if(forward.isEmpty() != false)
			forward.clear();
	}
	
	/* forward 화살표 클릭 */
	public static void goForward() {
		// forward 스택에서 pop을 해가
		// 그 놈을 back 스텍에 push
		if(forward.isEmpty()==false) {
			back.push(forward.pop());
		}	
	}
	
	/* backward 화살표 클릭 */
	public static void goBack() {
		if(back.isEmpty()==false) {
			forward.push(back.pop());
		}
	}
	
	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면은:"+ back.peek() + "입니다.");	
		System.out.println();
	}

}
