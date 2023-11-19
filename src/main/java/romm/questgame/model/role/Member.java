package romm.questgame.model.role;

import lombok.Data;

@Data
public abstract class Member {
    private Member nextLevel;
    private String name;

    public Member setNextLevel(Member nextLevel) {
        this.nextLevel = nextLevel;
        return this.nextLevel;
    }

    protected void passAlongTheChain(String problem) {
        if ( this.nextLevel != null) {
            this.nextLevel.solve(problem);
        }
    }

    public abstract void solve(String problem);
}
