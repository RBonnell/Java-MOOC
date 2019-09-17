import java.util.Scanner;
/**
 *
 * @author 358721
 */
public class UserInterface {
    
    private Scanner reader;
    private PhoneBook phoneBook;
    
    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.phoneBook = new PhoneBook();
    }
    
    public void start() {
        printOperations();
        getCommands();
    }
    
    public void printOperations() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }
    
    public void getCommands(){
        while (true) {
            System.out.print("\ncommand: ");
            String command = reader.nextLine();
            if (command.equals("x")){
                break;
            } 
            else if (command.equals("1")){
                addNumber();
            } 
            else if (command.equals("2")){
                getNumber();
            } 
            else if (command.equals("3")){
                getNameByNumber();
            } 
            else if (command.equals("4")){
                addAddress();
            } 
            else if (command.equals("5")){
                getPersonalInfo();
            } 
            else if (command.equals("6")){
                deletePersonalInfo();
            } 
            else if (command.equals("7")){
                getFilteredListing();
            }
        }
    }

    private void addNumber(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        
        phoneBook.addNumber(name, number);
    }

    private void getNumber(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        
        phoneBook.getNumberByName(name);
    }

    private void getNameByNumber(){
        System.out.print("number: ");
        String number = reader.nextLine();
        phoneBook.getNameByNumber(number);
    }

    private void addAddress(){
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        phoneBook.addAddress(name, street, city);
    }

    private void getPersonalInfo(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        phoneBook.getPersonalInfo(name);
    }

    private void deletePersonalInfo(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        phoneBook.deletePersonalInfo(name);
    }

    private void getFilteredListing(){
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        phoneBook.filteredListing(keyword);
    }
}