public class Admin extends User {
    
    private List<String> pickUpTimes;

    public scheduleManager() {
        this.pickUpTimes = new ArrayList<>();
    }

    public List<String> addPickUpTimes(String time) {
        pickupTimes.add(time);
    }

    public void addStock(Stock stock, Pantry pantry){
        // update pantry stock

    }

}
