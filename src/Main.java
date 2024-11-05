import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

         /*         LMS      Task  Exception       LMS
     Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
     Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
     берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
     Бардык Exception дор логикасы main класста жазылcын
     Бардык маалмыттар консоль аркылуу берилсин
     Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек. */


        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Choose next:    1 - parallelepiped    2 - cylinder");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Write:  length  width  height  ");
                    double length = getDoubleInput(scanner);
                    double width = getDoubleInput(scanner);
                    double height = getDoubleInput(scanner);

                    Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                    System.out.println("Параллелепипеддин аянты: " + parallelepiped.calculateSurfaceArea());
                    System.out.println("Параллелепипеддин көлөмү: " + parallelepiped.calculateVolume());

                }break;
                case 2: {
                    System.out.println("Write:  radius  height ");
                    double radius = getDoubleInput(scanner);
                    double height = getDoubleInput(scanner);

                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println("Цилиндрдин аянты: " + cylinder.calculateSurfaceArea());
                    System.out.println("Цилиндрдин көлөмү: " + cylinder.calculateVolume());
                }break;
                default:
                    System.out.println("Мындай вариант жок !");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ката: Киргизилген маалымат сан эмес.");
        } catch (InvalidInputException e) {
            System.out.println("Ката: " + e.getMessage());
        } finally {
            scanner.close();
        }




    }




    private static double getDoubleInput(Scanner scanner) throws InvalidInputException {
        try {
            double value = scanner.nextDouble();
            if (value <= 0) {
                throw new InvalidInputException("Маалымат терс сан же нөл боло албайт.");
            }
            return value;

        } catch (InputMismatchException e) {
            scanner.next();
            throw new InvalidInputException("Киргизилген маалымат сан эмес.");
        }
    }








        /*                  Task 1
        Эгерде берилген сан, квадрат эмес болсо, анда Exception ыргытыңыз.
        (4, 9, 16 бул сандар 2, 3, 4 сандарынын квадраты болуп саналат.
         */

//        while(true) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Write number:  ");
//            int number = scanner.nextInt();
//            if (number % Math.sqrt(number) != 0) {
//                throw new RuntimeException();
//            } else {
//                System.out.println(Math.sqrt(number));
//            }
//        }


//                example 3
//        while (true) {
//                try {
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("Number 1 :  ");
//                    int number1 = scanner.nextInt();
//                    System.out.println("Number 2 :  ");
//                    int number2 = scanner.nextInt();
//                 System.out.println(number1 / number2);
//                }catch (InputMismatchException e) {
//                    System.out.println(" Required suitable variable !");
//                }catch (ArithmeticException exception){
//                    System.out.println("Cannot divided by zero!");
//                }finally {
//                    System.out.println(" Operation is over!");
//                }
//        }


//              example 2
//            while (true) {
//                try {
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("Number 1 :  ");
//                    int number1 = scanner.nextInt();
//                    System.out.println("Number 2 :  ");
//                    int number2 = scanner.nextInt();
//                 System.out.println(number1 / number2);
//                }catch (InputMismatchException | ArithmeticException e) {
//                    System.out.println(e.getMessage());
//
//                }


    //       example 1

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if(number <= 0){
//            throw new RuntimeException();
//        }


//            example 0
//            try {
//                int m = scanner.nextInt();
//                int n = scanner.nextInt();
//                System.out.println(m / n);
//            } catch (InputMismatchException | ArithmeticException e) {
//                System.out.println(e.getMessage());
//            }
//
//




//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Эсептегиңиз келген фигураны тандаңыз (1 - Параллелепипед, 2 - Цилиндр): ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1 -> {
//                    System.out.println("Параллелепипеддин узундугун, туурасын жана бийиктигин киргизиңиз:");
//                    double length = getDoubleInput(scanner);
//                    double width = getDoubleInput(scanner);
//                    double height = getDoubleInput(scanner);
//
//                    Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
//                    System.out.println("Параллелепипеддин аянты: " + parallelepiped.calculateSurfaceArea());
//                    System.out.println("Параллелепипеддин көлөмү: " + parallelepiped.calculateVolume());
//                }
//                case 2 -> {
//                    System.out.println("Цилиндрдин радиусун жана бийиктигин киргизиңиз:");
//                    double radius = getDoubleInput(scanner);
//                    double height = getDoubleInput(scanner);
//
//                    Cylinder cylinder = new Cylinder(radius, height);
//                    System.out.println("Цилиндрдин аянты: " + cylinder.calculateSurfaceArea());
//                    System.out.println("Цилиндрдин көлөмү: " + cylinder.calculateVolume());
//                }
//                default -> System.out.println("Туура эмес тандоо жасалды.");
//            }
//
//        } catch (InvalidInputException e) {
//           System.out.println("Ката: " + e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("Ката: Киргизилген маалымат сан эмес.");
//        } finally {
//            scanner.close();
//        }

}
