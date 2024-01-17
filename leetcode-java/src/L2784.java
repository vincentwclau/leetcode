public class L2784 {
  public boolean isGood(int[] nums) {
    if (nums.length == 1) {
      return false;
    }
    int[] count = new int[200];
    for (int i = 0; i < nums.length; i++) {
      count[nums[i] - 1]++;
    }
    for (int i = 0; i < nums.length - 2; i++) {
      if (count[i] != 1)
        return false;
    }
    return count[nums.length - 2] == 2;
  }
}
