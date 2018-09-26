public class ArrayDemo {
  public static void printArray(int[]ary){
    System.out.print("[");
    for (int i=0; i<ary.length; i++) {
      if (i == ary.length - 1) {
        System.out.print("" + ary[i]);
      } else {
        System.out.print("" + ary[i] + ",");
      }
    }
    System.out.println("]");
  }

  public static void printArray(int[][]ary){
    System.out.print("[");
    for (int i=0; i < ary.length; i++) {
      System.out.print("[");
      for (int j=0; j<ary[i].length; j++) {
        if (j == ary[i].length - 1) {
          System.out.print("" + ary[i][j]);
        } else {
          System.out.print("" + ary[i][j] + ",");
        }
      }
      System.out.print("]");
      if (i != ary.length - 1) {
        System.out.print(",");
      }
    }
    System.out.println("]");
  }

  // public static int countZeros2D(int[][] nums){
  //   return null;
  // }
  //
  // public static void fill2D(int[][] vals){
  //   return null;
  // }
  //
  // public static int[][] fill2DCopy(int[][] vals){
  //
  // }

  public static void main(String[]args) {
    int[] anArray = {1, 2, 3};
    int[][] multi = {{1,2,3}, {4,5,6}, {7,8,9}};

    printArray(anArray);
    printArray(multi);
  }
}
