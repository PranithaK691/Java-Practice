class clss1 {
    clss1(){
        System.out.println("hai");
    }
}

class clss2 extends clss1 {
    clss2(){
        System.out.println("hello");
    }
}

class clss3 extends clss2 {
    clss3() {
        System.out.println("hw r u?");
    }
    public static void clss3_mt() {
        System.out.println("hw r u?");
    }
}
class clss4 {
    public static void main(String args[]) {
        clss3 c4 = new clss3();//or new clss3();
        c4.clss3_mt();
//        new clss3();
    }
}