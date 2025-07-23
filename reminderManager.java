

import java.util.ArrayList;

public class reminderManager {
    ArrayList<Event>arr;

    public reminderManager() {
        arr = new ArrayList<>();
    }
    public void addEvent(Event e) {
        arr.add(e);
        System.out.println("Event added successfully.");
    }

    public void viewEvents() {
        if (arr.isEmpty()) {
            System.out.println("No events found.");
        }
        for (int i = 0;i<arr.size();i++) {
            System.out.println((i+1) + ". " + arr.get(i).getitle());
            System.out.println("   Description: " + arr.get(i).getDescription());
        }
    }
    public void showEventAlreadyHappened() {
        if(arr.isEmpty()) {
            System.out.println("No events found.");
        }
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i).getEventStatus()) {
                System.out.println((i+1) + ". " + arr.get(i).getitle() + " has already happened.");
                System.out.println("   Description: " + arr.get(i).getDescription());
            }
        }
    }

    public void uopdateEventStatus(int ind){
        arr.get(ind).setEventStatus(true);
    }

    public void deleteEvent(int ind) {
        if (ind < 0 || ind >= arr.size()){
            System.out.println("Not able to delete event. Invalid index.");
        }
        arr.remove(ind - 1);
        System.out.println("Event deleted successfully.");
    }
}