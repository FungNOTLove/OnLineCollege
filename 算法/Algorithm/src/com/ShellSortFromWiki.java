public class ShellSortFromWiki{
  public static void main(String[] args){
    int[] a = {4, 9, 11, 3, 8, 6, 2, 7, 13, 1, 12, 5, 10};
    shellSort(a);
    print(a);
  }

  public static void shellSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
                print(arr);
                System.out.println();
            }
        }
    }

    static void print(int[] a){
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
      }
    }

}
