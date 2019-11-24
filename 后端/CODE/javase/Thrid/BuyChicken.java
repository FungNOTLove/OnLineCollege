public class BuyChicken{
//°ÙÇ®Âò°Ù¼¦
  public static void main(String[] args){

    for (int i = 0; i <= 20; i++) {
      for (int j = 0; i <= 33; j++) {
        for (int k = 0; k <= 300; k++) {
          if (((i+j+k)==100) && ((5*i+3*j+k/3)==100)) {
            System.out.println("i=" + i + "\tj=" + j + "\tk=" + k);
          }
        }
      }
    }
  }
}
