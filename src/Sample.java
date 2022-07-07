//public class Sample {
//    Sample(int a) {
//        System.out.print("hai, ");
//    }
//
//    Sample(int a, double b) {
//        this(2);
//        System.out.print("hell0 ");
//    }
//
//    Sample(int a, char c, double b) {
//        this(2, 11.8);
//        System.out.print("Pranitha");
//    }
//
//    public static void main(String args[]) {
//        new Sample(1, 'a', 6.8);
//    }
//-----------------------------------------------//

public class Sample{
    public static void main(String[] args){
//        One oneObj = new One();
//        Two twoObj = new Two();
//
//        oneObj.OneFun();
//        twoObj.TwoFun();
//        twoObj.OneFun();
        Three threeObj = new Three();
        System.out.println(threeObj.a);
        threeObj.OneFun();
        threeObj.TwoFun();
        threeObj.ThreeFun();

    }

    public static class One{
        public static int a = 10;

        public static void OneFun(){
            System.out.println("I am in one function");
        }
    }

    public static class Two extends One{
        public static void TwoFun(){
            System.out.println("I am in Two function");
        }
    }
    public static class Three extends Two{
        public static void ThreeFun(){
            System.out.println("I am in three");
        }
    }
}


