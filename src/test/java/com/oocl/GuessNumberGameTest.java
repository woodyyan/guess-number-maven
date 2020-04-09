package com.oocl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuessNumberGameTest {
    private GuessNumberGame game;

    @Before
    public void setUp() throws Exception {
        // before method
        String answer = "1234";
        game = new GuessNumberGame(answer);
    }

    @Test
    public void should_return_4A0B_when_answer_is_1234_given_input_is_1234() {
        String inputNumbers = "1234";
        String result = game.guess(inputNumbers);

        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_2A2B_when_answer_is_1234_given_input_is_1243() {
        String inputNumbers = "1243";
        String result = game.guess(inputNumbers);

        Assert.assertEquals("2A2B", result);
    }
}