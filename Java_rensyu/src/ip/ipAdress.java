package ip;
/*
 * IP �ּҿ� ����� ����ũ�� �Է� �޾� ��Ʈ��ũ �ּҸ� ���ϴ� ���α׷���
 * �ۼ��϶�.
 * 1. IP �ּҴ� Ű����κ��� �Է� �޾ƶ�.
 * 2. �Էµ� IP �ּ��� ��ȿ���� �˻��϶�
 *    X.X.X.X, 0 <= X <= 255
 * 3. Subnet mask�� �Է� �޾ƶ�.
 * 4. �Էµ� subnet mask�� ��ȿ���� �˻��϶�
 *    X.X.X.X, 0 <= X <= 255
 * 5. �Էµ� IP �ּҿ� ����� ����ũ�� �̿��Ͽ� ��Ʈ��ũ �ּҸ� ���
 *    IP:     210.10.10.8
 *    Subnet: 255.255.255.0
 *    ��Ʈ��ũ�ּ�: 210.10.10.0
 * 6. ���� ��Ʈ��ũ �ּҸ� ������ ��������� �����϶�.
 * 7. ��Ʈ��ũ �ּҸ� X.X.X.X�� ����ϴ� �޼ҵ带 �ۼ��϶�.
 *  
 *
 */

import java.util.Scanner;


class NetworkAddressCalculator {
   // �������
   String IPAdress;// IP �ּ� : String
   String SubnetAdress;// Subnet �ּ�: String
   String NetworkAdSt;// ��Ʈ��ũ �ּ�: String
   int NetworkAdint;// ��Ʈ��ũ �ּ�:int
   
   
   int tempIP[] = new int[4];
   int tempSUB[] = new int[4];
   //int tempAll[] = new int[4];
   
   int ResultIP;
   int ResultSUB;
   // ����Լ�
   // IP �ּ� �Է�
   Boolean getIPAddrFromKeyboard() {
      
      // Ű����κ��� IP�ּҸ� �Է¹޾�
      Scanner scanner = new Scanner(System.in);
       System.out.println("IP �ּҸ� �Է��Ͻÿ�.");
       IPAdress = scanner.nextLine();
      
      // ��ȿ���� �˻� OK -> �Է¹��� IP�ּҸ� ��������� ����
       
       return true;
   }
   
   Boolean getSubnetAddrFromKeyboard() {
      // Ű����κ��� Subnet �ּҸ� �Է¹޾�
      // ��ȿ���� �˻� OK -> �Է� ���� Subnet�ּҸ� ��������� ����
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("����� �ּҸ� �Է��Ͻÿ�.");
       SubnetAdress= scanner.nextLine();
       
  
       return true;
   }
   
   Boolean isValidIPAddr() {
     
      
      String list[] = IPAdress.split("[.]"); //"\\."
      
      String list2[] = SubnetAdress.split("[.]");
     int i=0;
      while(i<=4){
         for( i=0;i<4;i++){
         
           // argAddr IP �ּ��� ��ȿ�� �˻�
             if ( Integer.valueOf(list[i])>=0 && 
                   Integer.valueOf(list[i])<=255 ) {
              
              tempIP[0]=Integer.valueOf(list[0]);
              tempIP[1]=Integer.valueOf(list[1]);
              tempIP[2]=Integer.valueOf(list[2]);
              tempIP[3]=Integer.valueOf(list[3]);
             }
              else{
                  System.out.println("�߸� �ƽ��ϴ�.");
                  return false;
                   }
   
             }
       for( i=0;i<4;i++){ 
             //����� ��ȿ�� �˻� 
             if ( Integer.parseInt(list2[i])>=0 && 
                   Integer.parseInt(list2[i])<=255 ) {
               
                tempSUB[0]=Integer.parseInt(list2[0]);
                tempSUB[1]=Integer.parseInt(list2[1]);
                tempSUB[2]=Integer.parseInt(list2[2]);
                tempSUB[3]=Integer.parseInt(list2[3]);
             }
             
            else{
              System.out.println("�߸� �ƽ��ϴ�.");
                 return false;
            }
          }
       }
   }
   
   Boolean getNetworkAddr() {
      // IP�ּҿ� Subnet �ּҸ� ��Ʈ������ �̿���
      // ��Ʈ��ũ �ּҸ� ���϶�.
      
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
      // ������� (��Ʈ��ũ �ּ�: int)�� ��Ʈ������ �̿��Ͽ�
      // �Ʒ��� ���� ���
      // ��Ʈ��ũ �ּ� X.X.X.X
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
     
      System.out.println("��Ʈ��ũ �ּ�: "+tempA+"."+tempB+"."+tempC+"."+tempD);
   
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