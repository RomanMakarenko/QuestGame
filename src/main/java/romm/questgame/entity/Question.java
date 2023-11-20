package romm.questgame.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@Data
public class Question {
    private String questionText;
    private int questionLevel;
    private HashMap<Integer, String> answerOptions;
}
