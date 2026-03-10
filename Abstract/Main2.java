
class Main2 {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("megha");
        System.out.println(t1.getName());
        t1.age = 23;
        System.out.println(t1.age);
    }
}

abstract class Student {

    private String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher extends Student {

}
