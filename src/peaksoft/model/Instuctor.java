package peaksoft.model;

import java.util.Arrays;

public class Instuctor {
     private  Long id;
     private String name;
      private  String surName;
      private int age;
      private String email;
      private Group[]groups;

    public Instuctor(Long id, String name, String surName, int age, String email) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Instuctor " +
                "\nid " + id +
                "\nname " + name +
                "\nsurName " + surName +
                "\nage " + age +
                "\nemail " + email +
                "\ngroups " + Arrays.toString(groups) ;
    }
}
