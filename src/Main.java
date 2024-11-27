package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rover rover = new Rover();
        Command moveForward = new MoveForwardCommand(rover);
        Command moveBackward = new MoveBackwardCommand(rover);
        Command turnLeft = new TurnLeftCommand(rover);
        Command turnRight = new TurnRightCommand(rover);

        MissionController controller = new MissionController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Contrôle du rover :");
        System.out.println("- f : avancer");
        System.out.println("- b : reculer");
        System.out.println("- l : tourner à gauche");
        System.out.println("- r : tourner à droite");
        System.out.println("- q : quitter");

        boolean running = true;

        while (running) {
            System.out.print("Entrez une commande : ");
            String input = scanner.nextLine();

            switch (input) {
                case "f":
                    controller.executeCommand(moveForward);
                    break;
                case "b":
                    controller.executeCommand(moveBackward);
                    break;
                case "l":
                    controller.executeCommand(turnLeft);
                    break;
                case "r":
                    controller.executeCommand(turnRight);
                    break;
                case "q":
                    running = false;
                    System.out.println("Fin du contrôle.");
                    break;
                default:
                    System.out.println("Commande inconnue. Essayez f, b, l, r ou q.");
            }
        }
        scanner.close();
    }
}
