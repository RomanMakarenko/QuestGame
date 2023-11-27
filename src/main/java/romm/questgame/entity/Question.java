package romm.questgame.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Question {
    private String questionText;
    private int questionLevel;
    private HashMap<String, String> answerOptions;
}
