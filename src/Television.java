class Television{
         private int volume;
         private int channel;
         private String  currentState;
         private int increaseVolume;
         private int decreaseVolume;
         private int changeChannel;
         private String  turnOnOff;


          Television(int volume,int channel,String  currentState,int increaseVolume, int decreaseVolume, int changeChannel,String  turnOnOff){

            this.volume=volume;
            this.channel=channel;
            this.currentState=currentState;
            this.increaseVolume=increaseVolume;
            this.decreaseVolume=decreaseVolume;
            this.changeChannel=changeChannel;
            this.turnOnOff=turnOnOff;
          
      }
  
          public String turnOnOff(){
              
              if(currentState==turnOnOff)
              return("turnOn");
              else
              return("turnOff");
             

       }


          public int increaseVolume(){
               volume=volume+increaseVolume;
               return(volume);
      }
         
          public int decreaseVolume(){
              volume=volume-decreaseVolume;
               return(volume);
         
      }
 


           public int changeChannel(){
           
              channel=changeChannel;
              return(channel);
          }
      




           public  void showDetails(){
            
             System.out.println("Cureent State="+turnOnOff());
             System.out.println("Current Channel="+channel);
             System.out.println("Current Voulme="+volume);
         
       }


  

      




}