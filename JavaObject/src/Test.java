public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        /*
         Rect shape = new Rect();
         shape.draw();
         Cycle shape1 = new Cycle();
         shape1.draw();
         System.out.println("=========");
         drawMap(shape);
         drawMap(shape1);
        */
        Shape[] shapes = {new Rect(), new Cycle(), new Flower()};
        for (Shape shape : shapes
        ) {
            shape.draw();
            shape.fly();
        }
        System.out.println();
    }


    public static void main1(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.jump();
    }
}
