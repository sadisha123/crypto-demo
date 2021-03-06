package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.crypto.DEP7Crypto;


public class DecryptionFormController {
    public TextField txtCipherText;
    public TextField txtKey;
    public TextField txtText;

    public void btnDecrypt_OnAction(ActionEvent actionEvent) {
        String cipherText = txtCipherText.getText();
        String key = txtKey.getText();

        if(cipherText.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid cipher text", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        }

        if(key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }

        //text += key;
        //String reversedText ="";
        //for(int i = text.length() -1; i>= 0; i--){
        //    reversedText += text.charAt(i);
        //}
        //
        //String ciphertext = "";
        //for(int i=0; i<reversedText.length(); i++){
        //    int code= reversedText.charAt(i);
        //    code += 10;
        //    char newChar = (char) code;
        //    ciphertext += newChar;
        //}
        //
        //txtCipherText.setText(ciphertext);

        txtText.setText(DEP7Crypto.decrypt(cipherText, key));

    }
}
