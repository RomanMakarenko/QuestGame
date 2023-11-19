package romm.questgame.model.role;

import romm.questgame.model.role.specialization.Doctor;

public class SurvivorDoctor extends Member implements Doctor {
    @Override
    public boolean heal() {
        return false;
    }

    @Override
    public void solve(String problem) {
        if (problem.matches(".*(поранено|знепритомнів|травмувався|пошкодив).*")) {
            System.out.println("\t+ Лікар допоміг пораненому.");
        } else {
            System.out.println("\t- Лікар тут безсилий");
            passAlongTheChain(problem);
        }
    }
}
