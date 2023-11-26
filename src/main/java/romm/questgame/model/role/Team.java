package romm.questgame.model.role;

import java.util.ArrayList;
import java.util.Optional;

public class Team {
    private ArrayList<Member> teamMembers;
    private Member member = new Protagonist();

    public Team(ArrayList<Member> teamMembers) {
        this.teamMembers = teamMembers;
        buildResponsibilityChain(SurvivorRegular.class);
        buildResponsibilityChain(SurvivorEngineer.class);
        buildResponsibilityChain(SurvivorFighter.class);
        buildResponsibilityChain(SurvivorDoctor.class);
    }

    private void buildResponsibilityChain(Class<? extends Member> survivorClass) {
        Optional<Member> matchingMember = teamMembers.stream()
                .filter(currentMember -> survivorClass.isInstance(currentMember))
                .findFirst();

        matchingMember.ifPresent(newMember -> {
            Member currentMember = this.member;
            while (currentMember.getNextLevel() != null) {
                currentMember = currentMember.getNextLevel();
            }
            currentMember.setNextLevel(newMember);
        });
    }

    public void register(String problem) {
        System.out.println(problem);
        this.member.solve(problem.trim().toLowerCase());
    }

    public int getTeamMembersCount() {
        return teamMembers.size();
    }
}
