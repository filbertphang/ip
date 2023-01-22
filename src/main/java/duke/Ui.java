package duke;

import java.util.Scanner;

public class Ui {

    private Scanner scanner;
    private StringBuilder msg;
    private boolean isTerminating;
    private static final String DIVIDER = "____________________________________________________________";
    private static final String NEWL = "\n";
    private static final String LOGO = " ____        _        \n" + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n" + "| |_| | |_| |   <  __/\n" + "|____/ \\__,_|_|\\_\\___|\n";

    public Ui() {
        this.scanner = new Scanner(System.in);
        this.msg = new StringBuilder();
        this.isTerminating = false;
    }

    public void showWelcome() {
        this.addToMessage("Hello from");
        this.addToMessage(LOGO);
        this.addToMessage("Hello! I'm Duke.");
        this.addToMessage("What can I do for you?");
        this.displayMessage();
    }

    public void displayMessage() {
        Ui.prettyPrint(this.msg.toString());
        this.msg.setLength(0);
        if (!this.isTerminating) {
            System.out.print("> ");
        }
    }

    public void addToMessage(String toAdd) {
        this.msg.append(toAdd);
        this.msg.append(NEWL);
    }

    public void addToMessage(String toAdd, boolean isTerminating) {
        this.isTerminating = isTerminating;
        this.addToMessage(toAdd);
    }

    public String readCommand() {
        return this.scanner.nextLine();
    }

    public static void prettyPrint(String text) {
        System.out.println(DIVIDER);
        System.out.print(text);
        System.out.println(DIVIDER);
        System.out.println();
    }
}
