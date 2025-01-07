package lesson10;

public class Anagram {
    public static void main(String[] args) {
        String[] strings = {"ate", "eat", "tea", "bat"};

        System.out.println("isAnagram(strings) = " + isAnagram(strings));
    }

    private static boolean isAnagram(String[] strings) {
        if (strings == null) {
            return false;
        }
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i] == null || strings[i + 1] == null || strings[i].length() != strings[i + 1].length()) {
                return false;
            }
        }

        String[] hashCodeArray = createHashCodeArray(strings);
        for (int i = 0; i < hashCodeArray.length - 1; i++) {
            if (!hashCodeArray[i].equals(hashCodeArray[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private static String[] createHashCodeArray(String[] strings) {
        String[] hashCodeArray = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            int[] symbolAmountArray = new int[26];
            char[] charArray = strings[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                int index = charArray[j] - 'a';
                symbolAmountArray[index]++;
            }
            hashCodeArray[i] = createHashCodeStringArray(symbolAmountArray);
        }
        return hashCodeArray;
    }

    private static String createHashCodeStringArray(int[] symbolAmountArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < symbolAmountArray.length; i++) {
            if (symbolAmountArray[i] > 0) {
                stringBuilder.append((char)(i + 'a'))
                        .append(symbolAmountArray[i]);
            }
        }
        return stringBuilder.toString();
    }
}
