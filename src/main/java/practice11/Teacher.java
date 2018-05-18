package practice11;

import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree;

import java.util.*;

public class Teacher extends Person{
    Set<Klass> classes = new HashSet<>();

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for(Klass k : classes) {
            k.addTeacher(this);
        }
    }

//
//    public Teacher(int id, String name, int age, Klass klass) {
//        super(id, name, age);
//        this.klass = klass;
//    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(Set<Klass> classes) {
        this.classes = classes;
    }

    public String introduce() {
        String introduce = new String();
        introduce = super.introduce();
        int size = classes.size();

        if(size == 0) {
            introduce += " I am a Teacher. I teach No Class.";
        } else {
            introduce += " I am a Teacher. I teach Class ";

            List<Integer> list = new ArrayList<>();
            for(Klass k : classes) {
                list.add(k.getNumber());
            }
            Collections.sort(list);

            for(int i=0; i<list.size(); i++) {
                introduce += list.get(i);
                if(i == list.size()-1) {
                    introduce += ".";
                } else {
                    introduce += ", ";
                }
            }
        }
        return introduce;
    }

    public String introduceWith(Student student) {
        String introuduce = new String();
        introuduce = super.introduce() + " I am a Teacher. ";
        if(isTeaching(student)) {
            introuduce += "I teach " + student.getName() + ".";
        } else {
            introuduce += "I don't teach " + student.getName() + ".";
        }
        return introuduce;
    }

    public boolean isTeaching(Student student) {
        boolean res = false;
        for(Klass k : classes) {
            if(k.isIn(student)) {
                res = true;
            }
        }
        return  res;
    }

    public void knowLeader(Student leader) {
        System.out.print("I am " + this.name + ". I know " + leader.name + " become Leader of Class 2.\n");
    }

    public void knowMember(Student member) {
        System.out.print("I am " + this.name + ". I know " + member.name +" has joined Class 2.\n");
    }
}
