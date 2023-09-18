package Domain;

public class Teacher extends Person implements Comparable<Teacher> {
    private int id;
    private static int generalId;

    private String acadDegree;

    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teachers [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + ",acadDegree="
                + acadDegree + "]";
    }

    @Override
    public int compareTo(Teacher o) {

        System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() == o.getAge()) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;

        }

        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }
}
