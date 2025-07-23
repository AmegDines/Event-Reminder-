
import java.util.Scanner;       
import java.time.LocalDate;

public class Execute{
    public static void main(String[] args){
        reminderManager rm = new reminderManager();
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("**** Event Menu ****");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Show Events that have already happened");
            System.out.println("4. Remove Event");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    String t = sc.nextLine();
                    String d = sc.nextLine();
                    rm.addEvent(new Event(t, d, LocalDate.parse(date, formatter)));
                    rm.addEvent(new Event(t,d,LocalDate(date)));
                    break;
                case 2:
                    rm.viewEvents();
                    break;
                case 3:
                    rm.showEventAlreadyHappened();
                    break;
                case 4:
                    rm.viewEvents();
                    int ind = sc.nextInt();
                    rm.deleteEvent(ind);
                    break;
                case 5:
                    return;
                default:
                    System.out.println(x:"Not a valid input!");
                    break;
    
            }
        }
        sc.close();
    }
}