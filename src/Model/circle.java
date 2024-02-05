package Model;

public class circle{
    double pi = 3.14;
    int radius;
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area(){
        double area = this.pi * ((this.radius)*(this.radius));
        System.out.println(area);
    }

}
