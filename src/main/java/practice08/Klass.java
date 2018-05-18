package practice08;

public class Klass {
    Student leader;

    int number;

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        this.leader = leader;
        leader.setLeader(true);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }
}
