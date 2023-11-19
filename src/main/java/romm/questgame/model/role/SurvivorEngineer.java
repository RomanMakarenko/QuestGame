package romm.questgame.model.role;

import romm.questgame.model.role.specialization.Engineer;

public class SurvivorEngineer extends Member implements Engineer {
    @Override
    public void construct() {

    }

    @Override
    public void solve(String problem) {
        if (problem.matches(".*(відремонтувати|збудувати|зробити).*")) {
            System.out.println("\t+ Інженер впорався з завданням.");
        } else {
            System.out.println("\t- Інженер тут безсилий");
            passAlongTheChain(problem);
        }
    }
}
