
class Run {//main class

    public static void main(String[] args) { //beta
        Student s1 = new Student();
        s1.name = "Megha";
        s1.age = 20;
        s1.gender = "M";
        Teacher t1 = new Teacher();
        t1.empNo = "CEV123";
        t1.name = "Kavita";
        System.out.println(s1.name);
        System.out.println(t1.empNo);
    }
}

class Student {   //papa

    String name;
    int age;
    String gender;
    String enRoll;
}

class Teacher {

    String name;
    int age;
    String gender;
    String empNo;
}
