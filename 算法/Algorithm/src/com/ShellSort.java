public class ShellSort{

  /*
  Ï£¶ûÅÅĞò:
    ·Ö¼ä¸ô²åÈëÅÅĞò,

  */

  public static void main(String[] args){
    int[] a = {4, 9, 11, 3, 8, 6, 2, 7, 13, 1, 12, 5, 10};
    sort(a);
    print(a);

  }

  static void sort(int[] a){
    for (int gap = 4; gap > 0; gap /= 2) {
      for (int i = gap; i < a.length; i++) {
        for (int j = i; j > gap-1; j -= gap) {
          if (a[j] < a[j-gap]) {
            swap(a, j, j-gap);
            print(a);
            System.out.println();
          }
        }
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
