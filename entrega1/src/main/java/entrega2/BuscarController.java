package entrega2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

import entrega1.Administrador;
import entrega1.Busqueda;
import entrega1.Mapa;
import entrega1.POI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BuscarController {
	private Stage primaryStage;
	Administrador admin;
	Mapa mapa;
	Usuario user;

	public BuscarController(Usuario usuario, Stage primaryStage) {
		this.primaryStage = primaryStage;
		admin = new Administrador();
		user = usuario;
		mapa = Mapa.getInstance();
	}

	@FXML
	private TextField buscarPOI;

	@FXML
	private TextField direccion;

	@FXML
	private ComboBox<?> nombres;

	@FXML
	void buscar(ActionEvent event) {
		long time_start;
		long time_end;
		time_start = System.currentTimeMillis();
		mapa.buscarPorTextoLibre(buscarPOI.getText());
		time_end = System.currentTimeMillis();
		long tiempoQueTardo = time_end - time_start;

		Busqueda unaBusqueda = new Busqueda();
		time_end = System.currentTimeMillis();
		unaBusqueda.setTagBuscado(buscarPOI.getText());
		unaBusqueda.setFechaDeLaBusqueda(LocalDate.now());
		unaBusqueda.setResultadosDevueltos(nombres.getItems().size());
		unaBusqueda.setUsuario(user);
		unaBusqueda.setDuracionDeConsulta(tiempoQueTardo);
		mapa.addBusqueda(unaBusqueda);
		primaryStage.close();
	}
}
