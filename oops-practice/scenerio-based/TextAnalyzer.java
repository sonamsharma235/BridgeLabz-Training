class TextAnalyzer {
    static void analyzeText(String text, String findWord, String replaceWord) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("No content to analyze.");
            return;
        }

        String cleanedText = text.trim().replaceAll("\\s+", " ");
        String[] words = cleanedText.split(" ");

        System.out.println("Word count: " + words.length);
        String longestWord = "";
        for (String word : words) {
            String pureWord = word.replaceAll("[^a-zA-Z]", "");
            if (pureWord.length() > longestWord.length()) {
                longestWord = pureWord;
            }
        }
        System.out.println("Longest word: " + longestWord);
        String replacedText = cleanedText.replaceAll(
                "(?i)\\b" + findWord + "\\b",
                replaceWord
        );
        System.out.println("Updated paragraph:");
        System.out.println(replacedText);
    }

    public static void main(String[] args) {
        String paragraph = "Java is powerful. Java is popular and java is everywhere.";
        analyzeText(paragraph, "java", "Java™");
    }
}
