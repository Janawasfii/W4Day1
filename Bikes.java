public class Bikes implements Vehicle{
    private String brand;
    private int hour;
    public Bikes(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }
    public String getBrand() {
        return brand;
    }
    public int getHour() {
        return hour;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setHour(int hour){
        this.hour = hour;
    }


    public double calculateRentalCost(){
        return 10.0*hour;
    }
    public void displayDetails(){
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: 10.0$");
        System.out.println("Rental Cost: "+ calculateRentalCost());


    }

}
