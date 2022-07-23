package poly_and_interface;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 2:28
 */


class Shape{
    //省略了属性
    public void draw(){
        System.out.println("画图形！");
    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("●");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("▲");
    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}





public class Poly {
    //多态的优缺点


    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {

        Shape cycle = new Cycle();
        Shape rect = new Rect();
        Shape triangle = new Triangle();
        drawMap(cycle);
        drawMap(rect);
        drawMap(triangle);

        drawMap(new Flower());

    }
}
