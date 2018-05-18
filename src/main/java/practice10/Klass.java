package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    Student leader = null;
    List<Student> members = new ArrayList<>();

    int number;

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if(members.size() == 0 || !members.contains(leader)) {
            System.out.print("It is not one of us.\n");
            return;
        }
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

    public void appendMember(Student jerry) {
        members.add(jerry);
    }

    public boolean isIn(Student student) {
        if(members.contains(student)) {
            return true;
        } else {
            return false;
        }
    }
}
