package romm.questgame.repository;

import org.junit.jupiter.api.Test;
import romm.questgame.entity.Question;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class QuestionRepositoryTest {
    @Test
    public void testGetQuestionText() {
        QuestionRepository questionRepository = new QuestionRepository();
        Question actualQuestion = questionRepository.getQuestion("1");
        assertNotNull(actualQuestion);
        assertEquals("Страшніки кричать звідусіль, що робити?", actualQuestion.getQuestionText());
    }

    @Test
    public void testGetQuestionNonExistingKey() {
        QuestionRepository questionRepository = new QuestionRepository();
        Question question = questionRepository.getQuestion("nonexistentKey");
        assertNull(question);
    }

    @Test
    public void testGetQuestionOptions() {
        QuestionRepository questionRepository = new QuestionRepository();
        Question actualQuestion = questionRepository.getQuestion("1");
        HashMap<String, String> actualAnswers = actualQuestion.getAnswerOptions();
        assertEquals(actualAnswers.get("21"), "Потрібно рятувати вцілілих, піти до хвоста літака");
    }

    @Test
    public void testIsBranchExistWhenNotExist() {
        QuestionRepository questionRepository = new QuestionRepository();
        boolean isQuestionExists = questionRepository.isBranchExist("dd");
        assertFalse(isQuestionExists);
    }

    @Test
    public void testIsBranchExistWhenExist() {
        QuestionRepository questionRepository = new QuestionRepository();
        boolean isQuestionExists = questionRepository.isBranchExist("2111111111111113");
        assertTrue(isQuestionExists);
    }
}