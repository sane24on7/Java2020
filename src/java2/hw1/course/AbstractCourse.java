package java2.hw1.course;

import java2.hw1.team.Team;
import java2.hw1.team.Teammate;

public abstract class AbstractCourse implements Course {
    @Override
    public void doIt(Team team) {
        for (int i = 0; i < team.getTeammates().length; i++) {
            doIt(team.getTeammates()[i]);
        }
    }
    protected abstract void doIt(Teammate teammates);

}
