public class Person {
    private String name;
    private String heldPost;
    private String workPlace;
    private int age;
    private double salary;

    public Person(){}

    public Person(String name, String heldPost, String workPlace, int age, double salary) {
        this.name = name;
        this.heldPost = heldPost;
        this.workPlace = workPlace;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeldPost(String heldPost) {
        this.heldPost = heldPost;
    }

    public String getHeldPost() {
        return heldPost;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
