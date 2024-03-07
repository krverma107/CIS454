import java.util.ArrayList;

public class Consumer extends User {
    private ArrayList<Object> consumerHistory;

    public Consumer(String name, String password, String username, String email) {
        super(name, password, username, email);
        this.consumerHistory = new ArrayList<>();
    }

    //returns consumer history
    public ArrayList<Object> getConsumerHistory() {
        return consumerHistory;
    }

    //appends new order object to consumer history (presumably order but can be changed if need be)
    public void addConsumerHistory(Object order) {
        consumerHistory.add(order);
    }
}

