package javafxtutorial;

/**
 * Provides the command-line entry point for the starter Duke application.
 */
public class Duke {
    /**
     * Prints the starter greeting.
     *
     * @param args command-line arguments, which are not used.
     */
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     *
     * @param input user message received by Duke.
     * @return response generated from the user message.
     */
    public String getResponse(String input) {
        return "Duke heard: " + input;
    }
}
