//Single Inheritance code
// class MainCode2 {
//     public static void main(String[] args) {
//         child c1 = new child();
//         c1.name = "Meghraj";
//         c1.age = 22;
//         c1.gender = "M";
//         c1.place = "Puna";
//         c1.motername = "Suman";
//         System.out.println(c1.motername);
//         System.out.println(c1.age);
//         System.out.println(c1.name);
//         System.out.println(c1.gender);
//     }
// }
// class Parent {
//     String name;
//     int age;
//     String gender;
//     String place;
// }
// class child extends Parent {
//     String motername;
// }

///
//
//




// HEIRARICAL INHERITANCE
// class MainCode2 {

//     public static void main(String[] args) {
//         Parent p = new Parent();
//         Child1 c1 = new Child1();
//         Child2 c2 = new Child2();
//         Child3 c3 = new Child3();
//         p.name = "Deshraj";
//         c1.name = "Meghraj";
//         c2.name = "Ajay";
//         c3.name = "Sudha";
//         c1.study = "BA";
//         c2.eyeColor = "Black";
//         c3.clothColor = "Red";
//         System.out.println(p.name);
//         System.out.println(c1.name + " " + c1.study);
//         System.out.println(c2.name + " " + c2.eyeColor);
//         System.out.println(c3.name + " " + c3.clothColor);
//     }
// }

// class Parent {

//     String name;
//     int age;
//     String gender;
//     String place;
// }

// class Child1 extends Parent {

//     String study;
// }

// class Child2 extends Parent {

//     String eyeColor;
// }

// class Child3 extends Parent {

//     String clothColor;
// }
//
//
//
//
//
//
//
//
// MULTILEVEL INHERITANCE
// class MainCode2 {

//     public static void main(String[] args) {
//         Child c1 = new Child();
//         c1.name = "Megha";
//         c1.age = 23;
//         c1.study = "MCA";
//         System.out.println(c1.name);
//         System.out.println(c1.age);
//         System.out.println(c1.study);
//     }
// }

// class grandParent {

//     String name;
//     int age;
//     String gender;
//     String place;
// }

// class Parent extends grandParent {

//     String eyeColor;
// }

// class Child extends Parent {

//     String study;
// }

