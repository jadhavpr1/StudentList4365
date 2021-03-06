package studentlist;

/**
 * This class represents a student.
 *
 * @author Paul Bonenfant
 */
public class Student {

    private String name;
    
    private String address;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     public String getAddress() {
        return address;
    }
    
     public void setAddress(String address) {
        this.name = address;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}

