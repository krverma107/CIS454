public class Donor extends User{
    
    LinkedList donatedList;
    int donatedFunds; 

    public void addToDonatedList(Stock stock){
        donatedList.insert(stock);
    }

    public void getDonatedList(){
        donatedList.display();
    }

    public void getFunds(){
        return donatedFunds;
    }


    public void donateStock(Stock stock, Pantry pantry){
        // updates donors donated list

        // updates pantry's stock
        addToDonated(stock);
    }

    public void donateFunds(int funds, Pantry pantry){
        // updates donors donated funds

        // updates pantry's funds

    }

}
