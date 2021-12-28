package com.example.cowfarm;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;



public class HelloController {

    @FXML
    TextArea Textinfo;
    @FXML
    TextField TFid;
    @FXML
    TextField TFname;
    @FXML
    TextField TFage;
    @FXML
    TextField TFfarm;
    @FXML
    TextField TFili;
    @FXML
    TextField TFvac;
    @FXML
    TextField TFdell;

    ArrayList <Cows> arr = new ArrayList<>();


    public void onClick(ActionEvent actionEvent) {
        Textinfo.clear();
        for (Cows c: arr) {
            Textinfo.appendText("Номер: " + (c.getId()) + "\n");
            Textinfo.appendText("Имя: " + c.getName() + "\n");
            Textinfo.appendText("Возраст: " + (c.getAge()) + "\n");
            Textinfo.appendText("Ферма на которой находится корова: " + c.getFarm() + "\n");
            Textinfo.appendText("Сведения о болезнях: " + c.getIllness() + "\n");
            Textinfo.appendText("Сведения о вакцинации: " + c.getVaccinations() + "\n");
            Textinfo.appendText("=============================\n");

        }

    }

    public void NewCow() {
        arr.add(new Cows(Integer.valueOf(TFid.getText()),TFname.getText(),Integer.valueOf(TFage.getText()),
               TFfarm.getText(), TFili.getText(), TFvac.getText()));

        TFid.clear();
        TFname.clear();
        TFage.clear();
        TFfarm.clear();
        TFili.clear();
        TFvac.clear();
    }
    public void DellCow(){
        for (Cows c:arr) {
            if (c.getName().equals(TFdell.getText())){
                arr.remove(c);
            }
        }

    }
    public void onClicknew(ActionEvent actionEvent) {
        NewCow();
    }
}
