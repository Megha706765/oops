//Encapsulation

class PracticeOOPS {

    public static void main(String[] args) {
        Kids k1 = new Kids();
        k1.name = "Megha";
        k1.age = 7;
        k1.Place = "Bandri";
        k1.setFabColor("Red");
        k1.setFabFood("Masosa");
        k1.setToys("Car");
        System.out.println(k1.name);
        System.out.println(k1.age);
        System.out.println(k1.Place);
        System.out.println(k1.getFabColor());
        System.out.println(k1.getFood());
        System.out.println(k1.getToys());

    }
}

class Parent {

    String name;
    int age;
    String Place;
}

class Child extends Parent {

    private String fabcolor;
    private String Food;

    public void setFabColor(String fabcolor) {
        this.fabcolor = fabcolor;
    }

    public String getFabColor() {
        return fabcolor;
    }

    public void setFabFood(String Food) {
        this.Food = Food;
    }

    public String getFood() {
        return Food;
    }
}

class Kids extends Child {

    private String toys;

    public void setToys(String toys) {
        this.toys = toys;
    }

    public String getToys() {
        return toys;
    }
}
