import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
        String busqueda = lectura.next();
        String direccion = "https://www.omdbapi.com/?i=tt3896198&apikey=c42a82a5&t="+busqueda;

        //1. Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //2. Crear solicitud HTTP GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .GET()
                .build();
        //3. Enviar solicitud y recibir respuesta
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //4. Mostrar el estado de la respuesta y el cuerpo
        System.out.println("Estado: " + response.statusCode());
        System.out.println("Cuerpo: " + response.body() );
    }
}