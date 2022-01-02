package Aggregation_Assignment_3;

public class Admin {
    public void assignRoom(Room[] room, Member m) {
        for(Room r : room){
            if(r.getCapacity() > 0 && r.getCapacity() <= 4){
            m.setRoom(r);
            r.setCapacity(r.getCapacity()-1);
            break;
            }
        }
    }
}