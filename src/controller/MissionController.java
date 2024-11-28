package src.controller;

import src.command.Command;

public class MissionController {

    public void executeCommand(Command command) {
        command.execute();
    }
}