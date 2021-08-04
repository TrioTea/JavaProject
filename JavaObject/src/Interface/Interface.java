package Interface;

interface IShape {
    void draw();

    default void func() {
        System.out.println("我是默认方法的调用");
    }
}

class Cycle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

public class Interface {
    public static void drawMap(IShape iShape) {
        iShape.draw();
        iShape.func();
    }

    public static void main(String[] args) {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        drawMap(rect);
        drawMap(cycle);
    }
}


