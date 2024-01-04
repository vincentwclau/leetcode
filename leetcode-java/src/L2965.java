public class L2965 {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int[] counts = new int[grid[0].length * grid.length];
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        counts[grid[i][j] - 1]++;
      }
    }
    int[] result = new int[2];
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 1)
        result[0] = i + 1;
      if (counts[i] == 0)
        result[1] = i + 1;
    }
    return result;
  }
}
