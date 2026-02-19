public abstract class Admin extends User {
    public Admin(){
        super();

    }

    @Override
    public void showList(){
        System.out.println("\n.1 Add new car");
        System.out.println("2. View cars");
        System.out.println("3. Update cars");
        System.out.println("4. Delete cara ");
        System.out.println("5.Add New Admin ");
        System.out.println("6. Show rents ");
        System.out.println("7. Quit\n ");
    }
}
