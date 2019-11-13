/*
数据类型
  Java是一种强类型语言
    强类型表示,变量在定义的时候必须显示的声明类型是什么    java
    弱类型表示,变量会根据值自己去推断,不需要指定类型是什么  js,python,scala
  java数据类型
    基本数据类型(4类8种)
      整数类型:byte short int long(不同类型表示不同的长度)
      byte: 使用一个字节存储,因此范围是  -128-127
      short:使用两个字节存储,因此范围是  -32768-32767
      int : 使用四个字节存储,因此范围是  正负21亿
      lnog: 使用八个字节存储,因此范围是  ......
      注意:
        1.在使用整型类型的时候,默认都是Int类型
        2.如果需要使用long类型的话,必须在数字的后面添加L,建议使用大写,
        小写容易与数字1混淆.
      浮点类型: float double 小数类型:使用小数点 使用科学计数法
        float: 单精度,精度可以精确到小数点后七位
        double:双精度,精度是float的双倍
        注意:
          1.默认浮点类型是double类型
          2.使用float的时候,数字后要添加f
          3.浮点类型并不能表示一个精确的值,会损失一定的精度

      字符类型:char
        占用两个字节,使用的时候用''表示
      布尔类型:Boolean
        只有true和false两值,在存储的时候占一位

    引用数据类型:
      类
      接口
      数组
*/

public class DataTypeDemo{

  public static void main(String[] args){
        //byte b = 128;
        //short s = 44444;
        //int i = 11111111111;
        // long l = 1213123123123123L;

        float f1 = 2.1223123234123121F;
        float f2 = 2.12231232787878F;
        System.out.println(f1==f2);

        //表示一个字符
        char a = 'A';
        //表示一个字符串,表示一个字符序列
        String s = "A";
        System.out.println(a==65);
        char ch = '\t';
        System.out.println("["+ch+"]");

  }
}
