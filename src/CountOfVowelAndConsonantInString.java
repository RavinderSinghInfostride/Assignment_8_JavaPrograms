public class CountOfVowelAndConsonantInString {
    public static void main(String[] args) {
        int vowelCount = 0, consonantCount = 0, i;
        String demoString = "My name is Ravinder Singh";
        demoString = demoString.toLowerCase();

        for (i = 0; i < demoString.length(); i++) {
            if (demoString.charAt(i) == 'a' || demoString.charAt(i) == 'e' || demoString.charAt(i) == 'i' || demoString.charAt(i) == 'o' || demoString.charAt(i) == 'u') {
                vowelCount++;
            } else if (demoString.charAt(i) >= 'a' && demoString.charAt(i) <= 'z') {
                consonantCount++;
            }
        }
        System.out.println("Number of vowels in string : " + vowelCount);
        System.out.println("Number of consonants in string: " + consonantCount);
    }
}