package javafxtutorial;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Represents a dialog box containing a speaker's image and message.
 */
public class DialogBox extends HBox {
    private final Label text;
    private final ImageView displayPicture;

    /**
     * Creates a dialog box containing the given message and image.
     *
     * @param message message displayed in the dialog box.
     * @param image image displayed beside the message.
     */
    public DialogBox(String message, Image image) {
        text = new Label(message);
        displayPicture = new ImageView(image);

        text.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);
        setAlignment(Pos.TOP_RIGHT);
        getChildren().addAll(text, displayPicture);
    }

    /**
     * Flips the dialog box so that the image is on the left and text is on the right.
     */
    private void flip() {
        setAlignment(Pos.TOP_LEFT);
        ObservableList<Node> children = FXCollections.observableArrayList(getChildren());
        FXCollections.reverse(children);
        getChildren().setAll(children);
    }

    /**
     * Creates a dialog box for a user's message.
     *
     * @param message user message displayed in the dialog box.
     * @param image user image displayed beside the message.
     * @return dialog box aligned for a user message.
     */
    public static DialogBox getUserDialog(String message, Image image) {
        return new DialogBox(message, image);
    }

    /**
     * Creates a dialog box for Duke's response.
     *
     * @param message Duke's response displayed in the dialog box.
     * @param image Duke's image displayed beside the response.
     * @return dialog box aligned for a Duke response.
     */
    public static DialogBox getDukeDialog(String message, Image image) {
        DialogBox dialogBox = new DialogBox(message, image);
        dialogBox.flip();
        return dialogBox;
    }
}
