import java.util.Arrays;

public class L645 {

  public int[] findErrorNums(int[] nums) {
    int[] result = new int[2];
    int[] count = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      count[nums[i] - 1]++;
    }
    for (int i = 0; i < count.length; i++) {
      if (count[i] == 2)
        result[0] = i + 1;
      if (count[i] == 0)
        result[1] = i + 1;
    }
    return result;
  }

  public static void main(String[] args) {
    L645 solution = new L645();
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 2, 2, 4})));
    System.out
        .println(Arrays.toString(solution.findErrorNums(new int[] {1, 1})));
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 2, 4, 4})));
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 3, 2, 3})));
    System.out.println(
        Arrays.toString(solution.findErrorNums(new int[] {1, 2, 3, 3})));
  }
}
