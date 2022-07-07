 class play_school {
     void three() {
         System.out.println("i am a school boy");
     }
 }


class school extends play_school {
    void two() {
        System.out.println("i am a play school boy");
    }
}


class high_school extends school {
    void one(){
        System.out.println("i am high school boy");
    }
        public static void main(String args[]){
            System.out.println("we are school children");
            high_school x = new high_school();
            x.two(); x.three(); x.one();
        }
     }

