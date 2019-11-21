public class MergeSort{

  public static void main(String[] args){
    int[] a = {1,4,7,8,3,6,9};
    sort(a, 0, a.length-1);
    print(a);

  }

  static void sort(int[] a, int left, int right){
    if (left == right) return ;
    //∑÷≥…¡Ω∞Î
    int mid = left + (right - left)/2;
    //◊Û±ﬂ≈≈–Ú
    sort(a, left, mid);
    //”“±ﬂ≈≈–Ú
    sort(a, mid+1, right);

    merge(a, left, mid+1, right);
  }

  static void merge(int[] a, int leftPtr, int rightPtr, int rightBound){
    int mid = rightPtr - 1;
    int[] temp = new int[rightBound - leftPtr + 1];

    int i = leftPtr;
    int j = rightPtr;
    int k = 0;

    while (i <= mid && j <= rightBound) {
      temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];

      // if (a[i] <= a[j]) {
      //   temp[k] = a[i];
      //   k++;
      //   i++;
      // }else{
      //   temp[k] = a[j];
      //   k++;
      //   j++;
      //
      // }

    }
    while(i <= mid) temp[k++] = a[i++];
    while(j <= rightBound) temp[k++] = a[j++];

    for (int m = 0; m < temp.length; m++) {
      a[leftPtr + m] = temp[m];
    }
  }

  static void print(int[] a){
    for (int i=0; i <a.length; i++) {
      System.out.print(a[i] + " ");
    }

  }
}
