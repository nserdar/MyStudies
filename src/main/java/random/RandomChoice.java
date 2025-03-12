package main.java.random;

import java.util.List;
import java.util.Random;

public class RandomChoice {
    private static final List<String> sentences = List.of(
            "Hello, World!",
            "Goodbye, World!",
            "I am a sentence.",
            "I am another sentence.",
            "I am a third sentence."
    );

    public static String getRandomSentences(){

        Random random = new Random();
        return sentences.get(random.nextInt(sentences.size()));

    }
}
