public class InsertionSort{

  /*
  插入排序:
    依次取出一个数,插入到该数之前的数中
    依次向前比较,如果比前面的数小,
      则交换,继续与前面的数比较,直到比前面的数大为止.
    如下面的数组,将3插入到前面排好的数组中
      先与11比较,小于11,交换;
      再与9比较,小于9,交换;
      再与4比较,小于4,交换;
    这样将后面的数插入到前面已经排序好的数组中,就叫做插入排序;
  */

  public static void main(String[] args){

    int[] a = {4, 9, 11, 3, 8, 6, 2, 7, 13, 1, 12, 5, 10};
    sort(a);
    print(a);

  }

  static void sort(int[] a){
    for (int i = 1; i < a.length; i++) {
      for (int j = i; j > 0 && a[j] < a[j-1]; j--) {
        //if (a[j] < a[j - 1])
          swap(a, j, j-1);
          print(a);
          System.out.println();
      }
    }
  }

  static void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static void print(int[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
