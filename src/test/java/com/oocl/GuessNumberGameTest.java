package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {
    @Test
    public void should_return_4A0B_when_answer_is_1234_given_input_is_1234() {
        String answer = "1234";
        GuessNumberGame game = new GuessNumberGame(answer);
        String inputNumbers = "1234";
        String result = game.guess(inputNumbers);

        Assert.assertEquals("4A0B", result);
    }
}