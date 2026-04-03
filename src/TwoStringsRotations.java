public class TwoStringsRotations {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewa";
        String combinedStr = str1 + str1;
        if (str1.length() != str2.length()) {
            System.out.println("These strings are not rotatings");
            return;
        }

        if (combinedStr.contains(str2)) {
            System.out.println("Given strings are rotating");
        } else {
            System.out.println("These strings are not rotatings");
        }

    }
}
