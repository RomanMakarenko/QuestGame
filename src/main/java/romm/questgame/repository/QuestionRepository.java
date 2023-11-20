package romm.questgame.repository;

import romm.questgame.entity.Question;

import java.util.HashMap;

public class QuestionRepository {
    private static final HashMap<Integer, Question> storage = new HashMap<>() {{
        put(1, new Question("Страшніки крити чути звідусіль, що робити?", 1, new HashMap<>() {{
            put(21, "Потрібно рятувати вцілілих, піти до хвоста літака");
            put(22, "Потрібно рятувати вцілілих, піти до носу літака");
            put(23, "З мене досить на сьогодні, відійти від літака подалі");
        }}));
        put(21, new Question("Ви бачите жінку яку притисло уламками", 2, new HashMap<>() {{
            put(211, "Врятувати жінку");
            put(212, "Вона впорається сама");
        }}));
        put(22, new Question("Ви бачите двох чоловіків", 2, new HashMap<>() {{
            put(221, "Попросити приєднатись до групи");
            put(222, "Проігнорувати їх");
        }}));
        put(23, new Question("До вас наближається жінка", 2, new HashMap<>() {{
            put(231, "Попросити приєднатись до групи");
            put(232, "Відмовитись від спілкування з нею");
        }}));
        put(211, new Question("Жінка представилась доктором Джейн і запропонувала продовжити шлях разом", 2, new HashMap<>() {{
            put(2111, "Погодитись");
            put(2112, "Відмовитись");
        }}));
    }};

    public Question getQuestion(int questionNumber) {
        return storage.get(questionNumber);

    }
}
