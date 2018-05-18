package practice06;

public class Teacher extends Person{
    int klass = -1;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        String introduce = new String();
        if(klass == -1) {
            introduce = super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            introduce = super.introduce() + " I am a Teacher. I teach Class " +  this.klass + ".";
        }
        return introduce;
    }
}
