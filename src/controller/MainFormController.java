package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/EncryptionForm.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Encrypt");
        stage.centerOnScreen();
        stage.initOwner(this.root.getScene().getWindow());
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }

    public void btnDecrypt_OnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/DecryptionForm.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Decrypt");
        stage.centerOnScreen();
        stage.initOwner(this.root.getScene().getWindow());
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }
}
