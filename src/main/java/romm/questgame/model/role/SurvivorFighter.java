package romm.questgame.model.role;

import romm.questgame.model.role.specialization.Warrior;

public class SurvivorFighter extends Member implements Warrior {
    @Override
    public boolean fight() {
        return false;
    }

    @Override
    public void solve(String problem) {
        if (problem.matches(".*(напад|атака|бійка|напали).*")) {
            System.out.println("\t+ Боєць впорався з завданням.");
        } else {
            System.out.println("\t- Боєць тут безсилий");
            passAlongTheChain(problem);
        }
    }
}
