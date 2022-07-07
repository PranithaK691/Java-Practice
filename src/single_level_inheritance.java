
class  three{
         void school() {
             System.out.println("Pranitha,");
         }
     }

     class two extends three {
         void play() {
             System.out.print("how are you");
         }
         public static void main(String args[])
         {
             System.out.print("hi ");
             two x = new two();
             x.school();
             x.play();
         }
     }

