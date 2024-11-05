import static java.lang.Math.PI;



public class Cylinder {

    private double radius, height;

    public Cylinder(double radius, double height) throws InvalidInputException{
        if(radius <= 0 || height <=0 ){
           throw new InvalidInputException("Цилиндрдин параметрлери терс сан же нөл боло албайт.");

        }
        this.radius = radius;
        this.height = height;
    }

    public double calculateSurfaceArea(){
        return 2 * Math.PI * radius * (height + radius);
    }

    public double calculateVolume(){
        return Math.PI * radius * radius * height;
    }




}
