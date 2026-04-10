
abstract class Bank {

    //abstract method
    abstract void getInterestRate();

    //Non abstract method
    void welcomeNote() {
        System.out.println("Welcome");
    }
}

class PNB extends Bank {

    void getInterestRate() {
        System.out.println("PNB interest first is 6.5 %");
    }
}

class SBI extends Bank {

    void getInterestRate() {
        System.out.println("PNB interest first is 7.5 %");
    }
}

class Class1 {

    public static void main(String[] args) {
        Bank c1 = new PNB();
        c1.getInterestRate();
        Bank c2 = new SBI();
        c2.getInterestRate();
    }
}
