package com.example.mousemovement;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Pane pane;

    private boolean traceMouse = false;

    public void initialize() {
        this.progressBar.setProgress(0.0d);
        pane.setOnMouseMoved(e -> {
            if (traceMouse) {
                progressBar.setProgress(progressBar.getProgress() + 0.001);
            }
        });
    }

    public void clickedStart(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1) {
            traceMouse = true;
        }

    }

    public void clickedStop(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1) {
            traceMouse = false;
        }
    }
}