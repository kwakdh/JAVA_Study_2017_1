package rensu;

import java.util.Date;
import java.util.Scanner;

class SSNumberChecker {
   // Ű����κ��� �ֹε�Ϲ�ȣ�� �Է� �ް�,
   // 1. �Էµ� �ֹε�Ϲ�ȣ�� ��ȿ�� �˻� ���
   // 2. ������� ��� -> 1977�� 8�� 40��
   // 3. ���� : �ѱ� ����, �� ���� (��¥: Date)
   // 4. ����: ����, ����
   
   // ������� 
   String sSNumber;// �Է� ���� �ֹε�� ��ȣ
   short year,month,day;  // ������� year, month, day
   String  gender;   // ����
   short ageK; // ���� -> �ѱ�����, �� ����
   short ageM;
   
   // ��� �޼���
   // Ű����� ���� �Է�
   
   Boolean getValueFromKeyboard() {
      // Ű����κ��� ���ڿ��� �Է¹޾�, ������� sSNumber ����
	      Scanner scanner =new Scanner(System.in);
	      System.out.println("�ֹε�Ϲ�ȣ�� �Է��Ͻÿ�.");
	      String sSNumber= scanner.nextLine();
	      
	   // �ֹι�ȣ ������ Ʋ����� false �ݳ�
	      if (sSNumber.length()!=14) {
	    	  System.out.println("�߸� �ƽ��ϴ�.");
	          return false;
	      }

	   return true;
	   
      // ���̱��ϱ�, ����
   //   getAge();
      
   };
   
   // �ֹι�ȣ ��ȿ�� �˻�
  /* Boolean isValidSSNumber() { 
    //  ������� sSNumber�� ����� �ֹι�ȣ�� ��ȿ�� �˻�
   int check[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};  
   int totalHap=0;
   int temp=0;
   int result = 0;  //������ ���� �� �ִ� ���� 
   
   Scanner scanner = new Scanner(System.in); 
   sSNumber = scanner.nextLine().replace("-", "");
   
   for(int i=0 ; i<check.length ; i++){
	   totalHap=totalHap+((sSNumber.charAt(i)-48)*check[i]);
   }
   temp=11-(totalHap%11);
   result = temp%10; 
   if(result==Integer.parseInt(sSNumber.substring(13))){
	   System.out.println(sSNumber+"��ȿ�� �ֹι�ȣ �Դϴ�.");
	   return true;
   }
   else{
	   System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
       return false;
    }
  
   */
   // ���� 
  Boolean getAge() {
      //������� sSNumber�� ����� �ֹι�ȣ���� ���̸� ���ؼ�,
     // ������ ����
    /* Calendar ca=Calendar.getInstance();
     String today=Integer.toString(ca.get(Calendar.MONTH)+1)+
    		                Integer.toString(ca.get(Calendar.DATE));
     ageK= (short)(2017-Integer.parseInt(19+sSNumber.substring(0, 2)));
     int birth=Integer.parseInt(sSNumber.substring(2,6));*/
	  
	  //����
	  char ch=sSNumber.charAt(7);
	  if(ch=='1'||ch=='3'){
		  gender="����";
	  }
	  else if(ch=='2'|| ch=='4'){
		  gender="����";
	  }
	  //�׳� ����
	  String ymd=sSNumber.substring(0,2);
	  
	   ageM=(short)(Integer.parseInt(ymd));
     if(ch=='1'||ch=='2'){
    	 ageM=(short)(2017-(1900+ageM)+1);
     }
     else if(ch=='3'||ch=='4'){
    	 ageM=(short)(2017-(2000+ageM)+1);
     }
     
     //�������
     
    year=(short)((Integer.parseInt(ymd)));
   
    if(sSNumber.charAt(7)-48<3){
    	year=(short)(year+1900);
    }
    else year=(short)(year+2000);
    
  return true;
  }
   
 /*void prtInfo() {
       System.out.println("������� : "+year+"��"+sSNumber.(2,4)+"��"+
        sSNumber(4,6)+"���Դϴ�.");
        System.out.println("�׳� ���� : "+ageM);
       
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
















