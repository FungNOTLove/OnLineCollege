import java.util.Scanner;

/*
��֧�ṹ
  ����֧�ṹ:
    ֻ����һ�������ж�, �������, ��ĳЩ����
  ˫��֧�ṹ:
    �ɽ��ж���������ж�, ÿ��ƥ�������ѡ��ͬ��ִ�н��
  Ƕ�׷�֧�ṹ:
    �ڷ�֧�ṹ��Ƕ�׷�֧�ṹ
  switch��֧�ṹ:
    һ��������ֵ�ж�
*/
public class IfDemo{

  public static void main(String[] args){

    //����֧�ж�, Math.random()�������ݵķ�Χ��[0,1)
    //�õ�0-5֮��������
    int i = (int)(Math.random()*6);
    if (i>3) {
     System.out.println("ֵ����3");
    }
    System.out.println("number:"+i);
  }
}
