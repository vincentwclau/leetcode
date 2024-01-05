public class L2970 {
  public int incremovableSubarrayCount(int[] nums) {
    int skipStart, skipEnd, lastInt;
    int skipRange = nums.length - 1;
    int count = 1; // self incremovable
    boolean isInc;
    while (skipRange > 0) { // range
      skipStart = 0;
      skipEnd = skipStart + skipRange - 1;
      while (skipEnd <= nums.length - 1) { // start end index
        lastInt = -1;
        isInc = true;
        for (int i = 0; i < nums.length; i++) { // determine if all int increasing
          if (i >= skipStart && i <= skipEnd)
            continue;
          if (lastInt == -1) {
            lastInt = nums[i];
          } else {
            if (nums[i] <= lastInt) {
              isInc = false;
              break;
            }
            lastInt = nums[i];
          }
        }
        if (isInc)
          count++;
        skipStart++;
        skipEnd++;
      }
      skipRange--;
    }
    return count;
  }
}
