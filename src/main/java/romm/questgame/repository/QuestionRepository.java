package romm.questgame.repository;

import romm.questgame.entity.Question;

import java.util.HashMap;

public class QuestionRepository {
    private static final HashMap<String, Question> storage = new HashMap<>() {{
        put("1", new Question("Страшніки кричать звідусіль, що робити?", 1, new HashMap<>() {{
            put("21", "Потрібно рятувати вцілілих, піти до хвоста літака");
            put("22", "Потрібно рятувати вцілілих, піти до носу літака");
            put("23", "З мене досить на сьогодні, відійти від літака подалі");
        }}));
        put("21", new Question("Ви бачите жінку, яку притисло уламками", 2, new HashMap<>() {{
            put("211", "Врятувати жінку");
            put("212", "Вона впорається сама");
        }}));
        put("22", new Question("Ви бачите двох чоловіків", 2, new HashMap<>() {{
            put("221", "Попросити приєднатись до групи");
            put("222", "Проігнорувати їх");
        }}));
        put("23", new Question("До вас наближається жінка", 2, new HashMap<>() {{
            put("231", "Попросити приєднатись до групи");
            put("232", "Відмовитись від спілкування з нею");
        }}));
        put("211", new Question("Жінка представилась доктором Джейн і запропонувала продовжити шлях разом", 2, new HashMap<>() {{
            put("2111", "Погодитись");
            put("2112", "Відмовитись");
        }}));
        put("212", new Question("Ви вирішили не турбувати жінку, але вона каже, що не може вийти сама", 2, new HashMap<>() {{
            put("2121", "Знову спробувати врятувати");
            put("2122", "Повернутися і допомогти");
            put("2123", "Продовжити йти без неї");
        }}));
        put("221", new Question("Чоловіки погоджуються приєднатися до вас, але хочуть вибору лідера групи", 2, new HashMap<>() {{
            put("2211", "Погодитися і бути лідером");
            put("2212", "Пропустити голосування і вибрати самому");
            put("2213", "Відмовитись від їхньої допомоги");
        }}));
        put("222", new Question("Ви вирішили їх ігнорувати, але вони починають слідувати за вами", 2, new HashMap<>() {{
            put("2221", "Зупинитися і спитати, чому вони за вами");
            put("2222", "Швидше вийти з їхнього поля зору");
            put("2223", "Дозволити їм приєднатися");
        }}));
        put("231", new Question("Жінка каже, що їй необхідна допомога, оскільки вона вражена", 2, new HashMap<>() {{
            put("2311", "Викликати допомогу для неї");
            put("2312", "Спробувати самому надати першу допомогу");
            put("2313", "Проігнорувати її і йти далі");
        }}));
        put("232", new Question("Ви відмовились від спілкування, але вона слідує за вами", 2, new HashMap<>() {{
            put("2321", "Спробувати пояснити свій вибір");
            put("2322", "Змінити напрямок і втекти від неї");
            put("2323", "Зупинитися і почати спілкування");
        }}));
        put("2322", new Question("Ви без оглядки бігли через джунглі, нажаль за густою листвою була прірва куди ви зірвались", 2, new HashMap<>() {{
            put("1", "Почати знову");
            put("2", "Закінчити");
        }}));
        put("2111", new Question("Ви погодились і доктор Джейн стає частиною вашої групи", 3, new HashMap<>() {{
            put("21111", "Подякувати їй за долучення");
            put("21112", "Спитати її, чому вона була на цьому літаку");
            put("21113", "Продовжити йти без обговорень");
        }}));
        put("2121", new Question("Ви підійшли до жінки, але нажаль саме в це й момент здетонував паливний бак, ви загинули", 3, new HashMap<>() {{
            put("1", "Почати заново");
            put("2", "Досить на сьогодні");
        }}));
        put("2122", new Question("Ви підійшли до жінки, але нажаль саме в це й момент здетонував паливний бак, ви загинули", 3, new HashMap<>() {{
            put("1", "Почати заново");
            put("2", "Досить на сьогодні");
        }}));
        put("2112", new Question("Ви відмовились, але вона все одно слідує за вами", 2, new HashMap<>() {{
            put("21121", "Запитати, чому вона слідує за вами");
            put("21122", "Ігнорувати її і йти далі");
        }}));
        put("21111111", new Question("Ви вирішили продовжити шлях через ліс. Під час прогулянки ви помітили сліди великого хижака. Як діяти?", 6, new HashMap<>() {{
            put("211111111", "Спробувати обійти місце, де помітили сліди, уникнувши зустрічі");
            put("211111112", "Подати звук сигналу, спробувати вивести хижака з дороги");
            put("211111113", "Використовувати ароматичні речовини для того, щоб змінити його напрямок");
        }}));
        put("211111111", new Question("Ви обійшли місце, де помітили сліди, і продовжили шлях. Однак через деякий час ви опинились у вузькому ущелині з двома виходами. Який шлях обрати?", 7, new HashMap<>() {{
            put("2111111111", "Піти вліво");
            put("2111111112", "Піти вправо");
            put("2111111113", "Зачекати та дослідити навколишню місцевість");
        }}));
        put("2111111111", new Question("Ви обрали шлях вліво. Пройшовши деякий час, ви потрапляєте в гущавину джунглів. Перед вами розкривається дорога, обсаджена великими рослинами та загадковими звуками природи. Як ви будете діяти?", 8, new HashMap<>() {{
            put("21111111111", "Продовжити подорож через гущавину");
            put("21111111112", "Знайти місце для ночівлі та вивчити навколишню місцевість на ранок");
            put("21111111113", "Спробувати викликати допомогу, використовуючи доступні ресурси");
        }}));
        put("21111111111", new Question("Проходження через гущавину стає складнішим через густий таємничий ліс. Несподівано ви натрапляєте на величезного павука. Як ви взаємодієте?", 9, new HashMap<>() {{
            put("211111111111", "Спробувати обійти його, уникаючи можливої небезпеки");
            put("211111111112", "Подати звук сигналу, намагаючись відвести його увагу");
            put("211111111113", "Використовувати доступні ресурси для створення вогню та відлякування павука");
        }}));
        put("211111111111", new Question("Ви вдалося обійти павука та продовжити свій шлях. Проте дорога розгалужується, і ви повинні вибрати, куди йти. Як ви визначите свій напрямок?", 10, new HashMap<>() {{
            put("2111111111111", "Вибрати шлях, який веде вглиб джунглів");
            put("2111111111112", "Спробувати знайти високий пагорб чи дерево, щоб дізнатися про навколишність");
            put("2111111111113", "Подати сигнал для привертання уваги, сподіваючись на допомогу");
        }}));
        put("2111111111111", new Question("Ви обрали глибокий шлях у джунглях. Пройшовши деякий час, ви опинились перед старовинною руїною містичної храмової будівлі. Як ви будете діяти?", 11, new HashMap<>() {{
            put("21111111111111", "Досліджувати храм та шукати корисні ресурси чи інформацію");
            put("21111111111112", "Обійти храм, уникаючи можливих небезпек");
            put("21111111111113", "Залишити храм і продовжити свій шлях через джунглі");
        }}));
        put("21111111111111", new Question("Під час дослідження храму ви виявляєте загадковий артефакт, який може бути корисним. Проте, це привертає увагу місцевих обитателів джунглів - диких племенних людей. Як ви реагуєте на їхню присутність?", 12, new HashMap<>() {{
            put("211111111111111", "Спробувати укласти мир і поділитися корисними ресурсами");
            put("211111111111112", "Сховати артефакт і спробувати уникнути конфлікту");
            put("211111111111113", "Спробувати використати артефакт для переконання племенних людей в своєму доброзичливому намірі");
        }}));
        put("211111111111112", new Question("Ви обрали обійти храм. Проте на вашому шляху ви натрапляєте на річку, яку потрібно перейти. Як ви плануєте це зробити?", 12, new HashMap<>() {{
            put("211111111111121", "Спробувати побудувати пліт чи плот для переходу річки");
            put("211111111111122", "Шукати брід чи переправу через річку");
            put("211111111111123", "Викликати допомогу для переходу річки");
        }}));
        put("21111111111113", new Question("Ви обрали залишити храм і продовжити свій шлях. Пройшовши деякий час, ви потрапляєте в зону зливових дощів, що зроблює ваш шлях багато важчим. Як ви вирішите подолати цю трудність?", 12, new HashMap<>() {{
            put("211111111111131", "Шукати притулок від дощу і зачекати, поки дощ припиниться");
            put("211111111111132", "Продовжити шлях під дощем, спробувавши знайти високий грунт");
            put("211111111111133", "Шукати інші шляхи обходу водяних зон");
        }}));
        put("2111111111111", new Question("Ви обрали глибокий шлях у джунглях. Пройшовши деякий час, ви опинились перед старовинною руїною містичної храмової будівлі. Як ви будете діяти?", 11, new HashMap<>() {{
            put("21111111111111", "Досліджувати храм та шукати корисні ресурси чи інформацію");
            put("21111111111112", "Обійти храм, уникаючи можливих небезпек");
            put("21111111111113", "Залишити храм і продовжити свій шлях через джунглі");
        }}));

        put("21111111111111", new Question("Під час дослідження храму ви виявляєте загадковий артефакт, який може бути корисним. Проте, це привертає увагу місцевих обитателів джунглів - диких племенних людей. Як ви реагуєте на їхню присутність?", 12, new HashMap<>() {{
            put("211111111111111", "Спробувати укласти мир і поділитися корисними ресурсами");
            put("211111111111112", "Сховати артефакт і спробувати уникнути конфлікту");
            put("211111111111113", "Спробувати використати артефакт для переконання племенних людей в своєму доброзичливому намірі");
        }}));

        put("211111111111112", new Question("Ви обрали обійти храм. Проте на вашому шляху ви натрапляєте на річку, яку потрібно перейти. Як ви плануєте це зробити?", 12, new HashMap<>() {{
            put("211111111111121", "Спробувати побудувати пліт чи плот для переходу річки");
            put("211111111111122", "Шукати брід чи переправу через річку");
            put("211111111111123", "Викликати допомогу для переходу річки");
        }}));

        put("21111111111113", new Question("Ви обрали залишити храм і продовжити свій шлях. Пройшовши деякий час, ви потрапляєте в зону зливових дощів, що зроблює ваш шлях багато важчим. Як ви вирішите подолати цю трудність?", 12, new HashMap<>() {{
            put("211111111111131", "Шукати притулок від дощу і зачекати, поки дощ припиниться");
            put("211111111111132", "Продовжити шлях під дощем, спробувавши знайти високий грунт");
            put("211111111111133", "Шукати інші шляхи обходу водяних зон");
        }}));
        put("211111111111111", new Question("Ви спробували укласти мир і поділитися артефактом з племенними людьми, привертаючи їхню симпатію. Однак, вони виявляють інтерес до вас і починають задавати питання про ваші мети. Як ви реагуєте?", 13, new HashMap<>() {{
            put("2111111111111111", "Відкрито розповісти про свої мети і попросити про допомогу");
            put("2111111111111112", "Бути обережним у відповідях та обмежити інформацію");
            put("2111111111111113", "Відмовитися розповідати більше і вирушити в інший напрямок");
        }}));
        put("2111111111111111", new Question("Ви відкрито розповіли племенним людям про свої мети та попросили про допомогу. Вони виявляються доброзичливими і надають вам допомогу. Тепер ви маєте можливість об'єднати свої зусилля для досягнення спільної мети. Вітаємо, ви знайшли союзників у джунглях!", -1, new HashMap<>()));
        put("2111111111111112", new Question("Ви були обережні у відповідях та обмежили інформацію, що ви розповідаєте племінним людям. Вони залишаються підозрілі, але не виступають проти вас. Ваш шлях продовжується через джунглі.", -1, new HashMap<>()));
        put("2111111111111113", new Question("Ви відмовилися розповідати більше і вирушили в інший напрямок, уникаючи конфлікту з племенними людьми. Ваш шлях продовжується через джунглі.", -1, new HashMap<>()));
        put("2111111111111111", new Question("Племінні люди виявили вам допомогу та стали вашими союзниками. Вони поділилися своїм знанням про джунглі, і ваша група змогла успішно пройти через них. Ви продовжуєте ваш квест разом із новими союзниками.", -1, new HashMap<>()));
        put("2111111111111112", new Question("Ваш обережний підхід не засмучує племінних людей, але вони відмовляються надавати вам допомогу. Ви розходитеся з ними, і ваш шлях продовжується в джунглях.", -1, new HashMap<>()));
        put("2111111111111113", new Question("Вирушивши в інший напрямок, ви уникаєте конфлікту з племінними людьми, але втрачаєте можливість отримати їхню допомогу. Ваш шлях продовжується в джунглях.", -1, new HashMap<>()));

    }};

    public HashMap<String, Question> getQuestions() {
        return storage;
    }
}
