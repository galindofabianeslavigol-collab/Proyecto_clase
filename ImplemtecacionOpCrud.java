package co.edu.poli.seriviosa.servicios;

import co.edu.poli.actividad3.model.Medicamento;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la interfaz OperacionCrud para gestionar Medicamentos.
 * Permite crear, actualizar, eliminar, buscar y listar medicamentos usando una lista en memoria.
 * 
 * @author Fabian Galindo Rojas
 */
public class ImplemtecacionOpCrud implements OperacionCrud {

    private List<Medicamento> medicamentos;

    /**
     * Constructor que inicializa la lista interna de medicamentos.
     */
    public ImplemtecacionOpCrud() {
        this.medicamentos = new ArrayList<>();
    }

    /**
     * Agrega un medicamento a la lista si no existe uno con el mismo serial.
     * 
     * @param medicamento Medicamento a agregar
     * @return true si se agregó exitosamente; false si ya existe un medicamento con el mismo serial
     */
    @Override
    public boolean crear(Medicamento medicamento) {
        if (buscar(medicamento.getSerial()) == null) {
            medicamentos.add(medicamento);
            return true;
        }
        return false;
    }

    /**
     * Actualiza un medicamento existente con los datos del medicamento proporcionado.
     * 
     * @param medicamento Medicamento con datos actualizados
     * @return true si se actualizó correctamente; false si no se encontró el medicamento
     */
    @Override
    public boolean actualizar(Medicamento medicamento) {
        Medicamento existente = buscar(medicamento.getSerial());
        if (existente != null) {
            int index = medicamentos.indexOf(existente);
            medicamentos.set(index, medicamento);
            return true;
        }
        return false;
    }

    /**
     * Elimina un medicamento basado en su serial.
     * 
     * @param serial Serial del medicamento a eliminar
     * @return true si se eliminó correctamente; false si no se encontró el medicamento
     */
    @Override
    public boolean eliminar(String serial) {
        Medicamento medicamento = buscar(serial);
        if (medicamento != null) {
            medicamentos.remove(medicamento);
            return true;
        }
        return false;
    }

    /**
     * Busca un medicamento por su serial.
     * 
     * @param serial Serial del medicamento a buscar
     * @return El medicamento encontrado o null si no existe
     */
    @Override
    public Medicamento buscar(String serial) {
        for (Medicamento m : medicamentos) {
            if (m.getSerial().equalsIgnoreCase(serial)) {
                return m;
            }
        }
        return null;
    }

    /**
     * Devuelve una lista con todos los medicamentos almacenados.
     * 
     * @return Lista de medicamentos
     */
    @Override
    public List<Medicamento> listar() {
        return new ArrayList<>(medicamentos);
    }
}


