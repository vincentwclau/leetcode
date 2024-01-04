public class L2923 {
  public int findChampion(int[][] grid) {
    int max = -1;
    int winCount = 0;
    int team = -1;
    for (int i = 0; i < grid.length; i++) {
      winCount = 0;
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1)
          winCount++;
      }
      if (winCount > max) {
        max = winCount;
        team = i;
      }
    }
    return team;
  }
}
