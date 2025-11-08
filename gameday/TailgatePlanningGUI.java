package gameday.gui.tailgate;

import gameday.tailgate.SupplyItem;
import gameday.tailgate.TailgateEvent;
import gameday.tailgate.TailgateManager;
import gameday.application.Application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TailgatePlanningGUI extends Application {

    private TailgateManager manager = new TailgateManager();
    private TextArea eventSummary = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tailgate Planning!");

        // Input fields
        TextField locationField = new TextField();
        locationField.setPromptText("Enter location");

        TextField timeField = new TextField();
        timeField.setPromptText("Enter time");

        Buttton createEvetBtn = new Button("Create Event");

        // Supply inputs
        TextField supplyNameField = new TextField();
        supplyNameField.setPromptText("Supply name");

        TextField supplyQtyField = new TextField();
        supplyQtyField.setPromptText("Quantity");

        Button addSupplyBtn = new Button("Add Supply");

        // Friend input
        TextField friendNameField = new TextField();
        friendNameField.setPrompt("Friend's name");

        Button addFriendBtn = new Button("Add Friend");

        // Summary area
        eventSummary.setEditable(false);
        eventSummary.setPrefHeight(200);

        // Event creation
        createEventBtn.setOnAction(e -> {
            String location = locationField.getText();
            String time = timeField.getText();
            if (!location.isEmpty() && !time.isEmpty()) {
                manager.createEvent(location, time);
                updateSummary();
            }
        });

        // Add supply
        addSupplyBtn.setOnAction(e -> {
            if (manager.hasEvent()) {
                String name = supplyNameField.getText();
                int qty = Integer.parseInt(supplyField.getText());
                manager.getCurrentEvent().addSupply(new SupplyItem(name, qty));
                updateSummary();
            }
        });

        // Add friend
        addFriendBtn.setOnAction(e -> {
            if (manager.hasEvent()) {
                String friend = friendNameField.getText();
                manager.getCurrentEvent().addFriend(friend);
                updateSummary();
            }
        });

        VBox layout = new VBox(10,
            new Label("Create Tailgate Event"),
            locationField, timeField, createEventBtn,
            new Label("Add supplies"), supplyNameField, addFriendBtn,
            new Lable("Invite Friends"), friendNameField, addFriendBtn,
            new Label("Event Summary"), eventSummary);

            layout.setPadding(new Insets(20));

            Scene scene = new Scene(layout, 400, 600);
            

}
