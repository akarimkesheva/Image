package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGrid extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        ImageView img1 = new ImageView(new Image("file:/Users/aliyakarimkesheva/IdeaProjects/untitled/image/flag1.gif"));
        ImageView img2 = new ImageView(new Image("file:/Users/aliyakarimkesheva/IdeaProjects/untitled/image/flag2.gif"));
        ImageView img3 = new ImageView(new Image("file:/Users/aliyakarimkesheva/IdeaProjects/untitled/image/flag6.gif"));
        ImageView img4 = new ImageView(new Image("file:/Users/aliyakarimkesheva/IdeaProjects/untitled/image/flag7.gif"));

        img1.setFitWidth(150); img1.setFitHeight(100);
        img2.setFitWidth(150); img2.setFitHeight(100);
        img3.setFitWidth(150); img3.setFitHeight(100);
        img4.setFitWidth(150); img4.setFitHeight(100);

        grid.add(img1, 0, 0);
        grid.add(img2, 1, 0);
        grid.add(img3, 0, 1);
        grid.add(img4, 1, 1);

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("4 Flags Grid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
