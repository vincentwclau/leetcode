import java.util.HashMap;
import java.util.Map;

public class L3000 {
  public int areaOfMaxDiagonal(int[][] dimensions) {
    int maxDiagonal = -1;
    int diagonal = -1;
    int area = -1;
    Map<Integer, Integer> areaMap = new HashMap<>();
    for (int i = 0; i < dimensions.length; i++) {
      diagonal =
          (int) (Math.pow(dimensions[i][0], 2) + Math.pow(dimensions[i][1], 2));
      if (diagonal > maxDiagonal) {
        maxDiagonal = diagonal;
        areaMap.put(diagonal, dimensions[i][0] * dimensions[i][1]);
      } else if (diagonal == maxDiagonal) {
        area = dimensions[i][0] * dimensions[i][1];
        if (area > areaMap.get(diagonal)) {
          areaMap.put(diagonal, area);
        }
      }
    }
    return areaMap.get(maxDiagonal);
  }
}
