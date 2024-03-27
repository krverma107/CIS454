public class Donor extends User{
    
    LinkedList donatedList;
    int donatedFunds; 

    public void getDonatedList(){
        donatedList.display();
    }

    public void getFunds(){
        return donatedFunds;
    }

    public void donateStock(Stock stock, Pantry pantry){
        // updates donors donated list
        donatedList.insert(stock);

        // updates pantry's stock
        pantry.addStock(stock);
    }

    public void donateFunds(int funds, Pantry pantry){
        // updates donors donated funds
        donatedFunds += funds;

        // updates pantry's funds
        pantry.addFunds(funds);
    }

}
