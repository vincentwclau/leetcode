public class L2432 {
  public int hardestWorker(int n, int[][] logs) {
    int lastTimestamp = 0, maxTime = -1;
    for (int i = 0; i < logs.length; i++) {
      maxTime = Math.max(maxTime, logs[i][1] - lastTimestamp);
      lastTimestamp = logs[i][1];
    }
    int minId = n + 1;
    lastTimestamp = 0;
    for (int i = 0; i < logs.length; i++) {
      if (logs[i][1] - lastTimestamp == maxTime)
        minId = Math.min(minId, logs[i][0]);
      lastTimestamp = logs[i][1];
    }
    return minId;
  }
}
