import java.util.List;

public class L2828 {
  public boolean isAcronym(List<String> words, String s) {
    if (words.size() != s.length())
      return false;
    for (int i = 0; i < words.size(); i++) {
      if (words.get(i).charAt(0) != s.charAt(i))
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    // words = ["alice","bob","charlie"], s = "abc"
    // words = ["an","apple"], s = "a"
    // words = ["never","gonna","give","up","on","you"], s = "ngguoy"
  }
}
