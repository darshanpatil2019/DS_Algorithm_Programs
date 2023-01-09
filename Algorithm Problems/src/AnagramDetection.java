import java.util.Arrays;

//One string is an anagram of another if the second is simply a rearrangement of the first
public class AnagramDetection {
    static void isAnagram(String str1, String str2) {
        String string1 = str1.replaceAll("\\s", "");
        String string2 = str2.replaceAll("\\s", "");
        boolean status ;
        if (string1.length() != string2.length()) {
            status = false;
        } else {
            char[] array1 = string1.toLowerCase().toCharArray();
            char[] array2 = string2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            status = Arrays.equals(array1, array2);
        }
        if (status) {
            System.out.println(string1 + " and " + string2 + " are Anagrams");
        } else {
            System.out.println(string1 + " and " + string2 + " are not Anagrams");
        }
    }

    public static void main(String[] args) {
        isAnagram("abcd", "dcba");
        isAnagram("Heart", "earth");
        isAnagram("hear", "here");
        isAnagram("how", "who");
        isAnagram("darshan","patil");
    }
}