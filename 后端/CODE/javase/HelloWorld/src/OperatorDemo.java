
/*
�������
	���������:  +��-��*��/��%��++��--

	��ֵ����� =
		java��=��ʾ��ֵ�������==��ʾ��ȵĲ���
	��չ��ֵ�����:+=��-=��*=��/=

	��ϵ�����:  >��<��>=��<=��==��!=
		�����Ƚ���ֵ�Ĺ�ϵ��
	�߼������:  &&��||��!
		�߼������һ�����ߵ�ֵ���Ǿ����ֵ�����Ǳ��ʽ
	λ�����:  &��|��^��~ �� >>��<<��>>> (�˽⣡����)
	��������� ����

*/

public class OperatorDemo{

  public static void main(String[] args){
    int a = 1;
    int b = 2;

    //���������
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    //ȡ����,����ȡ��
    System.out.println(a/b);
    //ȡ����,����ȡģ
    System.out.println(a%b);

    //��Ŀ�����
    //++,��ʾ�ڱ���ԭ�еĻ�����+1, ˭��ǰ,������˭
    System.out.println(a++);
    System.out.println(++a);
    //--,��ʾ�ڱ���ԭ�еĻ�����-1, ˭��ǰ,������˭
    System.out.println(a--);
    System.out.println(--a);

    //6
    //System.out.println(++b+b--);
    //6
    System.out.println(++b+b++);
    //6
    //System.out.println(++b+b)
    //4
    System.out.println(b);

    //��չֵ�����
    int c = 1;
    //��д��һ��,��ʾ��2�Ļ�������
    c = c + 2;
    c += 3;
    //����ת������, d��byte, d+1������int����, ��Ҫ��int���͵�ֵת��Ϊbyte,
    //���о�����ʧ,�����Ҫǿ��ת��
    //�����ڽ��в�����ʱ��ʹ������ֵ�����
    byte d = 10;
    //d = d + 1;
    d += 1;

    //��ϵ�����:���ص�ֵ�ǲ���ֵ, Ҳ����˵ֻ��true �� false�������
    System.out.println(1>2);
    System.out.println(1<2);
    System.out.println(1>=2);
    System.out.println(1<=2);
    System.out.println(1==2);
    System.out.println(1!=2);
    System.out.println("------");

    //�߼������
    /*
    &&:��ʾ��·��, ���߱��ʽֻҪ��һ����false, ����������false
        ���߱��ʽ�������ҿ�ʼ�Ա�,�����ߵı��ʽ��false,�ұ߾Ͳ���Ҫ�����ж�
    ||:��ʾ��·��, ���߱��ʽ��ֻҪ��һ����true, ����������true
        ���߱��ʽ�������ҿ�ʼ�Ա�, �����ߵı��ʽ��true,�ұ߾Ͳ���Ҫ�ж�
    ! :ȡ��,�����true,ȡ����false,�����false,ȡ������true
    & :�������, �������߶����������
    | :�������, �����������������

    */
    System.out.println(3>5 & 3<4);
    System.out.println(3>5 | 3<4);
    System.out.println(!true);
    System.out.println(!false);

    //λ�����: ֻ�ܲ�����ֵ, ������ʱ���ת�ɶ����ƽ�������
    System.out.println(4 & 5);
    System.out.println(4 | 5);
    System.out.println(4 ^ 5);

    //����, ����, ԭ��, ���� ????
    System.out.println(~4);
    //���Ʊ�ʾ����2, ���Ʊ�ʾ����2
    System.out.println(2<<3);
    System.out.println(16>>2);

    //���������������Ŀ�����
    //ʹ�õ�ʱ����Ҫ��һ�����ʽ, ���ʽ�����true , �򷵻� ? ����Ľ��
    //�����false, �򷵻� : ����Ľ��
    System.out.println(3>2?3:2);
    //false
    System.out.println(false?false:true?false:true);
    //false
    System.out.println(true?false:true?false:true);


    /*

    ������������֮���ת��
      �Զ�ת��(����ת��):
      ǿ��ת��

      ע��:
        1.�ڽ����������������ʱ��, ����Ҫ����������һ��,�����޷�����
        2.�����������, �������ֵ�����Ͳ�һ��, ���Զ���С������ת��Ϊ�������
        3.�����������, �����ֶ�ǿ��ת��, ���������ת��ΪС������
          ʵ�ַ�ʽ, (datetype)
        4.ǿ��ת��, �ᷢ��������ʧ, ������ܲ�׼ȷ

    */
    byte bb = 10;
    int aa = 200;
    byte cc;
    cc = (byte)(aa+bb);
    //-46
    System.out.println(cc);
    /*
    210
    ԭ��: