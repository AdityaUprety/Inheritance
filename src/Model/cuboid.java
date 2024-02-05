package Model;

public class cuboid extends rectangle {
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void area(){
        double area = 2 * (this.length * this.breadth) + (this.length * this.breadth) + (this.height * this.length);
        System.out.println(area);
    }

    public void volume(){
        double volume = this.length * this.breadth * this.height;
    }
}
