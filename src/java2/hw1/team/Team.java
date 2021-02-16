package java2.hw1.team;

import java.util.Arrays;

public class Team {
    private String name;
    private Teammate[] teammates;

    public Team(String name, Teammate... teammates) {
        this.name = name;
        this.teammates = teammates;
    }

    public void showFullResults() {
        System.out.println("Team's full info.");
        System.out.println("Team's name: " + name);
        System.out.println(Arrays.toString(teammates));
    }
    public void showSingleResults() {
        System.out.println("Teammate's info.");
        System.out.println("Team's name: " + name);
        for (int i = 0; i < teammates.length; i++) {
            if (teammates[i].isPassed()) {
                System.out.println((teammates[i]));
            }
        }

    }

    public Teammate[] getTeammates() {
        return teammates;
    }
}
