
import com.opencsv.*;

import java.io.*;
import java.util.ArrayList;
import java.io.File;

public class CSVRead {
    private FileReader archCSV;
    private CSVReader csvReader;
    private ArrayList<String[]> moviesList;

    public CSVRead() {
        this.archCSV = null;
        this.csvReader = null;
        this.moviesList = new ArrayList<String[]>();
    }

    public ArrayList<String[]> getMoviesList() {
        return moviesList;
    }

    public void FileSize() {
        File archivo = new File("Movie.csv");
        long bytes = archivo.length();
        if (bytes == 0) {
            System.out.println("No se pueden capturar las calificaciones ya que el archivo esta vacio ");
        }
    }

    public void Read_Save_Exceptions() {
        FileSize();
        try {
            // Leo el archivo con el separador estándar ","
            archCSV = new FileReader("Movie.csv");
            csvReader = new CSVReader(archCSV);

            String[] fila = null;
            while ((fila = csvReader.readNext()) != null) {
                System.out.println(fila[0]
                        + " |  " + fila[1]
                        + " |  " + fila[2]
                        + " |  " + fila[3]
                        + " |  " + fila[4]
                        + " |  " + fila[5]
                        + " |  " + fila[6]
                        + " |  " + fila[7]
                        + " |  " + fila[8]
                        + " |  " + fila[9]
                        + " |  " + fila[10]
                        + " |  " + fila[11]);
                moviesList.add(fila);
            }

        }

        catch (FileNotFoundException e) {
            System.out.println("No se pueden capturar las calificaciones ya que el archivo no fue encontrado");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "No se pueden capturar las calificaciones ya que el archivo no tiene las columnas esperadas");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                archCSV.close();
                csvReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}
