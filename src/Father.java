public class Father {
    public void show(){
        System.out.println("Father show");
    }
}

class Son extends Father {
    public void method() {
        System.out.println("Son method.");
    }

    public void show() {
        System.out.println("Son show.");
    }
}

class ExtendsTest {
    public static void main(String[] args) {
        Son s = new Son();
        s.method();
        s.show();
    }
}