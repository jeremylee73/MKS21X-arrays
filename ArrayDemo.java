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

  public static int countZeros2D(int[][] nums){
    int ans = 0;

    for (int i=0; i<nums.length; i++) {
      for (int j=0; j<nums[i].length; j++) {
        if (nums[i][j] == 0) {
          ans += 1;
        }
      }
    }

    return ans;
  }

  // public static void fill2D(int[][] vals){
  //   return null;
  // }
  //
  // public static int[][] fill2DCopy(int[][] vals){
  //
  // }

  public static void main(String[]args) {
    int[] anArray = {1, 2, 3};
    int[][] multi = {{1,2,0}, {4,5,0}, {7,8,0}};

    printArray(anArray);
    printArray(multi);
    System.out.println(countZeros2D(multi));
  }
}
