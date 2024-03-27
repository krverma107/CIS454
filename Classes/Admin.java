public class Admin extends User {
    
    private List<String> pickUpTimes;

    public scheduleManager() {
        this.pickUpTimes = new ArrayList<>();
    }

    // Add pick up times in military time (e.g. 8:00, 12:00, 16:00)
    public List<String> addPickUpTimes(String time) {
        pickupTimes.add(time);
    }

    public void addStock(Stock stock, Pantry pantry){
        // update pantry stock

    }

}
