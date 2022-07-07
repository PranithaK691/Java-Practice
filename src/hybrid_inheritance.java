class first {
    void one(){
        System.out.println("this is parent class");
    }
}


class second  extends first{
    void two(){
        System.out.println("this is child class1");
    }
}

class third  extends second{
        void three(){
        System.out.println("this is child class12");
     }
}

class fourth extends first{
    void four(){
        System.out.println("this is child class of first parent class");
    }
    public static void main(String ars[]){
        System.out.println("hi");
        fourth f4 = new fourth();
        f4.four();
        f4.one();
        third f3 = new third();
        f3.three();
        f3.two();
    }
}

