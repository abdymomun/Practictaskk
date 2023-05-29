package peaksoft.model;

import java.util.Arrays;

public class Company {
    private Long id;
    private String name;
    private String country;
    private String address;
    private Group[]groups;
    private Instuctor[] instuctors;
    private Student []students;

    public Company(Long id, String name, String country, String address,Group []groups) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.address = address;
    }

    public Company(Long id, String name, String country, String address, Group[] groups, Instuctor[] instuctors, Student[] students) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.groups = groups;
        this.instuctors = instuctors;
        this.students = students;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Instuctor[] getInstuctors() {
        return instuctors;
    }

    public void setInstuctors(Instuctor[] instuctors) {
        this.instuctors = instuctors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Company " +
                "\nid " + id +
                "\nname " + name +
                "\ncountry " + country +
                "\naddress " + address +
                "\ngroups " + Arrays.toString(groups) +
                "\ninstuctors " + Arrays.toString(instuctors) +
                "\nstudents " + Arrays.toString(students) ;
    }
}
