import java.util.LinkedList;
import java.util.List;

public class L2951 {
  public List<Integer> findPeaks(int[] mountain) {
    List<Integer> peaks = new LinkedList<>();
    for (int i = 0; i < mountain.length; i++) {
      if (i > 0 && i < mountain.length - 1) { // skip head and tail element
        if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
          peaks.add(i);
        }
      }
    }
    return peaks;
  }
}
