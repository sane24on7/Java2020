package java2.hw1.team;

public class Teammate {
    private String name;
    boolean isPassed;
    private int maxRunningDistance;
    private int maxSwimmingDistance;

    public Teammate(String name, int maxRunningDistance, int maxSwimmingDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
    }

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public int getMaxSwimmingDistance() {
        return maxSwimmingDistance;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    @Override
    public String toString() {
        return "Teammate{" +
                "name='" + name + '\'' +
                ", isPassed=" + isPassed +
                ", maxRunningDistance=" + maxRunningDistance +
                ", maxSwimmingDistance=" + maxSwimmingDistance +
                '}';
    }
}
