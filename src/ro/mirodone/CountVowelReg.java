package ro.mirodone;

public class CountVowelReg {

    public int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}
