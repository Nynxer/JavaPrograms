class A {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class B extends A {
    public void p(double i) {
        System.out.println(i);
    }

}

public class functionOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        B b = new B();
        b.p(10);
        b.p(10.0);
    }

}
