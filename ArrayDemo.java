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

  public static void fill2D(int[][] vals){
    for (int i=0; i<vals.length; i++) {
      for (int j=0; j<vals[i].length; j++) {
        if (i==j) {
          vals[i][j] = 3;
        } else {
          vals[i][j] = 1;
        }
      }
    }
  }

  public static int[][] fill2DCopy(int[][] vals){
    int[][] ans = new int[vals.length][vals[0].length];
    for (int i=0; i<vals.length; i++) {
      for (int j=0; j<vals[i].length; j++) {
        if (vals[i][j] < 0) {
          ans[i][j] = 3;
        } else {
          ans[i][j] = 1;
        }
      }
    }
    return ans;
  }

  public static void main(String[]args) {
    int[] anArray = {1, 2, 3};
    int[][] multi = {{1,-2,0}, {-4,-5,0}, {7,8,0}};

    printArray(anArray);
    printArray(multi);
    printArray(fill2DCopy(multi));
    System.out.println(countZeros2D(multi));
    fill2D(multi);
    printArray(multi);
  }
}
