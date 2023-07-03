public class Strings {
  public static void main(String args[]) {
    StringBuilder str = new StringBuilder("Learning String");
    manipulateString(str);
    System.out.println("'" + str + "'");
    System.out.println(str.length());
  }

  private static void manipulateString(StringBuilder str) {
    str.append(" By Doing");
    // str.reverse();
    str.delete(0, 9);
    str.deleteCharAt(0);
    // str.toString();
    str.replace(0, 1, "St");
    str.setLength(25);
  }
}
