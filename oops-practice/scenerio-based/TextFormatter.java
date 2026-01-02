class TextFormatter {
    static String autoCorrect(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }
        text = text.trim().replaceAll("\\s+", " ");
        text = text.replaceAll("\\s*([.!?])\\s*", "$1 ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : text.toCharArray()) {
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        String input = "hello   world.this is   a test!how are you ?i am fine.";
        String output = autoCorrect(input);

        System.out.println(output);
    }
}
