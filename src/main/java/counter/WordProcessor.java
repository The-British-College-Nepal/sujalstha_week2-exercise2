package counter;

public class WordProcessor implements Counter {

    // STEP 3: Encapsulated Fallback State

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // STEP 2: Core Sentence Analysis Methods

    @Override
    public int countWords(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }

    @Override
    public int countLetters(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        int letters = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }

        return letters;
    }

    @Override
    public int getLength(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        return sentence.length();
    }
}