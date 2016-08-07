package entrega2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class VistaPrincipalController {
	private Stage primaryStage;
	private Parent rootLayout;
	private Usuario usuario;

	public VistaPrincipalController(Usuario usuario, Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.usuario = usuario;
		System.out.println("Soy el usuario: " + usuario.nombreDeUsuario);
	}

	@FXML
	void crearPOI(ActionEvent event) {
		try {
			Stage stage = new Stage();
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/crearPOI.fxml"));
			loader.setController(new CrearPOIController(stage));
			rootLayout = loader.load();
			stage.setTitle("Creación de Punto De Interés");

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);

			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void eliminarPOI(ActionEvent event) {

		try {
			Stage stage = new Stage();
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/eliminarPOI.fxml"));
			loader.setController(new EliminarPOIController(stage));
			rootLayout = loader.load();
			stage.setTitle("Eliminación de Punto De Interés");

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void consultarPOI(ActionEvent event) {
		try {
			Stage stage = new Stage();
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/consultarPOI.fxml"));
			loader.setController(new BuscarController(usuario, stage));
			rootLayout = loader.load();
			stage.setTitle("Consulta de Punto De Interés");

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void modificarPOI(ActionEvent event) {

		try {
			Stage stage = new Stage();
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/modificarPOI.fxml"));
			loader.setController(new ModificarPOIController(stage));
			rootLayout = loader.load();
			stage.setTitle("Modificación de Punto De Interés");

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
