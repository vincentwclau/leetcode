public class L2937 {

  public int findMinimumOperations(String s1, String s2, String s3) {
    int allEqualCount = 0;
    int length = Math.min(s1.length(), s2.length());
    length = Math.min(s3.length(), length);
    for (int i = 0; i < length; i++) {
      if (s1.charAt(i) != s2.charAt(i) || s2.charAt(i) != s3.charAt(i))
        break;
      allEqualCount++;
    }
    return allEqualCount == 0 ? -1
        : s1.length() + s2.length() + s3.length() - allEqualCount * 3;
  }

}
