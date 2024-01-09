import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L2913 {
  public int sumCounts(List<Integer> nums) {
    Set<Integer> integers = new HashSet<>();
    int squares = 0;
    // 1st round subarray (i=0): [1], [1,2], [1,2,1]
    // 2nd round subarray (i=1): [2], [2,1]
    // 3rd round subarray (i=1): [1]
    for (int i = 0; i < nums.size(); i++) {
      integers.clear();
      for (int j = i; j < nums.size(); j++) {
        integers.add(nums.get(j));
        squares += integers.size() * integers.size();
      }
    }
    return squares;
  }
}
