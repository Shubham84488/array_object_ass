public class overloading{
    public  void area(double side){
        System.out.println("Area of cube is "+side*side*side);
    }
    public void area(double r,double h){
        System.out.println("Area of cylinder is "+2*Math.PI*r*h);
    }
    public void area(double l,double b,double h){
        System.out.println("Area of cuboid is "+ 2*(l*b+b*h+h*l));
    }


    public static void main(String[] args) {
        overloading obj = new overloading();
        int l=3;
        int b=4;
        int h = 1;

        double side= 2.5;

        double rad=3.5;
        double height= 7;

        obj.area(l,b,h);
        obj.area(side);
        obj.area(rad, height);

    }
}