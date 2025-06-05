package com.cwrightlibrary.scheduler.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainFrame extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Scheduler");

        // Create MenuBar
        MenuBar menuBar = new MenuBar();

        // --- File Menu
        Menu fileMenu = new Menu("File");

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem closeItem = new MenuItem("Close");

        closeItem.setOnAction(e -> {
            primaryStage.close(); // same as System.exit(0) but cleaner
        });

        fileMenu.getItems().addAll(newItem, openItem, saveItem, new SeparatorMenuItem(), closeItem);

        // --- Edit Menu
        Menu editMenu = new Menu("Edit");

        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        editMenu.getItems().addAll(cutItem, copyItem, pasteItem);

        // Add Menus to MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu);

        // Layout with BorderPane
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
