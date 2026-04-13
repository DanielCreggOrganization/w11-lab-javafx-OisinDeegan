package ie.atu.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private int count = 0;
    private int currentNumber = 0;

    @Override
    public void start(Stage primaryStage) {
        // This method is where we'll begin building our UI
        // Create display
        Label countLabel = new Label("0");
        
        // Create buttons
        Button plusButton = new Button("+");
        Button minusButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
        Button oneButton = new Button("1");
        Button twoButton = new Button("2");
        Button threeButton = new Button("3");
        Button fourButton = new Button("4");
        Button fiveButton = new Button("5");
        Button sixButton = new Button("6");
        Button sevenButton = new Button("7");
        Button eightButton = new Button("8");
        Button nineButton = new Button("9");
        Button zeroButton = new Button("0");
        Button clearButton = new Button("C");
        Button equalsButton = new Button("=");
        
        // Add event handlers
        oneButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 1;
            countLabel.setText(String.valueOf(currentNumber));
        });
        twoButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 2;
            countLabel.setText(String.valueOf(currentNumber));
        });
        threeButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 3;
            countLabel.setText(String.valueOf(currentNumber));
        });
        fourButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 4;
            countLabel.setText(String.valueOf(currentNumber));
        });
        fiveButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 5;
            countLabel.setText(String.valueOf(currentNumber));
        });
        sixButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 6;
            countLabel.setText(String.valueOf(currentNumber));
        });
        sevenButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 7;
            countLabel.setText(String.valueOf(currentNumber));
        });
        eightButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 8;
            countLabel.setText(String.valueOf(currentNumber));
        });
        nineButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 9;
            countLabel.setText(String.valueOf(currentNumber));
        });
        zeroButton.setOnAction(e -> {
            currentNumber = currentNumber * 10 + 0;
            countLabel.setText(String.valueOf(currentNumber));
        });
        clearButton.setOnAction(e -> {
            currentNumber = 0;
            countLabel.setText(String.valueOf(currentNumber));
        });
        equalsButton.setOnAction(e -> {
            count = currentNumber;
            countLabel.setText(String.valueOf(count));
        });
        plusButton.setOnAction(e -> {
            count += currentNumber;
            countLabel.setText(String.valueOf(count));
        });
        minusButton.setOnAction(e -> {
            count -= currentNumber;
            countLabel.setText(String.valueOf(count));
        });

        multiplyButton.setOnAction(e -> {
            count *= currentNumber;
            countLabel.setText(String.valueOf(count));
        });

        divideButton.setOnAction(e -> {
            if (currentNumber != 0) {
                count /= currentNumber;
                countLabel.setText(String.valueOf(count));
            }
        });
        
        // Create layout
        HBox layout = new HBox(10);
        layout.getChildren().addAll(plusButton, 
                                  countLabel, 
                                  minusButton, 
                                  multiplyButton, 
                                  divideButton,
                                  oneButton,
                                  twoButton,
                                  threeButton,
                                  fourButton,
                                  fiveButton,
                                  sixButton,
                                  sevenButton,
                                  eightButton,
                                  nineButton,
                                  zeroButton,
                                  clearButton,
                                  equalsButton);
        
        // Show the stage
        Scene scene = new Scene(layout, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}