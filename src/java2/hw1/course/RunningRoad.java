package java2.hw1.course;

import java2.hw1.team.Teammate;

public class RunningRoad extends AbstractCourse{
    private int distance = 200;

    @Override
    protected void doIt(Teammate teammate) {
        if (teammate.getMaxRunningDistance() >= distance) {
            teammate.setPassed(true);
        } else {
            teammate.setPassed(false);
        }
    }

}
