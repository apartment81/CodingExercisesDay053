package ro.mirodone;

public class Main {

    public static void main(String[] args) {
	// test code

        CountVowel countVowel = new CountVowel();

        System.out.println(countVowel.getCount("service"));
        System.out.println(countVowel.getCount("peer tree"));

        CountVowelReg countVowelReg = new CountVowelReg();

        System.out.println(countVowelReg.getCount("service"));
        System.out.println(countVowelReg.getCount("peer tree"));

    }
}
