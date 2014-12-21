/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padhelper;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author TakeoMain
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private GridPane cardList;
    @FXML
    private Button submit;
    @FXML
    private TextField field;
    
    private int i = 0;
    private int j = 0;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        Image card = new Image("file:pad/" + field.getText() + ".png");
        System.out.println("Image Crated");
        ImageView img = new ImageView(card);
        if(j == 0)
        {
            cardList.getRowConstraints().add(new RowConstraints(45,45,45));
        }
        img.fitWidthProperty().bind(cardList.getColumnConstraints().get(0).prefWidthProperty());
        img.fitHeightProperty().bind(cardList.getRowConstraints().get(0).prefHeightProperty());
        cardList.add(img, j, i);
        
        if(j < 7)
        {
            j++;
        }
        else
        {
            j = 0;
            i++;
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
