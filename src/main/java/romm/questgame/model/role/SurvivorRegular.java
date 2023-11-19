package romm.questgame.model.role;

public class SurvivorRegular extends Member {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(розвідка|полювання|збір|зібрати).*")) {
            System.out.println("\t+ Член групи впорався з завданням.");
        } else {
            System.out.println("\t- Член групи тут безсилий");
            passAlongTheChain(problem);
        }
    }
}
