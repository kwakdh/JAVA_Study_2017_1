package rensu;

import java.util.Date;
import java.util.Scanner;

class SSNumberChecker {
   // 키보드로부터 주민등록번호를 입력 받고,
   // 1. 입력된 주민등록번호의 유효성 검사 기능
   // 2. 생년월일 출력 -> 1977년 8월 40일
   // 3. 나이 : 한국 나이, 만 나이 (날짜: Date)
   // 4. 성별: 남성, 여성
   
   // 멤버변수 
   String sSNumber;// 입력 받은 주민등록 번호
   short year,month,day;  // 생년월일 year, month, day
   String  gender;   // 성별
   short ageK; // 나이 -> 한국나이, 만 나이
   short ageM;
   
   // 멤버 메서드
   // 키보드로 부터 입력
   
   Boolean getValueFromKeyboard() {
      // 키보드로부터 문자열을 입력받아, 멤버변수 sSNumber 저장
	      Scanner scanner =new Scanner(System.in);
	      System.out.println("주민등록번호를 입력하시오.");
	      String sSNumber= scanner.nextLine();
	      
	   // 주민번호 포맷이 틀린경우 false 반납
	      if (sSNumber.length()!=14) {
	    	  System.out.println("잘못 쳤습니다.");
	          return false;
	      }

	   return true;
	   
      // 나이구하기, 성별
   //   getAge();
      
   };
   
   // 주민번호 유효성 검사
  /* Boolean isValidSSNumber() { 
    //  멤버변수 sSNumber에 저장된 주민번호의 유효성 검사
   int check[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};  
   int totalHap=0;
   int temp=0;
   int result = 0;  //곱셈한 수의 합 넣는 변수 
   
   Scanner scanner = new Scanner(System.in); 
   sSNumber = scanner.nextLine().replace("-", "");
   
   for(int i=0 ; i<check.length ; i++){
	   totalHap=totalHap+((sSNumber.charAt(i)-48)*check[i]);
   }
   temp=11-(totalHap%11);
   result = temp%10; 
   if(result==Integer.parseInt(sSNumber.substring(13))){
	   System.out.println(sSNumber+"유효한 주민번호 입니다.");
	   return true;
   }
   else{
	   System.out.println("잘못된 주민번호 입니다.");
       return false;
    }
  
   */
   // 나이 
  Boolean getAge() {
      //멤버변수 sSNumber에 저장된 주민번호에서 나이를 구해서,
     // 변수에 저장
    /* Calendar ca=Calendar.getInstance();
     String today=Integer.toString(ca.get(Calendar.MONTH)+1)+
    		                Integer.toString(ca.get(Calendar.DATE));
     ageK= (short)(2017-Integer.parseInt(19+sSNumber.substring(0, 2)));
     int birth=Integer.parseInt(sSNumber.substring(2,6));*/
	  
	  //성별
	  char ch=sSNumber.charAt(7);
	  if(ch=='1'||ch=='3'){
		  gender="남성";
	  }
	  else if(ch=='2'|| ch=='4'){
		  gender="여성";
	  }
	  //그냥 나이
	  String ymd=sSNumber.substring(0,2);
	  
	   ageM=(short)(Integer.parseInt(ymd));
     if(ch=='1'||ch=='2'){
    	 ageM=(short)(2017-(1900+ageM)+1);
     }
     else if(ch=='3'||ch=='4'){
    	 ageM=(short)(2017-(2000+ageM)+1);
     }
     
     //생년월일
     
    year=(short)((Integer.parseInt(ymd)));
   
    if(sSNumber.charAt(7)-48<3){
    	year=(short)(year+1900);
    }
    else year=(short)(year+2000);
    
  return true;
  }
   
 /*void prtInfo() {
       System.out.println("생년월일 : "+year+"년"+sSNumber.(2,4)+"월"+
        sSNumber(4,6)+"일입니다.");
        System.out.println("그냥 나이 : "+ageM);
       
   }*/
   

public class exam1 {
   public static void main(String args[]) {
	   
   
      SSNumberChecker val = new SSNumberChecker();
      
      val.getValueFromKeyboard();
     //val.isValidSSNumber();
      val.getAge();
      //     val.prtInfo();         
   }
}
















