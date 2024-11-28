package src.controller;

import src.command.Command;

public class MissionController {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(Command command) {
        command.execute();
    }
}