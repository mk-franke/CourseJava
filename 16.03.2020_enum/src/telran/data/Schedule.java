package telran.data;

public class Schedule {

    private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek(){
        return dayOfWeek;
    }

    public void setDayOfWeek (DayOfWeek dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }

    public void wakeUp(){
      if(this.getDayOfWeek().ordinal() >= 5){
          System.out.println("You can sleep more!");
      } else {
          System.out.println("Wake up!");
      }
    }

    public void getMenu(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Gulyash");
                break;
            case TUESDAY:
                System.out.println("Spagetti");
                break;
            case WEDNESDAY:
                System.out.println("Meat Stew");
                break;
            case THURSDAY:
                System.out.println("Fish");
                break;
            case FRIDAY:
                System.out.println("Meat");
                break;
        }
    }

}
