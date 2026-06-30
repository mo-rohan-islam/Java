class MergeAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
    
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();

        int i = 0;
        while (i < len1 && i < len2) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i++));
        }

        if (len1 < len2)
            merged.append(word2.substring(i));
        else
            merged.append(word1.substring(i));

        return merged.toString();
    }
}