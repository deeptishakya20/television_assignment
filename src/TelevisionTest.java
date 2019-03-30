class TelevisionTest{
public static void main(String args[]){
             
       Television obj=new Television(23,102,"turnOff",3,10,115,"turnOff");

       System.out.println("Tv="+obj.turnOnOff());
       System.out.println("Increased Volume="+ obj.increaseVolume());
       System.out.println("Decreased Volume="+ obj.decreaseVolume());
       System.out.println("Changed Channel="+ obj.changeChannel());
       obj.showDetails();
      



   }

}