
//Encaptualition
//to use the GETTER AND SETTER FUNCTION USE
// class MainCode4 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         //s1.name = "Aman"; //not possible
//         s1.setName("Megha");
//         System.out.println(s1.getName());
//         s1.setAge(22);
//         System.out.println(s1.getAge());
//     }
// }
// class Student {
//     private String name;
//     private int age;
//     private String gender;
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setGender(String gender) {
//         this.gender = gender;
//     }
//     public String getGender() {
//         return gender;
//     }
// }
//
//
//
//
//
// class MainCode4 {
//     public static void main(String[] args) {
//         Teacher t1 = new Teacher();
//         t1.setName("megha");
//         System.out.println(t1.getName());
//     }
// }
// class Teacher {
//     private String Name;
//     private String Department;
//     private int age;
//     public void setName(String Name) {
//         this.Name = Name;
//     }
//     public String getName() {
//         return Name;
//     }
//     public void setDepartment(String Department) {
//         this.Department = Department;
//     }
//     public String getDepartment() {
//         return Department;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public int getAge() {
//         return age;
//     }
// }
//
//
//
//
//
// inharitance and   munltiline code encaptulation code both 
class MainCode4 {

    public static void main(String[] args) {
        Child g1 = new Child();
        g1.age = 22;
        System.out.println(g1.age);
        g1.setHarecolor("blue");
        System.out.println(g1.getHarecolor());

    }
}

class GrandFather {

    String name;
    int age;
    String gender;
}

class Parent extends GrandFather {

    private String eyecolor;

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

}

class Child extends Parent {

    private String harecolor;

    public void setHarecolor(String harecolor) {
        this.harecolor = harecolor;
    }

    public String getHarecolor() {
        return harecolor;
    }
}
