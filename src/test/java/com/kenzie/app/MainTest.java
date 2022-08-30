package com.kenzie.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*** File created by Brandon Januska-Wilson ***/
/*** Methods created and implemented by Brandon Januska-Wilson ***/

public class MainTest {

    final static String testURL = "https://jservice.kenzie.academy/api/clues/1";

    @Test
    public void getAnswerTitleTest() throws JsonProcessingException {

        String expectedAnswer = "sheep";
        assertEquals(expectedAnswer, Main.getAnswerTitle(testURL));

    }

    @Test
    public void getQuestionTest() throws JsonProcessingException {

        String expectedQuestion = "Let's all flock to read Psalm 95, in which humans are compared to these animals";
        assertEquals(expectedQuestion, Main.getQuestion(testURL));

    }

    @Test
    public void getCategoryTitleTest() throws JsonProcessingException {

        String expectedCategory = "THE OLD TESTAMENT";
        assertEquals(expectedCategory, Main.getCategoryTitle(testURL));

    }

}
