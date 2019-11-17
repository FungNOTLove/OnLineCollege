public class BubbleSort{

  //冒泡排序
  //  找到最大的排到最后

  public static void main(String[] args){

    int[] a = {6, 3, 2, 9, 7, 4, 1, 8, 5, 0};
    //sort(a);
    sortComplex(a);
    print(a);
  }

  static void sort(int[] a){
    for (int i=0; i<a.length; i++) {
      for (int j=0; j<a.length-1; j++) {
        if (a[j] > a[j+1]) {
          swap(a, j, j+1);
        }
      }
    }
  }

  static void sortComplex(int[] a){
    for (int i=a.length-1; i>0; i--) {
      findMax(a, i);
    }
  }

  static void findMax(int[] a,int n){
    for (int j=0; j<n; j++) {
      if (a[j] > a[j+1]) {
        swap(a, j, j+1);
      }
    }
  }

  static void swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
  static void print(int[] a){
    for (int i=0; i<a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }

}
