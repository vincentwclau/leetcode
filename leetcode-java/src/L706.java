import java.util.ArrayList;
import java.util.List;

public class L706 {

  private List<List<Integer>> entries; // [[1,2], [2,4], [3, 9]]

  public L706() {
    this.entries = new ArrayList<>();
  }

  public void put(int key, int value) {
    for (List<Integer> entry : this.entries) {
      if (entry.get(0) == key) {
        entry.set(1, value);
        return;
      }
    }
    this.entries.add(new ArrayList<>(List.of(key, value)));
  }

  public int get(int key) {
    for (List<Integer> entry : this.entries) {
      if (entry.get(0) == key)
        return entry.get(1);
    }
    return -1;
  }

  public void remove(int key) {
    for (List<Integer> entry : this.entries) {
      if (entry.get(0) == key) {
        this.entries.remove(entry);
        return;
      }
    }
  }
}
