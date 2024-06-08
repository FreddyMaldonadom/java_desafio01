package trabajosentregas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    // Constructor con parámetros
    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    // Getters y Setters
    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    // Método para guardar la venta
    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        File directory = new File("ficheros");
        if (!directory.exists()) {
            directory.mkdir();
        }

        String fileName = "ficheros/" + this.nombreVenta + ".txt";
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write("Patente del vehículo: " + vehiculo.getPatente() + "\n");
            writer.write("Edad del cliente: " + cliente.getEdad() + "\n");
            writer.write("Fecha de la venta: " + this.fechaVenta + "\n");
            writer.write("Nombre de venta: " + this.nombreVenta + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Clase Cliente (Asumiendo atributos y métodos)
class Cliente {
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Clase Vehiculo (Asumiendo atributos y métodos)
class Vehiculo {
    private String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
