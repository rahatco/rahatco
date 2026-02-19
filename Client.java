public abstract class Client extends User {
    public Client(){
        super();

    }

    @Override
    public void ShowList(){
        System.out.println("\n.1 View cars ");
        System.out.println(" 2. Rent Cars");
        System.out.println("3. Return Cars ");
        System.out.println("4. Edit My data");
        System.out.println("5. Shoe my Rents ");
        System.out.println("6.Quits\n");

    }
}
