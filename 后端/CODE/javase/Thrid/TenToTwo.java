import java.util.Scanner;
//ʮ����ת��Ϊ������
/*
˼·:
  �����ʮ����������ƹ�ϵ
  ͨ��֮��Ĺ�ϵ��д����
  15%2=1
  str = '1';
  15/2=7
  7%2=1
  str="11"
  7/2=3
  3%2=1
  str="111"
  3/2=1
  1%2=1
  str="1111"
*/
public class TenToTwo{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("������һ��ʮ������: ");
    int number = sc.nextInt();
    String str = "";

    while(number != 0){
      int i = number % 2;
      System.out.println(i);
      str = str + i;
      System.out.println(str);
      number = number/2;
    }
    System.out.println(str);

  }
}
