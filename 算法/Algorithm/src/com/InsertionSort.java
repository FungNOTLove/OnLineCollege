public class InsertionSort{

  /*
  插入排序:
    依次与前面的数比较,如果其值小于前面的值,则交换,
    直到该数之前的数都小于该数
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
