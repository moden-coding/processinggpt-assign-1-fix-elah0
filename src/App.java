import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings() {
        
        size(400, 400);
}
    public void setup() {
        background(100, 150, 200);
        fill(153, 190, 130);
        stroke(50, 50, 50);
        strokeWeight(3);
        rect(50, 50, 150, 100);
        fill(100, 190, 130);
        stroke(10, 30, 10);
        strokeWeight(4);
        ellipse(300, 100, 100, 100);
        line(50, 100, 350, 100);
}
}
