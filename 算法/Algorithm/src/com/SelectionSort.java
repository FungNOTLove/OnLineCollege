public class SelectionSort{

  /*
  选择排序：
    从左到右,依次对比,有没有比第一位小的数,如果有,交换
    
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
