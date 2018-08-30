package ip;
/*
 * IP 주소와 서브넷 마스크를 입력 받아 네트워크 주소를 구하는 프로그램을
 * 작성하라.
 * 1. IP 주소는 키보드로부터 입력 받아라.
 * 2. 입력된 IP 주소의 유효성을 검사하라
 *    X.X.X.X, 0 <= X <= 255
 * 3. Subnet mask를 입력 받아라.
 * 4. 입력된 subnet mask의 유효성을 검사하라
 *    X.X.X.X, 0 <= X <= 255
 * 5. 입력된 IP 주소와 서브넷 마스크를 이용하여 네트워크 주소를 계산
 *    IP:     210.10.10.8
 *    Subnet: 255.255.255.0
 *    네트워크주소: 210.10.10.0
 * 6. 계산된 네트워크 주소를 정수형 멤버변수에 저장하라.
 * 7. 네트워크 주소를 X.X.X.X로 출력하는 메소드를 작성하라.
 *  
 *
 */

import java.util.Scanner;


class NetworkAddressCalculator {
   // 멤버변수
   String IPAdress;// IP 주소 : String
   String SubnetAdress;// Subnet 주소: String
   String NetworkAdSt;// 네트워크 주소: String
   int NetworkAdint;// 네트워크 주소:int
   
   
   int tempIP[] = new int[4];
   int tempSUB[] = new int[4];
   //int tempAll[] = new int[4];
   
   int ResultIP;
   int ResultSUB;
   // 멤버함수
   // IP 주소 입력
   Boolean getIPAddrFromKeyboard() {
      
      // 키보드로부터 IP주소를 입력받아
      Scanner scanner = new Scanner(System.in);
       System.out.println("IP 주소를 입력하시오.");
       IPAdress = scanner.nextLine();
      
      // 유효성을 검사 OK -> 입력받은 IP주소를 멤버변수에 저장
       
       return true;
   }
   
   Boolean getSubnetAddrFromKeyboard() {
      // 키보드로부터 Subnet 주소를 입력받아
      // 유효성을 검사 OK -> 입력 받은 Subnet주소를 멤버변수에 저장
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("서브넷 주소를 입력하시오.");
       SubnetAdress= scanner.nextLine();
       
  
       return true;
   }
   
   Boolean isValidIPAddr() {
     
      
      String list[] = IPAdress.split("[.]"); //"\\."
      
      String list2[] = SubnetAdress.split("[.]");
     int i=0;
      while(i<=4){
         for( i=0;i<4;i++){
         
           // argAddr IP 주소의 유효성 검사
             if ( Integer.valueOf(list[i])>=0 && 
                   Integer.valueOf(list[i])<=255 ) {
              
              tempIP[0]=Integer.valueOf(list[0]);
              tempIP[1]=Integer.valueOf(list[1]);
              tempIP[2]=Integer.valueOf(list[2]);
              tempIP[3]=Integer.valueOf(list[3]);
             }
              else{
                  System.out.println("잘못 쳤습니다.");
                  return false;
                   }
   
             }
       for( i=0;i<4;i++){ 
             //서브넷 유효성 검사 
             if ( Integer.parseInt(list2[i])>=0 && 
                   Integer.parseInt(list2[i])<=255 ) {
               
                tempSUB[0]=Integer.parseInt(list2[0]);
                tempSUB[1]=Integer.parseInt(list2[1]);
                tempSUB[2]=Integer.parseInt(list2[2]);
                tempSUB[3]=Integer.parseInt(list2[3]);
             }
             
            else{
              System.out.println("잘못 쳤습니다.");
                 return false;
            }
          }
       }
   }
   
   Boolean getNetworkAddr() {
      // IP주소와 Subnet 주소를 비트연산을 이용해
      // 네트워크 주소를 구하라.
      
      tempIP[0]<<=24;
      tempIP[1]<<=16;
      tempIP[2]<<=8;
      ResultIP= tempIP[0]+ tempIP[1]+ tempIP[2]+ tempIP[3];
      
      tempSUB[0]<<=24;
      tempSUB[1]<<=16;
      tempSUB[2]<<=8;
      
      ResultSUB= tempIP[0]+ tempIP[1]+ tempIP[2]+ tempIP[3];
      
      
      NetworkAdint=ResultIP & ResultSUB;

      return true;
   }
  void printNetAddr() {
      // 멤버변수 (네트워크 주소: int)를 비트연산을 이용하여
      // 아래와 같이 출력
      // 네트워크 주소 X.X.X.X
     int tempA=0;
     int tempB=0;
     int tempC=0;
     int tempD=0;
     
     tempA= NetworkAdint>>>24;
    
     
     tempB= NetworkAdint<<8; 
     tempB= tempB >>>24; 
      
     
     tempC= NetworkAdint<<16; 
     tempC= tempC >>>24;
     
     tempD= NetworkAdint<<24;   
     tempD= tempD >>>24;
    
      
      Integer.toString(tempA);
      Integer.toString(tempB);
      Integer.toString(tempC);
      Integer.toString(tempD);
     
      System.out.println("네트워크 주소: "+tempA+"."+tempB+"."+tempC+"."+tempD);
   
        }      
   }

public class ipAdress {
      public static void main(String args[]) {
         
         NetworkAddressCalculator val = new NetworkAddressCalculator();
       
         val.getIPAddrFromKeyboard();
         val.getSubnetAddrFromKeyboard();
         val.isValidIPAddr();
         val.getNetworkAddr();
         val.printNetAddr();
         
         }
      }