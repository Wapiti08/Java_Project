abstract class Developer {
    public abstract void work(); //抽象函数。需要abstract修饰，并分号；结束
}

class JavaEE extends Developer {
    public void work() {
        System.out.println("Rewrite the abstract method");
    }
}

class Android extends Developer {
    public void work() {
        System.out.println("Rewrite the abstract method");
    }
}
