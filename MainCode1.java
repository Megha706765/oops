// Encapsulation --> security (Provide to variables)
// private entity banana

// Inheritance --> code shorter using extends keyword properties share karte hai
// polomorphism --> naam ek kaam anek
// function same hoga parameter different
// abstraction --> provide abstract class(Security)

class MainCode1 {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name = "Megha";
        c1.age = 22;
        c1.gender = "F";
        c1.eyeColor = "Blue";
        System.out.println(c1.name);
        System.out.println(c1.eyeColor);
    }
}

class Parent {

    String name;
    int age;
    String gender;
}

class Child extends Parent {

    String eyeColor;
}
