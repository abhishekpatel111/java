class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Hnda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda hnda= new Hnda();  
   hnda.run();  
   }  
}  