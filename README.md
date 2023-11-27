### Technologies: 
- Tomcat (10);
- JSP - 2 files: 
 1. welcome page which can redirect to start of quest game?selectedPath=1 and;
  1. the game page, where you can get the current question from the QuestionRepository and contain a session that counts the number of attempts to complete the game.
- JSTL;
- servlets - Based on the selectedPath from the QuestionRepository (HashMap<String, Question> storage), the next question in the branch is retrieved;
- JUNIT 5 for cover by tests.
<img width="1058" alt="tests" src="https://github.com/RomanMakarenko/QuestGame/assets/7659126/b687ed15-a2b7-4ebe-bbd4-ddf9bbfd5305">

# QuestGame
Your choice determines how the story will develop.
Losing is not a reason to be upset. You can always start the game again
-------------
# Game structure:
##  -  Welcome page
<img width="1440" alt="welcome" src="https://github.com/RomanMakarenko/QuestGame/assets/7659126/2931b4a7-0baa-4d4d-b710-13685fdb65de">

##  -  Story page
<img width="1440" alt="story" src="https://github.com/RomanMakarenko/QuestGame/assets/7659126/27de9618-11bb-4bb7-bc9d-c82b622c466b">

#  TODO
There is implemented logic of Chain of Responsibility design pattern, for upgrade logic to support random actions by your Team configuration. As example, if doctor was safed on some previous step he can help other team members e.t.c.
