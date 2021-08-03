abstract class Shape {
    public abstract void draw();

   public void fly(){
       System.out.println("抽象类里面的非抽象方法");
   }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}