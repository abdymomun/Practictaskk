package peaksoft.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Long id;
    private String name;
    private LocalDate createdAt;
    private Student []students;

    public Group(Long id, String name, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
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

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group " +
                "\nid " + id +
                "\nname " + name +
                "\ncreatedAt " + createdAt +
                "\nstudents " + Arrays.toString(students) ;
    }
}
