import java.util.Scanner;

public class CeilingFanProject {
    public static void main(String[] args) {

        // Scanner creation for user input
        Scanner sc = new Scanner(System.in);
        // Var dec
        int userInput;

        // CeilingFan object creation
        CeilingFan Fan = new CeilingFan();
        do {
            System.out.println("Make a selection using numbers 1 to 4");
            System.out.println("1: Check Fan Status");
            System.out.println("2: Increase Fan Speed");
            System.out.println("3: Change Fan Spin Direction");
            System.out.println("4: Exit");
            System.out.println("Enter Your Input: ");
            userInput = sc.nextInt();
            if (userInput == 1) {
                Fan.CheckStatus(); // This method call prints to the console
            } else if (userInput == 2) {
                Fan.IncreaseSpeed(); // CORD 1 PULL
            } else if (userInput == 3) {
                Fan.ToggleDirection(); // CORD 2 PULL
            }

        } while (userInput <= 3);

    }
}

class CeilingFan {
    private int speed = 0;
    private String speed_str = "OFF";
    private boolean direction = true;

    public void IncreaseSpeed() {
        // Datatype: (void) -> void
        // CORD 1: SPEED MANIPULATION
        // Description: Increment speed by 1.
        speed++;

    }

    public void ToggleDirection() {
        // Datatype: (void) -> void
        // CORD 2: DIRECTION MANIPULATION
        // Toggle boolean value
        direction = !direction;
    }

    public String GetDirection() {
        // Datatype: (void) -> str
        // Get method to return direction of fan

        // Boolean direction true => clockwise spin
        if (direction == true) {
            return ("Clockwise");
        }
        // Boolean direction false => counter clockwise spin
        else {
            return ("Counter Clockwise");
        }
    }

    public void CheckStatus() {
        // Datatype: (void) -> void
        // Description: USED TO CHECK STATUS OF FAN BY PRINTING STATUS OF SPEED AND SPIN
        // DIRECTION ONTO THE CONSOLE

        // Var assignment
        String directionStr = GetDirection();

        // Check if speed is exceeding maximum; if so, then set speed to off
        if (speed > 3) {
            speed = 0;
        }

        // Check and assign string values to current speed setting of fan
        if (speed == 0) {
            speed_str = "OFF";
        } else if (speed == 1) {
            speed_str = "LOW";
        } else if (speed == 2) {
            speed_str = "MED";
        } else if (speed == 3) {
            speed_str = "HI";
        }
        // Print status of fan speed and direciton
        System.out.println("Fan Speed is: " + speed + " " + speed_str + ". With a direction of " + directionStr);
    }
}
