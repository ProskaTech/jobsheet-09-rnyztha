
package jobsheet9;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class Elevator {
    public boolean doorOpen = false;
    public int currentFloor = 5;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;
    
    public void openDoor(){
        System.out.println("Opening Door. ");
        doorOpen = true;
        System.out.println("Door Is ");
        
    }
    public void closeDoor(){
        System.out.println("Closing Door. ");
        doorOpen = false;
        System.out.println("Door Is Close. ");
    }
    public void goUp(){
        System.out.println("Going up one floor. ");
        currentFloor++;
        System.out.println("Floor :" +currentFloor);
    }
    public void goDown(){
        System.out.println("Going Down one floor. ");
        currentFloor--;
        System.out.println("Floor :" +currentFloor);
    }
    public void setFloor(int desiredFloor){
        while(currentFloor != desiredFloor){
            if(currentFloor < desiredFloor) {
                goUp();
            }
            else{
                goDown();
            }
        }
    }
    public int getFloor(){
        return currentFloor;
    }
    public boolean checkDoorStatus(){
        return doorOpen;
    }
}
