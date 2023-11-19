package romm.questgame.model.role;

public class Protagonist extends Member {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(рішення|вирішив|вирішувати).*")) {
            System.out.println("\t+ Ви впорались з завданням самотужки.");
        } else {
            System.out.println("\t- Ви тут безсилий");
            passAlongTheChain(problem);
        }
    }
}
