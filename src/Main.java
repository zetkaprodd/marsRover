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
        System.out.println("- z : avancer");
        System.out.println("- s : reculer");
        System.out.println("- q : tourner à gauche");
        System.out.println("- d : tourner à droite");
        System.out.println("- a : afficher la position");
        System.out.println("- e : afficher la direction");
        System.out.println("- f : quitter");

        boolean running = true;

        while (running) {
            System.out.print("Entrez une commande : ");
            String input = scanner.nextLine();

            switch (input) {
                case "z":
                    controller.executeCommand(moveForward);
                    break;
                case "s":
                    controller.executeCommand(moveBackward);
                    break;
                case "q":
                    controller.executeCommand(turnLeft);
                    break;
                case "d":
                    controller.executeCommand(turnRight);
                    break;
                case "a":
                    System.out.println(rover.getPosition());
                    break;
                case "e":
                    System.out.println(rover.getDirection());
                    break;
                case "f":
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
