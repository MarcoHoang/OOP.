import java.util.Scanner;
import java.lang.Math;

public class FindX {
    public static void main(String[] args) throws Exception {
        System.out.println("What kind of equation that you want to solve?");
        System.out.println("Please choose a number from 1 to 4");

        try (Scanner in = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("1.The first-degree equation with one variable");
                System.out.println("2.The first-degree equation with two variables");
                System.out.println("3.The second-degree equation with one variables");
                System.out.println("4. Exit");
                choice = in.nextInt();

                switch (choice) {
                    case 1:
                        function1();
                        break;
                    case 2:
                        function2();
                        break;
                    case 3:
                        function3();
                        break;
                }

            } while (choice != 4);
        }
    }

    public static void function1() {
        System.out.println("Input a and b in function ax+b=0");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("x = " + -b / a);

    }

    public static void function2(){
        double a1, a2, b1, b2, c1, c2, D, D1, D2;

        Scanner in = new Scanner(System.in);

            System.out.println("Input a1, b1, c1 in function a1x+b1y=c1");
            a1 = in.nextDouble();
            b1 = in.nextDouble();
            c1 = in.nextDouble();
            System.out.println("Input a2, b2, c2 in function a2x+b2y=c2");
            a2 = in.nextDouble();
            b2 = in.nextDouble();
            c2 = in.nextDouble();

            D = a1*b2 - b1*a2;
            D1 = c1*b2 - b1*c2;
            D2 = a1*c2 - a2*c1;
        
        if (D != 0 ) {
            System.out.println("(x;y) = " + "(" + D1/D + ";" + D2/D + ")");
        }
        else{
            if (D1 == D2 && D1 == 0) {
                System.out.println("The system has infinitely many solutions");
            }
            else{
                System.out.println("The system has no solution");
            }
        }
    }

    public static void function3(){
        Scanner in = new Scanner(System.in);
            double a, b, c, delta, square_delta;
            System.out.println("Input a, b, c in function ax^2+bx+c=0");

            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            delta = b*b - 4*a*c;
            square_delta = Math.sqrt(delta);

            if (delta == 0) {
                System.out.println("The equation has double root: x1 = x2 = " + -b/(2*a));
            }

            if (delta > 0) {
                System.out.println("The equation has two distinct roots: x1 = " + (-b + square_delta)/(2*a) + " and x2 = " + (-b - square_delta)/(2*a));
            } else {
                System.out.println("The equation has no solution");
            }
        
    }
}
