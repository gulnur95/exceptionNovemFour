public class Parallelepiped {


    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height)throws InvalidInputException{
        if( length <=0 ||  width <= 0 ||  height <=0){
            throw new InvalidInputException("Параллелепипеддин параметрлери терс сан же нөл боло албайт.");
        }
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public double calculateSurfaceArea(){
        return 2 * ((height * length) + (length * width) + (height * width));

    }

    public double calculateVolume(){
        return (length * width * height);
    }








}
