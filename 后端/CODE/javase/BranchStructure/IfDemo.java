import java.util.Scanner;

/*
分支结构
  单分支结构:
    只做单一条件的判断, 如果符合, 做某些事情
  双分支结构:
    可进行多个条件的判断, 每个匹配项可以选择不同的执行结果
  嵌套分支结构:
    在分支结构中嵌套分支结构
  switch分支结构:
    一般用作等值判断
*/
public class IfDemo{

  public static void main(String[] args){

    //单分支判断, Math.random()产生数据的范围是[0,1)
    //得到0-5之间的随机数
    int i = (int)(Math.random()*6);
    if (i>3) {
     System.out.println("值大于3");
    }
    System.out.println("number:"+i);
  }
}
