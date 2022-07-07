//constructors created inside class
//constructors have same as class name
//constructors don't have return type



public class car {
    int wheels_count;
    int number_of_seats;
    int window;

    public car(){
        wheels_count = 4;
        number_of_seats = 4;
    }

    public car(int number) {
        number_of_seats = 5;
    }

    public car(int a, int b){
        wheels_count = a;
            number_of_seats = b;

        }


    public void start(){
        System.out.println("Car is starting");
    }

    public static void main(String args[])
    {
//        car c1 = new car();
////        c1.wheels_count = 4;
////        c1.number_of_seats =4;
//        c1.window = 6;
//        System.out.println(c1.wheels_count);
//        System.out.println(c1.number_of_seats);
//        System.out.println(c1.window);
//
//    System.out.println("*********");
//        car c2 = new car();
////        c2.wheels_count = 4;
////        c2.number_of_seats =4;
//        c2.window = 4;
//        System.out.println(c2.wheels_count);
//        System.out.println(c2.number_of_seats);
//        System.out.println(c2.window);

//        car c1 = new car(6);// this will call which constructor having "int" type parameters
//
//        c1.window = 6;
//        System.out.println(c1.wheels_count);//thereis no int type constructor so, o/p-0
//        System.out.println(c1.number_of_seats);
//        System.out.println(c1.window);

        car c3 = new car(6, 4);
        c3.window = 6;
        System.out.println(c3.wheels_count);
        System.out.println(c3.number_of_seats);
        System.out.println(c3.window);
    }
}
