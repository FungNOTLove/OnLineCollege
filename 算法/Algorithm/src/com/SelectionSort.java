public class SelectionSort{

  /*
  选择排序：
    遍历数组,寻找比第一位数字小的数,
    如果有,交换位置,继续往下遍历,直到没有比该数小的数为止;
    接下来寻找比第二个数小的数字......

  */
  public static void main(String[] args){

    int[] arr = {4, 7, 3, 5, 9, 8, 1, 2, 0, 6};
    sort(arr);
    print(arr);
  }

  public static void sort(int[] arr){
    for (int i=0; i<arr.length -1; i++) {
      int minPos = i;

      for (int j=i+1; j<arr.length; j++) {
        minPos = arr[j] < arr[minPos] ? j : minPos;
      }
      swap(arr, i, minPos);
    }
  }


  static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void print(int[] arr){
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
