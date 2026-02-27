//multilavel inheritance
// class MainCode3 {
//     public static void main(String[] args) {
//         Parent p1 = new Parent();
//         p1.name = "Deshraj";
//         p1.age = 72;
//         p1.gender = "Male";
//         child1 c1 = new child1();
//         c1.name = "Meghraj";
//         c1.age = 55;
//         c1.gender = "Male";
//         c1.eyeColor = "Blue";
//         System.out.println(c1.name);
//         System.out.println(c1.eyeColor);
//         System.out.println();
//         child2 c2 = new child2();
//         c2.name = "Ajay";
//         c2.age = 52;
//         c2.gender = "Male";
//         c2.hairColor = "Black";
//         System.out.println(c2.name);
//         System.out.println(c2.hairColor);
//         System.out.println();
//         child3 c3 = new child3();
//         c3.name = "Sudha";
//         c3.age = 45;
//         c3.gender = "Femail";
//         c3.height = 55;
//         System.out.println(c3.name);
//         System.out.println(c3.height);
//         System.out.println();
//     }
// }
// class Parent {
//     String name;
//     int age;
//     String gender;
// }
// class child1 extends Parent {
//     String eyeColor;
// }
// class child2 extends Parent {
//     String hairColor;
// }
// class child3 extends Parent {
//     int height;
// }
//
//
//
//
//
//
//

class MainCode3 {

    public static void main(String[] args) {
        grandParent g1 = new grandParent();
        g1.surname = "Thakur";
        g1.place = "Bandri";
        g1.age = 70;
        parent p1 = new parent();
        p1.surname = "thakur";
        p1.haircolor = "Red";
        child c1 = new child();
        c1.surname = "Thakur";
        c1.height = 72;
        System.out.println(g1.surname);
        System.out.println(p1.haircolor);
        System.out.println(c1.height);
    }
}

class grandParent {

    String surname;
    String place;
    int age;
}

class parent extends grandParent {

    String haircolor;
}

class child extends parent {

    String eyecolor;
    int height;
}
