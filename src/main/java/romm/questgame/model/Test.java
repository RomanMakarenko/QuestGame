package romm.questgame.model;

import romm.questgame.model.role.Member;
import romm.questgame.model.role.SurvivorDoctor;
import romm.questgame.model.role.SurvivorFighter;
import romm.questgame.model.role.SurvivorRegular;
import romm.questgame.model.role.Team;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Member> teamMembers = new ArrayList<>();
        teamMembers.add(new SurvivorRegular());
        teamMembers.add(new SurvivorFighter());
        teamMembers.add(new SurvivorDoctor());
        Team team = new Team(teamMembers);
        team.register("член вашої команди пошкодив ногу");
        team.register("член вашої команди пошкодив ногу");
        team.register("потрібно збудувати пліт");
        team.register("на вас напали дикі звірі");
        team.register("ви зірвались в прірву");
        team.register("потрібно зібрати хворост");
    }
}
