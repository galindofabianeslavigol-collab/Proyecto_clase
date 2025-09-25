package co.edu.poli.seriviosa.servicios;

import co.edu.poli.actividad3.model.Medicamento;
import java.util.List;

/**
 * Interfaz que define las operaciones CRUD básicas para gestionar medicamentos.
 * 
 * @author Fabian Galindo Rojas
 */
public interface OperacionCrud {

    /**
     * Crea un nuevo medicamento.
     * 
     * @param medicamento Medicamento a crear
     * @return true si la creación fue exitosa; false si no
     */
    boolean crear(Medicamento medicamento);

    /**
     * Actualiza un medicamento existente.
     * 
     * @param medicamento Medicamento con datos actualizados
     * @return true si la actualización fue exitosa; false si no
     */
    boolean actualizar(Medicamento medicamento);

    /**
     * Elimina un medicamento por su serial.
     * 
     * @param serial Serial del medicamento a eliminar
     * @return true si la eliminación fue exitosa; false si no
     */
    boolean eliminar(String serial);

    /**
     * Busca un medicamento por su serial.
     * 
     * @param serial Serial del medicamento a buscar
     * @return El medicamento encontrado o null si no existe
     */
    Medicamento buscar(String serial);

    /**
     * Lista todos los medicamentos almacenados.
     * 
     * @return Lista de medicamentos
     */
    List<Medicamento> listar();
}


