package ro.mirodone;

public class CountVowel {

    public int getCount(String str) {
        int vowelsCount = 0;
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if ("a, e, i, o, u".contains("" + str.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
