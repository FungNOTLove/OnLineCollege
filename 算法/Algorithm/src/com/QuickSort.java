public class QuickSort{

  /*
    先找一个pivot(轴心点),一般选最左或者最右的那个数
    然后左边和右边同时向中间遍历
    ......


  */

  public static void main(String[] args){
    int[] a = {7, 3, 2, 8, 1, 9, 5, 4, 6, 0};
    sort(a, 0, a.length-1);
    print(a);

  }

  static void sort(int[] a, int leftBound, int rightBound){
    if (leftBound >= rightBound) return ;
    int mid = partition(a, leftBound, rightBound);
    sort(a, leftBound, mid - 1);
    sort(a, mid + 1, rightBound);
  }

  static int partition(int[] a, int leftBound, int rightBound){
    int pivot = a[rightBound];
    int left = leftBound;
    int right = rightBound - 1;

    while(left <= right){
      while(left <= right && a[left] <= pivot) left++;
      while(left <= right && a[right] >= pivot) right--;

      if(left < right) swap(a, left, right);
    }
    swap(a, left, rightBound);
    return left;
  }

  static void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static void print(int[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] +" ");
    }
  }

}
