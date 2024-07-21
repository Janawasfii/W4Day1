public class Trucks implements Vehicle {
    private String type;
    private int week;

    public Trucks(String type, int week) {
        this.type = type;
        this.week = week;
    }
    public String getType() {
        return type;
    }
    public int getWeek() {
        return week;
    }
    public void setWeek(int week){
        this.week = week;
    }
    public void setType(String type){
        this.type = type;
    }



   public double calculateRentalCost(){
        return week*500;
    }
  public void displayDetails(){
        System.out.println("Truks Type: " + type);
        System.out.println("Weekly Rental Rate: 500.0$ " );
        System.out.println("Renatl Cost: "+ calculateRentalCost());

    }

}
