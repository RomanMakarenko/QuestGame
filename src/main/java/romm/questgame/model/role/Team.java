package romm.questgame.model.role;

import java.util.ArrayList;

public class Team {
    private ArrayList<Member> teamMembers;
    private Member member;

    public Team() {
        this.member = new Protagonist();
        member.setNextLevel(new SurvivorRegular())
                .setNextLevel(new SurvivorEngineer())
                .setNextLevel(new SurvivorFighter())
                .setNextLevel(new SurvivorDoctor());
    }

    public void register(String problem) {
        System.out.println(problem);
        this.member.solve(problem.trim().toLowerCase());
    }

    public void addMemberToTeam(Member member) {
        teamMembers.add(member);
    }
}
