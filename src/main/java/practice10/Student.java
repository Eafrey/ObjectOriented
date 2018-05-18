package practice10;

public class Student extends Person{
    Klass klass;
    boolean isLeader = false;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.appendMember(this);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String introduce = new String();
        introduce = super.introduce() + " I am a Student. ";
        if(isLeader) {
            introduce += "I am Leader of " + this.klass.getDisplayName() + ".";
        } else {
            introduce += "I am at " + this.klass.getDisplayName() + ".";
        }
        return introduce;
    }
}
