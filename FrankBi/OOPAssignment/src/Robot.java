public class Robot {//Main class

    public static Motor left = new Motor(1);
    public static Motor right = new Motor(2);
    public static Controller controller = new Controller();
    public static String signal = "";

    public static void main(String[] args) {
        System.out.println("PROGRAM IS RUNNING");
        //controller.takeInput();

        while (!signal.equals("stop")) {
            signal = controller.takeInput();

            switch (signal) {
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
                    System.out.println("AAAAAA");
                    break;
            }
        }

    }//end main

}//end Robot