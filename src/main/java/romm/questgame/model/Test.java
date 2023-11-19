package romm.questgame.model;

import romm.questgame.model.role.Team;

public class Test {
    public static void main(String[] args) {
        Team team = new Team();
        team.register("член вашої команди пошкодив ногу");
        team.register("член вашої команди пошкодив ногу");
        team.register("потрібно збудувати пліт");
        team.register("на вас напали дикі звірі");
        team.register("ви зірвались в прірву");
        team.register("потрібно зібрати хворост");
    }
}
