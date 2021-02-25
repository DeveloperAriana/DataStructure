package LinkedList;

public class Nodo {
    String firstName;
    String lastName;
    Integer age;
    Nodo next;
    Nodo behind;

    public Nodo() {
        this.firstName = null;
        this.lastName = null;
        this.age = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBehind() { return behind;}

    public void setBehind(Nodo behind) { this.behind = behind; }
}
