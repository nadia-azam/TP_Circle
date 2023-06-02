package application;
import javafx.application.Application;



import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	
	// declaration des boutton 
	
		Button AgrondirBtn = new Button ("Agrondir");
		Button DiminuerBtn = new Button ("Diminuer");
		Circle circle = new Circle(50,50,50 ,Color.DARKVIOLET);
		
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			// creation de cercle
			
			// creation des bouttons
			
			
			//
			
			
			
			Group root = new Group();
			Scene scene = new Scene(root,400,400);
			root.getChildren().add(circle);
			root.getChildren().add(DiminuerBtn);
			root.getChildren().add(AgrondirBtn);
			
			
			DiminuerBtn.setLayoutX(70);
			DiminuerBtn.setLayoutY(300);
			AgrondirBtn.setLayoutX(200);
			AgrondirBtn.setLayoutY(300);
			circle.setLayoutX(120);
			circle.setLayoutY(65);
			circle.setStrokeWidth(4);
			circle.setStroke(Color.BLACK);
			
			
			DiminuerBtn.setOnAction(e -> diminuerCircle());
			AgrondirBtn.setOnAction(e -> AgrondirCircle());
			
			
			
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	public void diminuerCircle() {
		if (circle.getRadius()>10) {
		circle.setRadius(circle.getRadius()-10);
		}
	}
	public void AgrondirCircle() {
		circle.setRadius(circle.getRadius()+10);
	}
	
	
	
	
	
	
	
	
}
