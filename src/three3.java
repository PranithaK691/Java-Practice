 class three3 {
    void cls3(){

        System.out.println("this is parent class");
    }
}

class two2 extends three3{
    void cls2(){
        System.out.println("child class1");
    }
}

class one1 extends three3{
    void cls4(){
        System.out.println("child class2");
    }
    public static void main(String args[]){
        System.out.println("hai");
        one1 t1 = new one1();
        t1.cls4();
        t1.cls3();
        two2 t2 = new two2();
        t2.cls2();
    }
}
