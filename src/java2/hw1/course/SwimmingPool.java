package java2.hw1.course;

import java2.hw1.team.Teammate;

public class SwimmingPool extends AbstractCourse{
    private int distance = 50;

    @Override
    protected void doIt(Teammate teammate) {
        teammate.setPassed(teammate.getMaxSwimmingDistance() >= distance);
    }
}
