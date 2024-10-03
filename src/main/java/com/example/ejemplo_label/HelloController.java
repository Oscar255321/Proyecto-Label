package com.example.ejemplo_label;

import javafx.animation.FillTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private Label fancyLabel;

    @FXML
    public void handleChangeText(ActionEvent actionEvent)
    {
        // Cambiar el texto del Label
        fancyLabel.setText("¡Texto cambiado con éxito!");
        // Aplicar animación para cambiar el color del texto

    }
}