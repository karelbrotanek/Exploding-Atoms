import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Okno {
    public void clickedGrid(javafx.scene.input.MouseEvent event) {
        Node clickedNode = event.getPickResult().getIntersectedNode();
        System.out.println(clickedNode.toString());
        Node parent = clickedNode.getParent();
        //while (parent != ) {
          //  clickedNode = parent;
            //parent = clickedNode.getParent();
        //}
        Integer col = GridPane.getColumnIndex(clickedNode);
        Integer row = GridPane.getRowIndex(clickedNode);
        System.out.println("souradnice: "+col+" "+row);
    }
}
