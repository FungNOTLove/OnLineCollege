import java.util.Scanner;
public class Fibonacci{


   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("���������ӡ��쳲��������ĸ���:");
     int count = sc.nextInt();

     int x = 1;
     int y = 1;
     int z = 0;

     for (int i = 1; i <= count; i++) {
       if (i ==1 || i ==2) {
         System.out.print(1 + "\t");
       }else{
         z = x + y;
         x = y;
         y = z;
         System.out.print(z + "\t");
       }
     }
   }
}
