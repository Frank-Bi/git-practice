import java.util.Scanner;

public class Controller{

    public static Scanner scanner = new Scanner(System.in);
    public static String input;

    /*public static void takeInput(){
        input = "";
        while (!input.equals("stop")) {
            input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "forward":
                    Robot.left.setSpeed(1);
                    Robot.right.setSpeed(1);
                    break;
                case "backward":
                    Robot.left.setSpeed(-1);
                    Robot.right.setSpeed(-1);
                    break;
                case "left":
                    Robot.left.setSpeed(-1);
                    Robot.right.setSpeed(1);
                    break;
                case "right":
                    Robot.left.setSpeed(1);
                    Robot.right.setSpeed(-1);
                    break;
                case "stop":
                    Robot.left.setSpeed(0);
                    Robot.right.setSpeed(0);
                    break;
                default:
                    System.out.println("BZZ");
                    break;
            }
        }
    }//end takeInput()
    */

    public static String takeInput(){
        input = "";
            input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "forward":
                    return "forward";
                case "backward":
                    return "backward";
                case "left":
                    return "left";
                case "right":
                    return "right";
                case "stop":
                    return "stop";
                default:
                    return "error";
            }
    }//end String takeInput()
}//end Controller