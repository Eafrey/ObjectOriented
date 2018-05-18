package practice07;

public class Teacher extends Person{
    Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String introduce = new String();
        introduce = super.introduce();
        if(klass == null) {
            introduce += " I am a Teacher. I teach No Class.";
        } else {
            introduce += " I am a Teacher. I teach " +  this.klass.getDisplayName() + ".";
        }
        return introduce;
    }

    public String introduceWith(Student jerry) {
        String introuduce = new String();
        introuduce = super.introduce() + " I am a Teacher. ";
        if(klass.getNumber() == jerry.getKlass().getNumber()) {
            introuduce += "I teach " + jerry.getName() + ".";
        } else {
            introuduce += "I don't teach " + jerry.getName() + ".";
        }
        return introuduce;
    }
}
