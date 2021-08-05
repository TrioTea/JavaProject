public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.live();
    }
}

class Animal {
    String name;
}

interface Live {
    void live();
}

interface Run {
    void run();
}

class Bird extends Animal implements Live, Run {
    @Override
    public void live() {
        System.out.println("我有生命！");
    }

    @Override
    public void run() {
        System.out.println("我会跑！");
    }
}