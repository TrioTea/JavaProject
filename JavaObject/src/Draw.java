class Shape {
    public void draw() {

    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}
