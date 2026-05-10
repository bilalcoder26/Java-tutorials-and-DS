package concepts.SpringBoot.Beans;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private String name;

    // No-argument constructor
    public Student() {
    }

    // Getter
    public int getId() {
        return id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
