
abstract class RBI {

    abstract void interestRate();

    abstract void interestOnRd();
}

class PNB extends RBI {

    void interestRate() {
        System.out.println("8 % on home loan");
    }

    void interestOnRd() {
        System.out.println("8.5 % on home loan");
    }
}

class SBI extends RBI {

    void interestRate() {
        System.out.println("6 % on home loan");
    }

    void interestOnRd() {
        System.out.println("6.5 % on home loan");
    }
}

class Main3 {

    public static void main(String[] args) {
        PNB c1 = new PNB();
        c1.interestRate();
        c1.interestOnRd();
        SBI c2 = new SBI();
        c2.interestRate();
        c2.interestOnRd();
    }
}
