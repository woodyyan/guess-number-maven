package com.oocl;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomAnswerGenerator implements AnswerGenerator {

    public static final int ANSWER_LENGTH = 4;
    public static final int MAX_NUMBER = 10;
    public static final String ANSWER_DELIMITER = "";

    public String generate() {
        Random random = new Random();
        Set<String> numbers = new HashSet<String>();
        while (numbers.size() < ANSWER_LENGTH) {
            numbers.add(String.valueOf(random.nextInt(MAX_NUMBER)));
        }
        return String.join(ANSWER_DELIMITER, numbers);
    }
}
